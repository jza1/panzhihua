package com.jz.service.serviceimpl;

import com.jz.dao.material_delete_dao;
import com.jz.pojo.material;
import com.jz.service.material_deleteService;

public class material_deleteServiceimpl implements material_deleteService {
    @Override
    public int delete(material material) {
        material_delete_dao material_delete_dao = new material_delete_dao();
        int temp = material_delete_dao.delete(material);
        return temp;
    }
}
