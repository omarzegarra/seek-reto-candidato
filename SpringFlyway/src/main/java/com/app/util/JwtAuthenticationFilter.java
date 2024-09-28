package com.app.util;


import java.io.IOException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtService jwtUtils;
    private final UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String authorizationHeader = request.getHeader("Authorization");
        String username = null;
        String token = null;
        System.out.println("AuthorizationHeader: " + authorizationHeader);
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            token = authorizationHeader.substring(7);
            username = jwtUtils.extractUsername(token);// extractUsername(token);
            System.out.println("username: " + username);
            System.out.println("token: " + token);
        }

        System.out.println("usernameOUT: " + username);

        System.out.println("Current Authentication: " + SecurityContextHolder.getContext().getAuthentication());

        if ((username != null) && (SecurityContextHolder.getContext().getAuthentication() == null)) {

            UserDetails userDetails = userDetailsService.loadUserByUsername(username);

            System.out.println("-----------Valido TOKEN--INICIO-----------");
            System.out.println("Token Valid: " + jwtUtils.isTokenValid(token, userDetails));

            if (jwtUtils.isTokenValid(token, userDetails)) { // validateToken(token, "omarzb")) {
                UsernamePasswordAuthenticationToken authenticationToken =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                // Establecer la autenticación en el contexto de Spring Security
                SecurityContextHolder.getContext().setAuthentication(authenticationToken);

            }
        }
            filterChain.doFilter(request, response);
        }



}
