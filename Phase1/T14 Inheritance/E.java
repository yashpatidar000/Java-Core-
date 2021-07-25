class E
{
void test1()
{
System.out.println("test1");
}
}
class F extends E
{
void test2()
{
System.out.println("test2");
}
}
class Manager3
{
public static void main(String args[])
{
E e1=new E();
e1.test1();
F f1=new F();
e1.test1();
f1.test2();
}
}