package seatforge.seatforge.security.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import seatforge.seatforge.entity.User;
import seatforge.seatforge.repository.UserRepository;

import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userEntity =
                userRepository
                        .findByUsername(username)
                        .orElseThrow(() -> new UsernameNotFoundException("user " + username + " not found"));

        Set<GrantedAuthority> authorities = Set.of(new SimpleGrantedAuthority("ROLE_" + userEntity.getRole().getName()));


        return UserDetailsImpl.builder()
                .username(userEntity.getUserName())
                .accountNonExpired(true)
                .accountNonLocked(true)
                .credentialsNonExpired(true)
                .enabled(true)
                .password(userEntity.getPassword())
                .authorities(authorities)
                .id(userEntity.getId())
                .build();
    }
}