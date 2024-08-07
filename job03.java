package day04;
import java.util.Scanner;
public class job03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入顾客类别(0表示普通顾客，1表示会员顾客): ");
        int i = scan.nextInt();
        if (i == 0) {
            System.out.println("请输入购物金额 :");
            Double jiage = scan.nextDouble();
            if (jiage < 100) {
                System.out.println(jiage);
            }
            if (jiage > 100) {
                System.out.println(jiage * 0.9);
            }
        }
        if (i == 1) {
            System.out.println("请输入购物金额 :");
            Double jiage = scan.nextDouble();
            if (jiage < 200) {
                System.out.println(jiage * 0.8);
            }
            if (jiage > 200) {
                System.out.println(jiage * 0.75);
            }
        }
    }
}

