
class M10 {
    enum En
    {A,B,C,D;
    En()
    {System.out.println("En()");}
    
    void test()
    { 
        System.out.println("test");
    }
    }
    public static void main(String[] args) {
        En e1=En.C;
       
        e1.test();
        System.out.println(e1); 
    }
}
