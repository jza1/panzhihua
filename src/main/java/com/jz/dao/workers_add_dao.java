package com.jz.dao;

import com.jz.pojo.User;
import com.jz.pojo.workers;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class workers_add_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int add(workers workers) {
        int update;
        String sql="INSERT INTO workers (workersId,workersN,workersSal,workersTelephone,workersName,workersPassword,typ) VALUES(?,?,?,?,?,?,?)";
        Object[] params={workers.getWorkersId(),workers.getWorkersN(),workers.getWorkersSal(),workers.getWorkersTelephone(),workers.getWorkersName(),workers.getWorkersPassword(),workers.getTyp()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return update;
    }
}
