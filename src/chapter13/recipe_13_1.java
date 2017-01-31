package chapter13;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Project: Java8Recipes
 * FileName: recipe_13_1
 * Date: 2017-02-01
 * Time: 오전 8:36
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_13_1 {
    public Connection getDSConnection() {
        Connection conn = null;
        try {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("jdbc/myOracleDS");
            conn = ds.getConnection();
        } catch (NamingException | SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}
