package com.aborob.jwtrestapi.security.auth.jwt.verifier;

public interface TokenVerifier {

    public boolean verify(String jti);
}
