package com.app.infrastructure.adapter.in;


import com.app.domain.model.Candidate;
import com.app.domain.service.CandidateService;
import com.app.util.JwtService;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.List;

@RestController
@RequestMapping("/candidates")
@RequiredArgsConstructor
public class CandidateController {

    private final CandidateService candidateUseCase;

    private PasswordEncoder passwordEncoder;

    @GetMapping("/findAll")
    public ResponseEntity<List<Candidate>> findAll() {
        return ResponseEntity.ok(candidateUseCase.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Candidate> findById(@PathVariable Long id) {
        return candidateUseCase.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<Candidate> create(@RequestBody Candidate candidate) {
        return ResponseEntity.status(201).body(candidateUseCase.save(candidate));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        candidateUseCase.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @Autowired
    private JwtService jwtUtils;

    @GetMapping("/token")
    public ResponseEntity<String> authenticateUser() {
        // Seteamos valor de nombre de usuario y password de usuario, solo para simular.
        UserDetails user= User.builder()
                .username("omarzb")
                .password("uA1LlNsFRCs0hQPC9lsUVvGVGQiUQfR5zzwVsOWtTVc=")
                .build();

        String jwt =jwtUtils.generateToken(user);
        return ResponseEntity.ok(jwt);
    }
}