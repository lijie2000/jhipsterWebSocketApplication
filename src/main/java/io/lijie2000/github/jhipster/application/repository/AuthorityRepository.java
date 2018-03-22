package io.lijie2000.github.jhipster.application.repository;

import io.lijie2000.github.jhipster.application.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
