interface G
{
void test1();
void test2();
}
abstract class H implements G
{
public void test1()
{
System.out.println("test1");
}
}
class I extends H
{
public void test2()
{
System.out.println("test2");
}
}
class Manager3
{
public static void main(String args[])
{
I i1=new I();
i1.test1();
i1.test2();
}
}