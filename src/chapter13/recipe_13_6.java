package chapter13;

import java.sql.PreparedStatement;

/**
 * Created by hadeslee on 2017-02-04.
 */
public class recipe_13_6 {
    public static void main(String[] args) {
        String sql = "SELECT ID, RECIPE_NUMBER, RECIPE_NAME, DESCRIPTION " +
                "FROM RECIPES " +
                "WHERE RECIPE_NUMBER = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, recipeNumber);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(2) + ": " + rs.getString(3) +
                        " - " + rs.getString(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String sql = "INSERT INTO RECIPES VALUES(" +
                "NEXT VALUE FOR RECIPES_SEQ, ?,?,?,?)";
        try(PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, recipeNumber);
            pstmt.setString(2, title);
            pstmt.setString(3, description);
            pstmt.setString(4, text);
            pstmt.executeUpdate();
            System.out.println("Record successfully inserted.");
        } catch (SQLException ex){
            ex.printStackTrace();
        }

        String sql = "DELETE FROM RECIPES WHERE " +
                "RECIPE_NUMBER = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, recipeNumber);
            pstmt.executeUpdate();
            System.out.println("Recipe " + recipeNumber + " successfully deleted.");
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
