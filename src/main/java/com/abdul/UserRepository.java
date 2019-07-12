package com.abdul;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author by AbdulQader
 * on 12/7/2019.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
