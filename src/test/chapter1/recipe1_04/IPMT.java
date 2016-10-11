package test.chapter1.recipe1_04;

/**
 * Project: Java8Recipes
 * FileName: IPMT
 * Date: 2016-10-10
 * Time: 오후 3:58
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class IPMT {
    /**
     * IPMT
     * 일정 금액을 정기적으로 납입하고 일정한 이율이 적용되는 투자에 대한
     * 주어진 기간 동안의 이자를 계산합니다.
     *
     * @param   rate   기간당 이율입니다.
     * @param   per    이자를 계산할 기간으로 1과 Nper사이의 값이어야 합니다.
     * @param   nper   납입금 상환의 총 횟수입니다.
     * @param   pv     현재 가치 또는 앞으로 지급할 일련의 납입금의 현재 가치를 나타내는 총액입니다.
     * @param   fv     미래 가치 또는 최종 불입금을 지불한 후의 현금 잔고로서
     *                 fv를 생략하면 0(예를 들어 대출금의 미래 가치는 0)으로 간주됩니다.
     * @param   type   0 또는 1로 지불하는 시점을 표시합니다.
     *                 0 : 기말
     *                 1 : 기초
     * @return  double  ipmt
     * @author  ssari
     * @since   2004-10-11
     */
    public static double ipmt(double rate, double per, double nper, double pv, double fv, int type)
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

        return	ija;
    }

    public static void main(String[] args)
    {
        double rate = 0.02 / 12;
        double per = 1;
        double nper = 120;
        double pv = -10000000;
        double fv = 0;
        int type = 0;
        double amt = IPMT.ipmt(rate, per, nper, pv, fv, type);
        System.out.println(Math.round(amt)); // -\6,600

        rate = 0.1;
        per = 3;
        nper = 3;
        pv = 800000;
        fv = 0;
        type = 0;
        amt = IPMT.ipmt(rate, per, nper, pv, fv, type);
        System.out.println(amt); // -\29,200

    }

}
