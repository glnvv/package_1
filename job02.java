package day04;
import java.util.Scanner;
public class job02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入存款金额： ");
        int i = scan.nextInt();
        System.out.println("请输入存款年限:  ");
        int j = scan.nextInt();
        if(j==1){
            double k = i+i*0.0225*1;
            System.out.println("存款1年后的本息是: "+k);
        }
        else if(j==2){
            double k = i+i*0.027*2;
            System.out.println("存款2年后的本息是: "+k);
        }
        else if(j==3){
            double k = i+i*0.0325*3;
            System.out.println("存款3年后的本息是: "+k);
        }
        else if(j==5){
            double k = i+i*0.036*5;
            System.out.println("存款5年后的本息是: "+k);
        }


    }
}
