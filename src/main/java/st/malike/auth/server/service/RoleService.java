package st.malike.auth.server.service;

import org.springframework.stereotype.Service;
import st.malike.auth.server.model.Role;

public interface RoleService {
    Role findRole(String role);

    Role findByName(String role_user);
}
