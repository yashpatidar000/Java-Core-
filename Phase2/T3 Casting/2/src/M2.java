class A {
    }
class B extends A {
    }
class C extends B {
    }
class D extends C{
    }
class E extends D {
    }

class M2
{
    public static void main(String[] args) {
       A a1=new A();
       A a2=a1;
       B b1=new B();
       B b2=b1;
        System.out.println("Y");
    }
}

/*class M2 //3
{
    public static void main(String[] args) {
       A a1=new A();
      
       B b1=new B();
       
        System.out.println("Yas");
    }
}*/
/*class M2 //4
{
    public static void main(String[] args) {
       A a1=new A();
       B b1=new B();
       a1=(A)b1;
       C c1=new C();
       D d1=new D();
       c1=(C)d1;
       C c2=(C)d1;
       A a2=(A)c1;
   System.out.println("Y");
    }
}*/
/*class M2 //5
{
    static void test(Object o)
    {
        System.out.println("object");
    }
    public static void main(String[] args) {
       A a1=new A();
       test(a1);
      
       B b1=new B();
       test(b1);
   
    }
}*/
/*class M2 //6
{
    {static C test()
    
        System.out.println("object");
        return null;
    }
    public static void main(String[] args) {
       A a1=new A();
       test();
       
 
    }
}*/

/*class M2 //10
{
   
    public static void main(String[] args) {
       Object obj=test();
      
     }
    static C test()
    {
        System.out.println("object");
        return null;
    }

   }*/
/*class M2 //11
{
   
    public static void main(String[] args) {
       test(new D());
       
     }
    static void test(Object obj)
    {
        System.out.println("object");
        
    }

   }*/
/*class M2 //12
{
   public static void main(String[] args) {
      A a1=test();
     }
    static B test()
    {
       D d1=new D();
       return d1;
    }
}*/
/*class M2 //13
{
   public static void main(String[] args) {
      A a1=new D();
      D d1=(D)a1;
      B b1=a1;
      C c1=b1;
      D d2=a1;
      Object o1=a1;
      a1=(A)o1;
      d1=(D)o1;
      b1=(B)o1;
      a1=(C)(D)(A)(Object)(C)(D);
      
   }
}*/