public class B {
    public static void main(String[] args) {
        System.out.println("begin");
        int s1=10; 
        assert false : test();
        System.out.println("end");
    }
static int test()
{
System.out.println("a");
return 20;

}
}