package com.processo.seletivo.processo.webservice;//package com.processo.seletivo.processo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.processo.seletivo.processo.entity.CamundaRequest;
import com.processo.seletivo.processo.entity.CamundaResponse;
import com.processo.seletivo.processo.entity.Link;
import com.processo.seletivo.processo.entity.UserCandidate;
import com.processo.seletivo.processo.service.CamundaResponseService;
import com.processo.seletivo.processo.service.UserCandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserCandidateWebService {

    @Autowired
    UserCandidateService userService;

    @Autowired
    CamundaResponseService camundaResponseService;

    @GetMapping(value = "/users/{id}", produces="application/json")
    public CamundaResponse getUser(@PathVariable("id") String id) {
        Optional<UserCandidate> us = userService.getById(Long.parseLong(id));
        CamundaResponse camundaResponseNew = new CamundaResponse();
        List<Link> links = new ArrayList<>();
        links.add(new Link("GET", "http://localhost:8080/users/"+id, "self" ));
        camundaResponseNew.setLinks(links);
        camundaResponseNew.setVariables(us.get());
        return camundaResponseNew;
    }

    @DeleteMapping(value = "/users/{id}")
    public void deleteUser(@PathVariable("id") String id) {
        userService.remove(Long.parseLong(id));
    }

    @GetMapping(value = "/users", produces="application/json")
    public List<UserCandidate> getAll() {
        return userService.getAll();
    }

    @PostMapping(value="/users", produces="application/json", consumes = "application/json")
    public CamundaResponse createUser(@RequestBody String request) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        CamundaRequest camundaRequest = mapper.readValue(request, CamundaRequest.class);
        UserCandidate candidate = userService.save(camundaRequest.getVariables());
        CamundaResponse camundaResponseNew = new CamundaResponse();
        camundaResponseNew.setBusinessKey((camundaRequest.getBusinessKey()));
        camundaResponseNew.setSuspended(false);
        camundaResponseNew.setEnded(false);
        camundaResponseNew.setId(candidate.getId());
        camundaResponseService.save(camundaResponseNew);
        List<Link> links = new ArrayList<>();
        links.add(new Link("POST", "http://localhost:8080/users", "self" ));
        camundaResponseNew.setLinks(links);
        camundaResponseNew.setVariables(candidate);
        return camundaResponseNew;
    }

    @PutMapping(value = "/users/{id}", produces="application/json", consumes = "application/json")
    public UserCandidate updateUser(@PathVariable("id") String id, @RequestBody  String user) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        UserCandidate userObject = mapper.readValue(user, UserCandidate.class);
        return userService.update(Long.parseLong(id), userObject);
    }
}
