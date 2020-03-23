package com.attractor.springsecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.stream.Stream;

//@Configuration
public class PreloadDatabaseWithData {

    //@Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        repository.deleteAll();

        return (args) -> Stream.of(candidates())
                .peek(System.out::println)
                .forEach(repository::save);
    }

    private User[] candidates() {
        return new User[]{
                new User(1, "admin", new BCryptPasswordEncoder().encode("test123")),
                new User(2, "user1", new BCryptPasswordEncoder().encode("123user")),
                new User(3, "guest", new BCryptPasswordEncoder().encode("guest2"))};
    }
}
