import java.util.Scanner;

 class stdinstidoutII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        int i=Integer.parseInt(input);
        String input1=scan.nextLine();
        double d=Double.parseDouble(input1);
        String s=scan.nextLine();
        // Write your code here.


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

