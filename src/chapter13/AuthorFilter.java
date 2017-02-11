package chapter13;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;
import java.sql.SQLException;

/**
 * Created by hadeslee on 2017-02-12.
 */
public class AuthorFilter implements Predicate {

    private String[] authors;
    private String colName = null;
    private int colNumber = -1;

    @Override
    public boolean evaluate(RowSet rs) {
        return false;
    }

    @Override
    public boolean evaluate(Object value, int column) throws SQLException {
        return false;
    }

    @Override
    public boolean evaluate(Object value, String columnName) throws SQLException {
        return false;
    }
}
