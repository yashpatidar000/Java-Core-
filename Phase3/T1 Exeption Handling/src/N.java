import java.util.Scanner;
public class N {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("1");
    System.out.println("Enter something"); 
    
    try{
        String s=sc.next();
        System.out.println("2");
        int i=Integer.parseInt(s);
        System.out.println("3");
        int k=i/(i-9);
        System.out.println("4");
        
    }    
    catch(ClassCastException ex)
    {System.out.println("5");
        System.out.println(ex);
        System.out.println("6");
    }
    catch(ArrayIndexOutOfBoundsException ex)
    {System.out.println("7");
        System.out.println(ex);
        System.out.println("8");
    }
        System.out.println("9");
    }
}

