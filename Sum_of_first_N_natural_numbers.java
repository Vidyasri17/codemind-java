import java.util.Scanner;
public class Demo{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(n * (n + 1) / 2);
    }
}
