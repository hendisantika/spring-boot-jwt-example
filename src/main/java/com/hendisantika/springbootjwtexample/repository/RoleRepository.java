package com.hendisantika.springbootjwtexample.repository;

import com.hendisantika.springbootjwtexample.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/02/18
 * Time: 07.51
 * To change this template use File | Settings | File Templates.
 */

@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role, Integer> {
}