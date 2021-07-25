class F extends object
{
static int i=10;
F(F this)
{
super(this);
}
static
{
System.out.println(1);
System.out.println(F.i);
F.i=100;
}
static void test()
{
System.out.println(2);
System.out.println(F.i);
F.i=200;
}
public static void main(String args[])
{
System.out.println(3);
System.out.println(F.i);
F.i=300;
F.test();
System.out.println(F.i);
}
}//1 10 3 100 2 300 200