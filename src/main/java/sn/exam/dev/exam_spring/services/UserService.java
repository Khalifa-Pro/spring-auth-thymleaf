package sn.exam.dev.exam_spring.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import sn.exam.dev.exam_spring.controllers.dto.UserRegistrationDto;
import sn.exam.dev.exam_spring.entities.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
