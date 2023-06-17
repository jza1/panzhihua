package com.jz.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;//数据库连接池
import javax.sql.DataSource;//连接数据库

    public class Database_connection {
        private  static  ComboPooledDataSource dataSource=  new ComboPooledDataSource();

        public static DataSource getDatasource(){
            return dataSource;
        }
    }
