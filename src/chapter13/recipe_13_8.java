package chapter13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Project: Java8Recipes
 * FileName: recipe_13_8
 * Date: 2017-02-08
 * Time: 오전 8:36
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_13_8 {

    private static void queryDbRecipes() {
        String sql = "SELECT ID, RECIPE_NUMBER, RECIPE_NAME, DESCRIPTION " +
                "FROM RECIPES";
        Connection conn = null;
        try (PreparedStatement pstmt = conn.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = pstmt.executeQuery()) {
            rs.first();
            System.out.println(rs.getString(2) + ": " + rs.getString(3) +
                    " - " + rs.getString(4));
            rs.next();
            System.out.println(rs.getString(2) + ": " + rs.getString(3) +
                    " - " + rs.getString(4));
            rs.previous();
            System.out.println(rs.getString(2) + ": " + rs.getString(3) +
                    " - " + rs.getString(4));
            rs.last();
            System.out.println(rs.getString(2) + ": " + rs.getString(3) +
                    " - " + rs.getString(4));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

