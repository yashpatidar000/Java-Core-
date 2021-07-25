class Cd //static declaration
{
static double test()
{
System.out.println("test");
System.out.println("test");
return 1000.9;
}
public static void main(String args[])
{
double d1=test();
System.out.println(d1);
System.out.println("test()");
test();
}
}
