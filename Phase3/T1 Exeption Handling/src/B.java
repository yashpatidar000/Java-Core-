//ArithmeticExeption
/*class B
{
    public static void main(String[] args) {
        System.out.println("Begin");
        int i=10/0;
        System.out.println("End");
    }
}*/
public class B {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            int data=100/0;
            System.out.println(2);
        }
        catch(ArithmeticException ex)
        { 
            System.out.println(3);  
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            
        }  
        System.out.println("End");
    }
}