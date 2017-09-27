/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server.repository;

import st.malike.auth.server.model.User;

import java.io.Serializable;

/**
 *
 * @author malike_st
 */
public interface UserRepositoryCustom {
    User findByEmail(String email);
    User findOne(String id);
    User save(User user);
    void deleteAll();
}
