package q2;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======= 소수 판별기 =======");
            System.out.print("숫자를 입력하세요 (101: 종료): ");
            int number = scanner.nextInt();

            if (1 <= number && number <= 101) {
                if (number == 101) {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }

                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(number + "은 소수입니다.");
                } else {
                    System.out.println(number + "은 소수가 아닙니다.");
                }

            } else {
                System.out.println("입력 범위를 초과했습니다.");
                continue;
            }
        }

    }
}
