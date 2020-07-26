package com.example.demo.service.graphQLApis;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloQueryResolver implements GraphQLQueryResolver {
    public String hello(Optional<String> who) {
        return String.format("Hello %s", who.orElse("User"));
    }
}
