package com.hp.mapper;

import com.hp.pojo.User;
import org.springframework.web.bind.annotation.Mapping;


public interface UserMapper {
    User login(String username);
}
