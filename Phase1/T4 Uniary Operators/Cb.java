class Cb
{
public static void method1()
{
System.out.println("method1 begin");
method2();
System.out.println("method1 end");
}
public static void main(String args[])
{
System.out.println("main begin");
method1();
System.out.println("main end");
}
public static void method2()
{
System.out.println("method2");
}  //main begin
}  //method1 begin
  // method2 
 //  method1 end 
 //  main end  