package com.peerlender.lendingenginesecurityms.user.model.repository;

import com.peerlender.lendingenginesecurityms.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
