import java.util.Scanner;
public class L {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter something"); 
    String s=sc.next();
    System.out.println("1");
    try{
        System.out.println("2");
        int i=Integer.parseInt(s);
        System.out.println("3");
        int k=i/(i-9);
        System.out.println("4");
        
    }    
    catch(ArithmeticException ex)
    {System.out.println("5");
        System.out.println(ex);
        System.out.println("6");
    }
    catch(NumberFormatException ex)
    {System.out.println("7");
        System.out.println(ex);
        System.out.println("8");
    }
        System.out.println("9");
    }
}
