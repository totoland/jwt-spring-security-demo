package com.totoland.security.service;

import java.io.Serializable;

/**
 * Created by stephan on 20.03.16.
 */
public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;
    private final String id;
    private final String username;

    public JwtAuthenticationResponse(String token) {
        this.id = "";
        this.token = token;
        this.username = "";
    }

    public JwtAuthenticationResponse(String token, String id, String username) {
        this.token = token;
        this.id = id;
        this.username = username;
    }
    
    

    public String getToken() {
        return this.token;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
