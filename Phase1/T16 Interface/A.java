interface A
{
void test1();
}
interface B
{
void test2();
}
class C implements A,B
{
public void test1()
{
System.out.println("test1");
}
public void test2()
{
System.out.println("test2");
}
}
class Manager1
{
public static void main(String args[])
{
C c1=new C();
c1.test1();
c1.test2();
}
}