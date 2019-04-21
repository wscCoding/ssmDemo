package com.hp.service;

import com.hp.pojo.Customer;
import com.hp.pojo.PageBean;

public interface ICustomerService {
    /**
     * 分页查询
     * @param customer 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Customer customer, int pageCode , int pageSize);
}
