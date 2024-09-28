package com.app.domain.service;

import com.app.application.ports.out.CandidateRepositoryPort;
import com.app.domain.model.Candidate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CandidateService {

    private final CandidateRepositoryPort repositoryPort;

    public List<Candidate> findAll() {
        return repositoryPort.findAll();
    }

    public Optional<Candidate> findById(Long id) {
        return repositoryPort.findById(id);
    }

    public Candidate save(Candidate candidate) {
        return repositoryPort.save(candidate);
    }

    public void deleteById(Long id) {
        repositoryPort.deleteById(id);
    }
}

