import java.util.Scanner;
public class Main2 {
    public static void main(String[]args){
        System.out.println("請輸入欲轉換公克數");
        Scanner scr=new Scanner(System.in);
        float val2=scr.nextFloat();
        System.out.println(((int)((val2/600)*10))/10f+"台斤");

    }}