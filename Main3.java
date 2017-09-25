import java.util.Scanner;
public class Main3{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        String  wef = scn.nextLine();
        char gkh = scn.next().charAt(0);
        char oiu = scn.next().charAt(0);
        System.out.println(wef.replace(gkh , oiu));
    }
}