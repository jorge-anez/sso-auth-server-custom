/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server.repository.impl;

import org.springframework.stereotype.Repository;
import st.malike.auth.server.model.ClientDetail;
import st.malike.auth.server.repository.ClientDetailRepositoryCustom;

import java.util.List;

/**
 *
 * @author malike_st
 */
@Repository
public class ClientDetailRepositoryCustomImpl implements ClientDetailRepositoryCustom {
    public ClientDetail findByClientId(String clientId) {
        return null;
    }

    @Override
    public ClientDetail save(ClientDetail clientDetails) {
        return null;
    }


    @Override
    public void delete(ClientDetail clientDetails) {

    }

    @Override
    public List<ClientDetail> findAll() {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
