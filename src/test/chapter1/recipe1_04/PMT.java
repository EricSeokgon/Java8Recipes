package test.chapter1.recipe1_04;

/**
 * Project: Java8Recipes
 * FileName: PMT
 * Date: 2016-10-10
 * Time: 오후 3:49
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PMT {
    /**
     * PMT
     * 정기적으로 불입하고 일정한 이율이 적용되는 대출에 대해 매회 불입액을 계산합니다.
     *
     * @param   rate   기간당 이율입니다.
     * @param   nper   대출 불입의 총 횟수입니다.
     * @param   pv     현재 가치나 앞으로 지불할 일련의 불입금이 현재 가지고
     *                 있는 가치의 총합(원금)입니다.
     * @param   fv     미래 가치 또는 최종 불입 후의 현금 잔고입니다.
     *                 fv를 생략하면 0으로 간주됩니다.
     *                 즉, 대출금의 미래 가치는 0입니다.
     * @param   type   0 또는 1로 지불하는 시점을 표시합니다.
     *                 0 : 기말
     *                 1 : 기초
     * @return  double  pmt
     * @author  ssari
     * @since   2004-10-11
     */
    public static double pmt(double rate, double nper, double pv, double fv, int type)
    {
        double amt = 0;

        if (rate == 0)
        {
            amt = (- pv - fv) / nper;
        }
        else
        {
            amt = (- fv * rate - pv * rate * Math.pow(1 + rate, nper))
                    / ((1 + rate * type) * (Math.pow(1 + rate, nper) - 1));
        }

        return	amt;
    }

    public static void main(String[] args)
    {
        double rate = 0.02 / 12;
        double nper = 120;
        double pv = 10000000;
        double fv = 0;
        int type = 0;
        double amt = PMT.pmt(rate, nper, pv, fv, type);
        System.out.println(amt); // -\103,700

        rate = 0.08 / 12;
        nper = 10;
        pv = 1000000;
        fv = 0;
        type = 1;
        amt = PMT.pmt(rate, nper, pv, fv, type);
        System.out.println(amt); // -$103,000

        rate = 0.12 / 12;
        nper = 5;
        pv = -500000;
        fv = 0;
        type = 0;
        amt = PMT.pmt(rate, nper, pv, fv, type);
        System.out.println(amt); // \103,000

        rate = 0.06 / 12;
        nper = 18 *12;
        pv = 0;
        fv = 5000000;
        type = 0;
        amt = PMT.pmt(rate, nper, pv, fv, type);
        System.out.println(amt); // -\12,900
    }

}
