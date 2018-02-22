package com.hendisantika.springbootjwtexample.repository;

import com.hendisantika.springbootjwtexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/02/18
 * Time: 07.52
 * To change this template use File | Settings | File Templates.
 */

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}