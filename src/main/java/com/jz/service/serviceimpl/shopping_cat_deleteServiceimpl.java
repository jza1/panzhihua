package com.jz.service.serviceimpl;


import com.jz.dao.shopping_cat_delete_dao;
import com.jz.pojo.shopping_cat;
import com.jz.service.shopping_cat_deleteService;

public class shopping_cat_deleteServiceimpl implements shopping_cat_deleteService {
    @Override
    public int delete(shopping_cat shopping_cat) {
        shopping_cat_delete_dao shopping_cat_delete_dao=new shopping_cat_delete_dao();
        int temp=shopping_cat_delete_dao.delete(shopping_cat);
        return temp;
    }
}
