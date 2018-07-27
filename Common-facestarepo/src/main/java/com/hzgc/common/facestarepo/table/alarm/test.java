package com.hzgc.common.facestarepo.table.alarm;

/**
 * Created by Administrator on 2018-7-26.
 */
public class test {
    public static void main(String[] args) {
        java.sql.Connection conn = PhoenixJDBCUtil.getPhoenixJdbcConn("jdbc:phoenix:172.18.18.103:2181");
        System.out.println(conn + "+++++++++++");
    }
}
