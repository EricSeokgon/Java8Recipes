package chapter7;

/**
 * Project: Java8Recipes
 * FileName: GradeAnalyzer
 * Date: 2016-12-23
 * Time: 오전 9:19
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class GradeAnalyzer {
    private int[] _grades;

    public void set_grades(int[] _grades) {
        this._grades = _grades;
    }

    public int[] get_grades() {
        return _grades != null ? _grades.clone() : null;
    }

}
