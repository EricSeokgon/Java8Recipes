package chapter13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Project: Java8Recipes
 * FileName: recipe_13_6
 * Date: 2017-02-07
 * Time: 오전 8:35
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe_13_6 {
    public static void main(String[] args) {
        String sql = "SELECT ID, RECIPE_NUMBER, RECIPE_NAME, DESCRIPTION " +
                "FROM RECIPES " +
                "WHERE RECIPE_NUMBER = ?";
        Connection conn = null;
        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
            String recipeNumber = null;
            pstmt.setString(1, recipeNumber);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(2) + ": " + rs.getString(3) +
                        " - " + rs.getString(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
