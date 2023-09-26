package dev.ilyasspringsecurity.securityvol2.services;

import dev.ilyasspringsecurity.securityvol2.models.ApplicationUser;
import dev.ilyasspringsecurity.securityvol2.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!username.equals("ilyas"))
            throw new UsernameNotFoundException("not ilyas");

        Set<Role> roles =new HashSet<>();
        roles.add(new Role(1,"USER"));

        return new ApplicationUser(1,"USER",passwordEncoder.encode("password"),roles);
    }
}
