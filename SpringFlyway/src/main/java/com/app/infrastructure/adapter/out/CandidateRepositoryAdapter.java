package com.app.infrastructure.adapter.out;


import com.app.application.ports.out.CandidateRepositoryPort;
import com.app.domain.model.Candidate;
import com.app.infrastructure.repository.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CandidateRepositoryAdapter implements CandidateRepositoryPort {
    private final CandidateRepository repository;

    @Override
    public List<Candidate> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Candidate> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Candidate save(Candidate candidate) {
        return repository.save(candidate);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
