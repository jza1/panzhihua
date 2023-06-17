package com.jz.dao;

import com.jz.pojo.information;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class information_add_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int add(information information) {
        int update;
        String sql="INSERT INTO information (information,cusomer_id) VALUES(?,?)";
        Object[] params={information.getInformation(),information.getCusomer_id()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return 1;
    }
}
