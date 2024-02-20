package com.esprit.backend.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
<<<<<<< HEAD
=======
import java.util.Collection;
>>>>>>> 31ee5a0984642deb5cb7dac28098db210e379318
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class User implements UserDetails {
    @Id
    @GeneratedValue
    private Long id;
<<<<<<< HEAD
    private  String firstname;
    private String lastname;

=======
    private String firstname;
    private String lastname;
>>>>>>> 31ee5a0984642deb5cb7dac28098db210e379318
    private String studentClass;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

<<<<<<< HEAD
    @OneToMany(mappedBy="User",
            cascade={CascadeType.PERSIST, CascadeType.REMOVE},
            fetch=FetchType.EAGER)
    private List<Reclamation> reclamation;

=======
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
>>>>>>> 31ee5a0984642deb5cb7dac28098db210e379318
}
