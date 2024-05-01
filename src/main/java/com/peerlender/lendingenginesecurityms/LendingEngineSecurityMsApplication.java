package com.peerlender.lendingenginesecurityms;

import com.peerlender.lendingenginesecurityms.user.model.User;
import com.peerlender.lendingenginesecurityms.user.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingEngineSecurityMsApplication implements CommandLineRunner {

    private final UserRepository userRepository;
    @Autowired
    public LendingEngineSecurityMsApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(LendingEngineSecurityMsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("user1", "password1"));
        userRepository.save(new User("user2", "password2"));
        userRepository.save(new User("user3", "password3"));
    }
}
