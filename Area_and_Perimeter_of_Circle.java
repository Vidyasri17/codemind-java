import java.util.Scanner;
public class Demo{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
        System.out.printf("%.2f
",(3.14)*r*r);
        System.out.printf("%.2f
",(3.14)*r*2);
    }
}