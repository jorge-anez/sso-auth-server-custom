package st.malike.auth.server.service.impl;

import org.springframework.stereotype.Service;
import st.malike.auth.server.model.Role;
import st.malike.auth.server.repository.GenericDAO;
import st.malike.auth.server.repository.GenericDAOImpl;
import st.malike.auth.server.service.RoleService;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class RoleServiceImpl implements RoleService {
    private GenericDAO roleDAO;
    @PersistenceContext
    private EntityManager entityManager;

    @PostConstruct
    public void init() {
        roleDAO = new GenericDAOImpl(entityManager, Role.class);
        System.out.println("Role Service postconstructor..");
    }
    @Override
    public Role findRole(String role) {

        return null;
    }

    @Override
    public Role findByName(String role_user) {
        Query query = roleDAO.getNamedQuery("getAuthorities");
        query.setParameter("roleName", role_user);
        Role role = (Role) query.getSingleResult();
        return role;
    }
}
