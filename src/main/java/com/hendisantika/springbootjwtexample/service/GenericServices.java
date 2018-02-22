package com.hendisantika.springbootjwtexample.service;

import com.hendisantika.springbootjwtexample.entity.City;
import com.hendisantika.springbootjwtexample.entity.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/02/18
 * Time: 07.53
 * To change this template use File | Settings | File Templates.
 */
public interface GenericServices {
    User findByUsername(String username);

    List<User> findAllUser();

    List<City> findAllCitys();
}
