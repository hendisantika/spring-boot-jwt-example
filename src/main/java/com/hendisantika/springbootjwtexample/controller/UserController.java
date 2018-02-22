package com.hendisantika.springbootjwtexample.controller;

import com.hendisantika.springbootjwtexample.entity.City;
import com.hendisantika.springbootjwtexample.entity.User;
import com.hendisantika.springbootjwtexample.service.GenericServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/02/18
 * Time: 06.20
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping(value = "/springjwt")
public class UserController {
    @Autowired
    private GenericServices genericServices;

    @GetMapping(value = "/cities")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public ResponseEntity<List<City>> getCity() {
        List<City> citys = genericServices.findAllCitys();
        if (citys.isEmpty()) {
            return new ResponseEntity<List<City>>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<List<City>>(citys, HttpStatus.OK);
    }

    @GetMapping(value = "/users")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<List<User>> getUsers() {
        List<User> userList = genericServices.findAllUser();
        if (userList.isEmpty()) {
            return new ResponseEntity<List<User>>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
    }
}
