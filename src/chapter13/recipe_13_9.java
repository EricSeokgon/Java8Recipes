package chapter13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Project: Java8Recipes
 * FileName: recipe_13_9
 * Date: 2017-02-09
 * Time: 오전 8:42
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_13_9 {
    private static void queryAndUpdateDbRecipes(String recipeNumber) {
        String sql = "SELECT ID, RECIPE_NUMBER, RECIPE_NAME, DESCRIPTION " +
                "FROM RECIPES " +
                "WHERE RECIPE_NUMBER = ?";
        ResultSet rs = null;
        Connection conn = null;
        try (PreparedStatement pstmt =
                     conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);) {
            pstmt.setString(1, recipeNumber);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String desc = rs.getString(4);
                System.out.println("Updating row" + desc);
                rs.updateString(4, desc + " -- More to come");
                rs.updateRow();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

