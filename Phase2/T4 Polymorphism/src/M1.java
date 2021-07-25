class A{
void test(){
    System.out.println("A test");
       }
}
class F extends A
 {
    void test(){
    System.out.println("B test");
       }
}
public class M1 {
    public static void main(String[] args) {
       A a1=new A();
       A a2=new F();
       a1.test();
       a2.test();
       
       
    }
 
}