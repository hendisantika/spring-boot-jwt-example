package com.hendisantika.springbootjwtexample.service;

import com.hendisantika.springbootjwtexample.entity.City;
import com.hendisantika.springbootjwtexample.entity.User;
import com.hendisantika.springbootjwtexample.repository.CityRepository;
import com.hendisantika.springbootjwtexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/02/18
 * Time: 07.56
 * To change this template use File | Settings | File Templates.
 */

@Service
public class GenericServicesImpl implements GenericServices {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List<City> findAllCitys() {
        return cityRepository.findAll();
    }
}