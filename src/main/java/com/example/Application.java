/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.apache.directory.api.ldap.model.exception.LdapException;
import org.apache.directory.server.core.DefaultDirectoryService;

/**
 *
 * @author Erik
 */
public class Application {

    private DefaultDirectoryService service;

    public static void main(String[] args) throws Exception {
        Application application = new Application();

        application.start();
    }

    public void configureServer() throws Exception {
    }

    public void start() throws LdapException  {
        service = new DefaultDirectoryService();
        service.startup();

    }

    public void stop() throws Exception {
        if (service != null && service.isStarted()) {
            service.shutdown();
        }
    }
}
