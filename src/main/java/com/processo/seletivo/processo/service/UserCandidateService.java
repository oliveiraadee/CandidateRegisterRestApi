package com.processo.seletivo.processo.service;

import com.processo.seletivo.processo.repository.UserCandidateJPARepository;
import com.processo.seletivo.processo.entity.UserCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserCandidateService {
    private final UserCandidateJPARepository userCandidateRepository;

    public UserCandidateService(UserCandidateJPARepository userCandidateRepository) {
        this.userCandidateRepository = userCandidateRepository;
    }

    public Optional<UserCandidate> getById(Long id){
        Optional<UserCandidate> userCandidate = userCandidateRepository.findById(id);

        if(userCandidate == null){
            throw new RuntimeException("User not found");
        }
        return userCandidate;
    }

    public List<com.processo.seletivo.processo.entity.UserCandidate> getAll(){
        List<UserCandidate> userCandidates = (List<UserCandidate>) userCandidateRepository.findAll();

        if(userCandidates == null){
            throw new RuntimeException("User not found");
        }
        return userCandidates;
    }
    public UserCandidate save(UserCandidate userCandidate){

        return userCandidateRepository.save(userCandidate);
    }
    public void remove(Long id){
         userCandidateRepository.deleteById(id);
    }
    public UserCandidate update(Long id, UserCandidate userCandidate){

        Optional<UserCandidate> userCandidate1 = userCandidateRepository.findById(id);

        if(userCandidate1 != null){
            userCandidate.setId(id);
            userCandidateRepository.save(userCandidate);
        }
        return userCandidate;
    }
}
