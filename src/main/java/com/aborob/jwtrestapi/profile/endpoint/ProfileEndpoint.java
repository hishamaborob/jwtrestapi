package com.aborob.jwtrestapi.profile.endpoint;

import com.aborob.jwtrestapi.security.auth.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aborob.jwtrestapi.security.model.UserContext;

@RestController
public class ProfileEndpoint {

    @RequestMapping(value = "/api/me", method = RequestMethod.GET)
    public
    @ResponseBody
    UserContext get(JwtAuthenticationToken token) {

        return (UserContext) token.getPrincipal();
    }
}
