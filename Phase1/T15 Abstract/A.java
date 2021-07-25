abstract class A
{
abstract void test1();//abtract method declaration 
void test2()//concrete method defination
{
System.out.println("test2");
}
abstract void test3();
}
class Manager1
{
public static void main(String args[])
{
A a1=new A();
}
}// CTE 