abstract class E
{
abstract void test1();
void test2()
{
System.out.println("test2");
}

}
class F extends E
{
void test1()
{
System.out.println("test1");
}

}
class Manager5
{
public static void main(String args[])
{
F f1=new F();
f1.test1();
f1.test2();
}
}// 