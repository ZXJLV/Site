package cn.demo02.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class BaseDao {
    public static String driver; // 数据库驱动

    public static String url; // url

    public static String user; // 数据库用户名

    public static String password; // 数据库密码

    static {//静态代码块,在类加载的时候执行
        init();
    }

    public static void init() {
        String configFile = "database.properties";//配置文件路径
        //加载配置文件到输入流中
        InputStream is = BaseDao.class.getClassLoader().getResourceAsStream(configFile);
        Properties params = null;
        try {

            params = new Properties();
            //从输入流中读取属性列表
            params.load(is);

            /*
            driver=com.mysql.jdbc.Driver
url=jdbc\:mysql\://localhost\:3306/t1?useUnicode\=true&characterEncoding\=UTF-8
user=root
password=root
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
        //根据指定的获取对应的值
        driver = params.getProperty("driver");
        url = params.getProperty("url");
        user = params.getProperty("user");
        password = params.getProperty("password");
        String name = params.getProperty("name");
    }

    /**
     * 得到数据库连接
     *
     * @return 数据库连接
     * @throws ClassNotFoundException
     * @throws SQLException
     */

    public static Connection getConn() throws ClassNotFoundException, SQLException {

        Connection conn = null;
        try {
            Class.forName(driver); // 注册驱动
            conn = DriverManager.getConnection(url, user, password); // 获得数据库连接
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn; // 返回连接
    }

    public static void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) {

        /* 如果rs不空，关闭rs */
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        /* 如果pstmt不空，关闭pstmt */
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        /* 如果conn不空，关闭conn */
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    //简便增,删,改
    public static int updateBuffer(String sql,Object[] objects) throws SQLException, ClassNotFoundException {
        Connection conn = getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        if(objects != null){
            for (int i = 0;i < objects.length;i++){
                ps.setObject(i+1,objects[i]);
            }
        }

        int row = ps.executeUpdate();
        closeAll(conn,ps,null);
        System.err.println("sql: " + ps);
        return row;
    }

}
