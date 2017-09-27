/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server.repository.impl;

import org.springframework.stereotype.Repository;
import st.malike.auth.server.model.User;
import st.malike.auth.server.repository.UserRepositoryCustom;

/**
 *
 * @author malike_st
 */
@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {
    public User findByEmail(String email){
        return null;
    }

    @Override
    public User findOne(String id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
