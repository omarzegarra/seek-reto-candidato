package com.app.domain.service;


import com.app.domain.model.Candidate;
import com.app.domain.service.CandidateService;
import com.app.infrastructure.repository.CandidateRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CandidateServiceTest {
/*
    @Mock
    private CandidateRepository candidateRepository;

    @InjectMocks
    private CandidateService candidateService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        // Configurar los datos de prueba
        Candidate candidate1 = new Candidate(1, "Omar", "Zambrano");
        Candidate candidate2 = new Candidate(2, "Juan", "Perez");

        when(candidateRepository.findAll()).thenReturn(Arrays.asList(candidate1, candidate2));

        // Ejecutar el método
        List<Candidate> candidates = candidateService.findAll();

        // Verificar
        assertEquals(2, candidates.size());
        assertEquals("Omar", candidates.get(0).getFirstName());
        verify(candidateRepository, times(1)).findAll();
    }

    @Test
    void testFindById() {
        // Configurar los datos de prueba
        Candidate candidate = new Candidate(1, "Omar", "Zambrano");

        when(candidateRepository.findById(1)).thenReturn(Optional.of(candidate));

        // Ejecutar el método
        Optional<Candidate> result = candidateService.findById(1);

        // Verificar
        assertTrue(result.isPresent());
        assertEquals("Omar", result.get().getFirstName());
        verify(candidateRepository, times(1)).findById(1);
    }

    @Test
    void testSave() {
        // Configurar los datos de prueba
        Candidate candidate = new Candidate(1, "Omar", "Zambrano");

        when(candidateRepository.save(candidate)).thenReturn(candidate);

        // Ejecutar el método
        Candidate savedCandidate = candidateService.save(candidate);

        // Verificar
        assertNotNull(savedCandidate);
        assertEquals("Omar", savedCandidate.getFirstName());
        verify(candidateRepository, times(1)).save(candidate);
    }

    @Test
    void testDeleteById() {
        // Ejecutar el método
        candidateService.deleteById(1);

        // Verificar
        verify(candidateRepository, times(1)).deleteById(1);
    }
    */
}