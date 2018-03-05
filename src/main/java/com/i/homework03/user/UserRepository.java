package com.i.homework03.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface UserRepository extends JpaRepository<User, Long> {
    Collection<User> findByLogin(String bookingName);
}
