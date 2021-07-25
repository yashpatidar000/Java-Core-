class A
{
{
System.out.println("IIB");
}
static
{
System.out.println("SIB");
}
{
System.out.println("IIB");
}

public static void main(String args[])
{
A a1=new A();
System.out.println("Main");
A a2=new A();
A a3=new A();
}
}