abstract class J
{
abstract void test1();
abstract void test2();
abstract void test3();
}
abstract class K extends J
{
}
abstract class L extends K
{
void test5()
{
System.out.println("test5");
}
abstract void test4();
}
abstract class M extends L
{
void test1()
{
System.out.println("test1");
}
}
abstract class N extends M
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
class Manager7 extends N
{
void test4()
{
System.out.println("test4");
}
public static void main(String args[])
{
Manager7 m7=new Manager7();

m7.test1();
m7.test3();
m7.test2();
m7.test4();
m7.test5();
}
}

abstract class Manager8
{
public static void main(String args[])
{
System.out.println("main");
}
}

abstract class Manager9
{
abstract void test()
{
System.out.println("main");
}
}