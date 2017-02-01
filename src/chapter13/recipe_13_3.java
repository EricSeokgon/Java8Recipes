package chapter13;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Project: Java8Recipes
 * FileName: recipe_13_3
 * Date: 2017-02-02
 * Time: 오전 8:47
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_13_3 {
    public static void main(String[] args) {
        String qry = "select recipe_num, name, description from recipes";
        DataSource createConn = null;
        try (Connection conn = createConn.getConnection();
             Statement stmt = conn.createStatement();) {
            ResultSet rs = stmt.executeQuery(qry);
            while (rs.next()) {
                String recipe = rs.getString("RECIPE_NUM");
                String name = rs.getString("NAME");
                String desc = rs.getString("DESCRIPTION");
                System.out.println(recipe + "\t" + name + "\t" + desc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
