package com.processo.seletivo.processo.webservice;//package com.processo.seletivo.processo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.processo.seletivo.processo.entity.UserCandidate;
import com.processo.seletivo.processo.service.UserCandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserCandidateWebService {

    @Autowired
    UserCandidateService userService;

    @GetMapping(value = "/users/{id}", produces="application/json")
    public Optional<UserCandidate> getUser(@PathVariable("id") String id) {
        return userService.getById(Long.parseLong(id));
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
    public UserCandidate createUser(@RequestBody  String user) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        UserCandidate userObject = mapper.readValue(user, UserCandidate.class);
        return userService.save(userObject);
    }

    @PutMapping(value = "/users/{id}", produces="application/json", consumes = "application/json")
    public UserCandidate updateUser(@PathVariable("id") String id, @RequestBody  String user) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        UserCandidate userObject = mapper.readValue(user, UserCandidate.class);
        return userService.update(Long.parseLong(id), userObject);
    }
}

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class UserCandidateWebService {
//
//    @GetMapping("/test")
//    @ResponseBody
//    public String hello() {
//        return "Hello";
//    }
//}
