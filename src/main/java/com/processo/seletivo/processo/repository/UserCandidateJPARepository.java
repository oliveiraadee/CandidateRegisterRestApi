package com.processo.seletivo.processo.repository;

import com.processo.seletivo.processo.entity.UserCandidate;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCandidateJPARepository extends JpaRepository<UserCandidate, Long> {

}
