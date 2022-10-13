import java.util.*;

public class stdinstdout {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            array.add(scan.nextInt());
        }
        for(int i=0;i<array.size();i++)
            System.out.println(array.get(i));
    }

}
