package test.chapter1.recipe1_04;

/**
 * Project: Java8Recipes
 * FileName: PPMT
 * Date: 2016-10-10
 * Time: 오후 3:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PPMT {
    /**
     * PPMT
     * 정기적으로 일정 금액을 지불하고 일정한 이율이 적용되는 투자액에 대한
     * 주어진 기간 동안의 원금 상환액을 계산합니다.
     *
     * @param   rate   기간당 이율입니다.
     * @param   per    기간으로서, 1에서 Nper까지의 범위에 있어야 합니다.
     * @param   nper   불입 총 횟수입니다.
     * @param   pv     현재 가치(앞으로 지불할 일련의 불입금이 가지고 있는 가치의 총합)입니다.
     * @param   fv     미래 가치 또는 최종 불입 후의 현금 잔고입니다.
     *                 fv를 생략하면 0으로 간주됩니다.
     *                 예를 들어 대출금의 미래 가치는 0입니다.
     * @param   type   0 또는 1로 지불하는 시점을 표시합니다.
     *                 0 : 기말
     *                 1 : 기초
     * @return  double  ppmt
     * @author  ssari
     * @since   2004-10-11
     */
    public static double ppmt(double rate, double per, double nper, double pv, double fv, int type)
    {
        double pmt = PMT.pmt(rate, nper, pv, fv, type);

        double balance = pv; // 미회수원금
        double won = 0; // 원금
        double ija = 0; // 이자

        for (int i = 0; i < per; i++)
        {
            if (i == 0 && type == 1)
            {
                ija = 0;
            }
            else
            {
                ija = - balance * rate;
            }

            won = pmt - ija;
            balance += won;
        }

        return	won;
    }

    public static void main(String[] args)
    {
        double rate = 0.10 / 12;
        double per = 1;
        double nper = 24;
        double pv = 200000;
        double fv = 0;
        int type = 0;
        double amt = PPMT.ppmt(rate, per, nper, pv, fv, type);
        System.out.println(amt); // -\7500

        rate = 0.02/12;
        per = 120;
        nper = 120;
        pv = -10000000;
        fv = 0;
        type = 0;
        amt = PPMT.ppmt(rate, per, nper, pv, fv, type);
        System.out.println(amt); // -\2,759,800

    }

}
