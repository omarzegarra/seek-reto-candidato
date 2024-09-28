package com.app.application.ports.in;

import com.app.domain.model.Candidate;

import java.util.List;
import java.util.Optional;

public interface CandidateUseCase {
    List<Candidate> findAll();
    Optional<Candidate> findById(Integer id);
    Candidate save(Candidate candidate);
    void deleteById(Integer id);
}
