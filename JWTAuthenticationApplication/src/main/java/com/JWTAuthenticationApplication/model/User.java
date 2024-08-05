package com.JWTAuthenticationApplication.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private String userId;
    private String username;
    private String email;
}
