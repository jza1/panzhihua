package com.jz.service.serviceimpl;

import com.jz.dao.material_add_dao;
import com.jz.pojo.material;
import com.jz.service.material_addService;

public class material_addServiceimpl implements material_addService {
    @Override
    public int add(material material) {
        material_add_dao material_add_dao=new material_add_dao();
        int temp=material_add_dao.add(material);
        return temp;
    }
}
