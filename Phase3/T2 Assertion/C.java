public class C {
    static void test(){
        System.out.println("test begin");
       
        assert false;
        System.out.println("test end");
    }

}
class D {
    public static void main(String[] args) {
        System.out.println("main begin");
        C.test(); 
        assert false;
        System.out.println("main end");
    }

}