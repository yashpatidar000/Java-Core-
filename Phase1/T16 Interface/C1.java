abstract class C1
{
abstract void test1();
void test1(int i)
{
System.out.println("test(int i)");
}
}
class C2 extends C1
{
void test1()
{
System.out.println("test()");
}
}
class Manager7
{
public static void main(String args[])
{
C2 obj=new C2();
obj.test1();
obj.test1(2);

}
}