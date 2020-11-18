package sinanaj.aldo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import sinanaj.aldo.model.User;
import sinanaj.aldo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
@AllArgsConstructor
@Slf4j
public class UserController {

    private final UserRepository userRepository;

    @PostMapping(path = "/users")
    public User create(@RequestBody User user) {
        log.debug("Input: {}", user);
        final User savedUser = userRepository.save(user);
        log.debug("Saved user: {}", savedUser);
        return savedUser;
    }

    @GetMapping(path = "/users/{id}")
    public User get(@PathVariable String id) {
        return userRepository.findById(id).orElse(null);
    }
}
