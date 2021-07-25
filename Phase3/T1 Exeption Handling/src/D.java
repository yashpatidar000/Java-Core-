//ClassCastExecption
/*public class D {}
    class E extends D{}
      class F extends E{} 
      
class G
{
    public static void main(String[] args) {
        System.err.println("Begin");
        D d=new D();
        System.out.println(1);
        E e= (E)d;
        System.out.println(2);
        
    }
}*/
class D
{
    public static void main(String[] args) {
        System.out.println("1");
        try
        {System.out.println(2);
        Object obj=new Object();
        System.out.println("3");
            D d=(D)obj;
        System.out.println("4");
        }
        catch(ClassCastException ex)
        {
            System.out.println("5");
            ex.printStackTrace();
            System.out.println("6");
        }
        System.out.println("7");
    }


}


