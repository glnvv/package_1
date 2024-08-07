package day04;

import java.util.Scanner;

public class job4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入您的税前工资: ");
            int i = scan.nextInt();
            double k = i - 0.1 * i - 5000;
            if (k < 0) {
                System.out.println("个人所得税0元 ");
                System.out.println("税后工资: " + i);
            }
            if (k > 0 && k < 3000) {
                double l = i * 0.03;
                System.out.println("个人所得税" + l + "元");
                System.out.println("税后工资: " + (i - l));
            }
            if (k > 3000 && k < 12000) {
                double l = 3000 * 0.03 + (k - 3000) * 0.1;
                System.out.println("个人所得税" + l + "元");
                System.out.println("税后工资: " + (i - l));
            }
            if (k > 12000 && k < 25000) {
                double l = 3000 * 0.03 + 9000 * 0.1 + (k - 12000) * 0.2;
                System.out.println("个人所得税" + l + "元");
                System.out.println("税后工资: " + (i - l));
            }
            if (k > 25000 && k < 35000) {
                double l = 3000 * 0.03 + 9000 * 0.1 + 13000*0.2+(k-25000)*0.25;
                System.out.println("个人所得税" + l + "元");
                System.out.println("税后工资: " + (i - l));
            }
            if(k>35000 && k<55000){
                double l = 3000 * 0.03 + 9000 * 0.1 + 13000*0.2+10000*0.25+(k-35000)*0.3;
                System.out.println("个人所得税" + l + "元");
                System.out.println("税后工资: " + (i - l));
            }
            if(k>55000 && k<80000){
                double l = 3000 * 0.03 + 9000 * 0.1 + 13000*0.2+10000*0.25+20000*0.3+(k-55000)*0.35;
                System.out.println("个人所得税" + l + "元");
                System.out.println("税后工资: " + (i - l));}
            if(k>80000){
                double l = 3000 * 0.03 + 9000 * 0.1 + 13000*0.2+10000*0.25+20000*0.3+25000*0.35+(k-80000)*0.45;
                System.out.println("个人所得税" + l + "元");
                System.out.println("税后工资: " + (i - l));}
        }
    }


