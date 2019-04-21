package com.hp.pojo;

import java.io.Serializable;
import java.util.List;

public class PageBean implements Serializable {
    //当前页
    private int pageCode;
    //总页数 = 总条数/每页显示条数
    private int totalPage;
    //总记录数
    private int totalCount;
    //每页显示数
    private int pagesize;
    //每页显示的数据
    /*
    这里用了自定义泛型类<T>就是实现由后台决定这个分页Bean要去封装那种类型的数据，我们调用时传入类型就会封装什么类型数据。
    比如我们需要对Customer分页，在调用这个类是就写new PageBean<Customer>()。那么数据就会强制绑定为这个Customer类的数据。
     */
    private List beanList;
}
