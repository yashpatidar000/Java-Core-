abstract class G
{
abstract void test1();
abstract void test2();
abstract void test3();
}
abstract class H extends G
{
void test1()
{
System.out.println("test1");
}
void test2()
{
System.out.println("test2");
}
void test3()
{
System.out.println("test3");
}
}
class I extends H
{
void test2()
{
System.out.println("test2");
}
void test3()
{
System.out.println("test3");
}
}
class Manager6
{
public static void main(String args[])
{
I i1=new I();
i1.test1();
i1.test3();
i1.test2();
}
}