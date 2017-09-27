/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.auth.server;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.convert.converter.Converter;
import st.malike.auth.server.config.CustomMongoDBConvertor;

/**
 *
 * @author malike_st
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource({"classpath*:spring-security-oauth2.xml"})
public class AuthServerMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context = SpringApplication.run(AuthServerMain.class, args);
    }
}
