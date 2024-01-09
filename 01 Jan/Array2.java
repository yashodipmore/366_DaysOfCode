import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        int Marks[] = new int[6];
        Scanner sc = new Scanner (System.in);

        Marks[0]= sc.nextInt();
        Marks[1]= sc.nextInt();
        Marks[2]= sc.nextInt();
        Marks[3]= sc.nextInt();
        Marks[4]= sc.nextInt();
        Marks[5]= sc.nextInt();

        System.out.println("M1  :"+Marks[0]);
        System.out.println("ECT :"+Marks[1]);
        System.out.println("EMI :"+Marks[2]);
        System.out.println("AE  :"+Marks[3]);
        System.out.println("UHV :"+Marks[4]);
        System.out.println("EEGS:"+Marks[5]);

    }
}
