package com.aborob.jwtrestapi.security.auth.jwt.extractor;

public interface TokenExtractor {

    public String extract(String payload);
}
