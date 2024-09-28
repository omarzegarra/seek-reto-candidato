package com.app.infrastructure.repository;


import com.app.domain.model.Candidate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CandidateRepositoryTest {
/*
    @Autowired
    private CandidateRepository candidateRepository;

    @BeforeEach
    void setUp() {
        candidateRepository.deleteAll();
    }

    @Test
    void testSaveAndFindById() {
        Candidate candidate = new Candidate(1, "John Doe", "john@example.com","masculino","300","developer","inge");
        Candidate savedCandidate = candidateRepository.save(candidate);

        Optional<Candidate> foundCandidate = candidateRepository.findById((long) savedCandidate.getId());

        assertTrue(foundCandidate.isPresent());
        assertEquals("John Doe", foundCandidate.get().getFullName());
    }

    @Test
    void testFindAll() {
        Candidate candidate1 = new Candidate(1, "John Doe", "john@example.com","masculino","300","developer","inge");
        Candidate candidate2 = new Candidate(2, "John Doe", "john@example.com","masculino","300","developer","inge");
        candidateRepository.save(candidate1);
        candidateRepository.save(candidate2);

        List<Candidate> candidates = candidateRepository.findAll();

        assertEquals(2, candidates.size());
    }

    @Test
    void testDeleteById() {
        Candidate candidate = new Candidate(1, "John Doe", "john@example.com","masculino","300","developer","inge");
        Candidate savedCandidate = candidateRepository.save(candidate);
        candidateRepository.deleteById((long)savedCandidate.getId());

        Optional<Candidate> foundCandidate = candidateRepository.findById((long)savedCandidate.getId());
        assertFalse(foundCandidate.isPresent());
    }
    */

}
