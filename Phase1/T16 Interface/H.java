interface H
{
void test1();
}
interface I extends H
{
void test2();
}
class J implements I
{
public void test1()
{
System.out.println("test1");
}
public void test2()
{
System.out.println("test2");
}
public void test3()
{
System.out.println("test3");
}
}
class Manager3
{
public static void main(String args[])
{
J j1=new J();
j1.test1();
j1.test2();
j1.test3();
}
}