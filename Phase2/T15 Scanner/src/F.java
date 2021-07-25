import java.util.Scanner;
public class F {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name  ");
        String s1=sc.next();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your weight");
        double weight=sc.nextDouble();
        System.out.println("Are you married?(Yes/No)");
        boolean marriedstatus=sc.nextBoolean();
        
        System.out.println("You have entered");
        System.out.println(s1);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(marriedstatus);
        String s=sc.next();
    }
}
