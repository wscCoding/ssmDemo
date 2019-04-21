package com.hp.controller;

import com.hp.pojo.Customer;
import com.hp.service.ICustomerService;
import com.hp.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    /**
     * 注入service层
     * 使用@Resource和@Autowired都可以实现Bean的自动注入
     */
    @Autowired
    private CustomerServiceImpl customerService;

    /**
     * 跳转到添加客户功能页面
     */
    @RequestMapping(value = "/toSavePage")
    public String toSavePage(Model model){
        return "page/save";
    }

    /**
     * 跳转到客户列表页面
     */
    @RequestMapping(value = "toListPage")
    public String toListPage(Model model){
        return  "redirect:findByPage.do";
    }

    /**
     * 客户信息保存
     *
     * @param customer
     * @param model
     * @return
     */
    @RequestMapping(value = "save")
    public String create(Customer customer,Model model){
        customerService.
    }
}
