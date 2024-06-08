/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        config.setServerUrl("http://miapi.com");
        config.setPort(8080);
        
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto: " + config.getPort());
        
        // Más propiedades de configuración
    }
}

