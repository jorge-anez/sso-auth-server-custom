package st.malike.auth.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import st.malike.auth.server.model.Authority;
import st.malike.auth.server.model.Role;
import st.malike.auth.server.model.User;
import st.malike.auth.server.service.RoleService;
import st.malike.auth.server.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by JORGE-HP on 10/6/2017.
 */
//@Service("userDetailsService")
@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    //@Autowired
    //private UserRepository userRepository;

    @Autowired
    private UserService userService;

    //@Autowired
    //private MessageSource messages;

    @Autowired
    private RoleService roleService;

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userService.findByEmail(email);
        if (user == null) {
            return new org.springframework.security.core.userdetails.User("", "", true, true, true, true,
                    getAuthorities(Arrays.asList(roleService.findByName("ROLE_USER"))));
        }

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(), user.getEnabled(), true, true,
                true, getAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(Collection<Role> roles) {
        return getGrantedAuthorities(getPrivileges(roles));
    }

    private List<String> getPrivileges(Collection<Role> roles) {

        List<String> privileges = new ArrayList<String>();
        List<Authority> collection = new ArrayList<>();
        for (Role role : roles) {
            collection.addAll(role.getAuthorities());
        }
        for (Authority item : collection) {
            privileges.add(item.getName());
        }
        return privileges;
    }

    private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (String privilege : privileges) {
            authorities.add(new SimpleGrantedAuthority(privilege));
        }
        return authorities;
    }
}
