import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code
        System.out.println("請輸入欲轉換公升數");
        Scanner scr=new Scanner(System.in);
        float val=scr.nextFloat();
        System.out.println((int)((val*0.26418)*10)/10f);

    }
}
