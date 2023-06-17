package com.jz.dao;

import com.jz.pojo.User;
import com.jz.pojo.workers;
import com.jz.util.Database_connection;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class workers_alter_dao {
    private QueryRunner qr  = new QueryRunner(Database_connection.getDatasource());
    public int alter(workers workers) {
        int update;
//        workers workers=null;
        String sql="UPDATE workers SET workersN=?,workersSal=?,workersTelephone=?,workersName=?,workersPassword=?where workersId=?";
        Object[] params={workers.getWorkersN(),workers.getWorkersSal(),workers.getWorkersTelephone(),workers.getWorkersName(),workers.getWorkersPassword(),workers.getWorkersId()};
        try {
            update = qr.update(sql, params);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
//        if(workers.getWorkersPassword().equals(workersPassword)&&workers.getWorkersName().equals(workersName)){
//            update=0;
//        }
        return update;
    }
//    public boolean select(String workersId) {
//        workers workers=null;
//        String sql= "select * from workers where workersId=?";//查询user表中username
//        try {
//            workers = qr.query(sql, new BeanHandler<workers>(workers.class), workersId);//执行SQL语句
//        } catch (SQLException sqlException) {
//            sqlException.printStackTrace();
//        }
//
//        if (workers!=null){
//                return true;
//            }else {
//                return false;
//            }
//        }
}
