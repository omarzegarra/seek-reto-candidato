package com.app.application.ports.out;


import com.app.domain.model.Candidate;

import java.util.List;
import java.util.Optional;

public interface CandidateRepositoryPort {
    List<Candidate> findAll();
    Optional<Candidate> findById(Long id);
    Candidate save(Candidate candidate);
    void deleteById(Long id);
}