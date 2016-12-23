package chapter7;

import java.util.Arrays;

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

    public int meanGrade() {
        int mean = 0;
        if (_grades != null && _grades.length > 0) {
            int sum = 0;
            for (int i = 0; i < _grades.length; i++) {
                sum += _grades[i];
            }
            mean = sum / _grades.length;
        }
        return mean;
    }

    public void sort() {
        Arrays.sort(_grades);
    }

    public int minGrade() {
        int min = 0;
        if (_grades != null && _grades.length > 0) {
            sort();
            min = _grades[0];
        }
        return min;
    }

    public int maxGrade() {
        int max = 0;
        if (_grades != null && _grades.length > 0) {
            sort();
            max = _grades[_grades.length - 1];
        }
        return max;
    }

    static int[] initGrades1() {
        int[] grades = new int[5];
        grades[0] = 77;
        grades[1] = 48;
        grades[2] = 69;
        grades[3] = 92;
        grades[4] = 87;
        return grades;
    }

    static int[] initGrades2() {

        int[] grades = {57, 88, 67, 95, 74, 81};
        return grades;
    }

    static int[] initGrades3() {
        return new int[]{100, 70, 55, 89, 97, 82};
    }

    public static void main(String[] args) {
        GradeAnalyzer ga = new GradeAnalyzer();
        ga.set_grades(initGrades1());
        System.out.println("Grades 1:");
        System.out.println("MEan of all grades is " + ga.meanGrade());
        System.out.println("Min grade is " + ga.minGrade());
        System.out.println("Max grade is " + ga.maxGrade());

    }

}
