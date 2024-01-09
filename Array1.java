import java.util.*;
public class Array1 {
    public static void main(String args[])
    {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();

        System.out.println("M1 : "+ marks[0]);
        System.out.println("M2 : "+ marks[1]);

        marks[1]= 76;
        System.out.println("M2 : "+ marks[1]);

        int percentage = ( marks[0] + marks[1])/2;
        System.out.println(percentage);

        System.out.println("Length of array is : "+marks.length);

        
    }
}
