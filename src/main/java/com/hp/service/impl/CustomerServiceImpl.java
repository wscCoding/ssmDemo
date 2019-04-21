package com.hp.service.impl;

import com.hp.mapper.UserMapper;
import com.hp.pojo.Customer;
import com.hp.pojo.PageBean;
import com.hp.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public PageBean findByPage(Customer customer, int pageCode, int pageSize) {
        return null;
    }
}
