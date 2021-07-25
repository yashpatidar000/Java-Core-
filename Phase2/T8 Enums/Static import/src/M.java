
public class M {
    public static void main(String[] args) {
         final int i=10;
         final int j=10;
        class A{
            void test ()
            {
                System.out.println(i);
                System.out.println(j);
            }
        }
        A a1=new A();
        a1.test();
        
      
        
    }
}
