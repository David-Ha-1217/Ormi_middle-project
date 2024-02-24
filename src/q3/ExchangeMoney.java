package q3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExchangeMoney {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 환율 정보 (2024년 2월 24일 기준)
        // 달러: 1$ = 1332.50원
        // 엔화: 100엔 = 885.32원
        final double USD_KRW = 1332.50;
        final double JPY_KRW = 885.32;

        System.out.print("원(KRW) = ");
        int krw = scanner.nextInt();

        double usd = krw / USD_KRW;
        double jpy = krw * 100 / JPY_KRW;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.printf("달러($) = %s / JPY = %s\n", df.format(usd), df.format(jpy));
    }
}
