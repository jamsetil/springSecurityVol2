package dev.ilyasspringsecurity.securityvol2.repository;

import dev.ilyasspringsecurity.securityvol2.models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<ApplicationUser,Integer> {
    Optional<ApplicationUser> findbyUsername(String username);
}
