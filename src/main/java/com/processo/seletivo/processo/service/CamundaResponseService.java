package com.processo.seletivo.processo.service;

import com.processo.seletivo.processo.entity.CamundaRequest;
import com.processo.seletivo.processo.entity.CamundaResponse;
import com.processo.seletivo.processo.entity.UserCandidate;
import com.processo.seletivo.processo.repository.CamundaResponseJPARepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CamundaResponseService {
    private final CamundaResponseJPARepository camundaResponseRepository;

    public CamundaResponseService(CamundaResponseJPARepository camundaResponseRepository) {
        this.camundaResponseRepository = camundaResponseRepository;
    }

    public List<com.processo.seletivo.processo.entity.CamundaResponse> getAll(){
        List<CamundaResponse> camundaResponse= (List<CamundaResponse>) camundaResponseRepository.findAll();

        if(camundaResponse == null){
            throw new RuntimeException("User not found");
        }
        return camundaResponse;
    }

    public Optional<CamundaResponse> getById(Long id){
        Optional<CamundaResponse> camundaResponse = camundaResponseRepository.findById(id);

        if(camundaResponse == null){
            throw new RuntimeException("User not found");
        }
        return camundaResponse;
    }
    public CamundaResponse save(CamundaResponse camundaResponse) {
        return camundaResponseRepository.save(camundaResponse);
    }

    public CamundaResponse update(Long id, CamundaResponse camundaResponse){

        Optional<CamundaResponse> camundaResponse1 = camundaResponseRepository.findById(id);

        if(camundaResponse1 != null){
            camundaResponse.setId(id);
            camundaResponseRepository.save(camundaResponse);
        }
        return camundaResponse;
    }
}
