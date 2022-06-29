package com.traniningapps.userms.repo;

import com.traniningapps.userms.entity.Role;
import com.traniningapps.userms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
