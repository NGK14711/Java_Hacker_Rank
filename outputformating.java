import java.util.Scanner;

public class outputformating {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            while(s1.length()<15){
                s1 = s1 + " ";
            }

            String s = "" + x;
            while(s.length() < 3){
                s = 0 + s;}
            System.out.println(s1 + s );

            //Complete this line
        }
        System.out.println("================================");

    }
}



