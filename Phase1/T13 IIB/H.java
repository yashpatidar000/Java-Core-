class H
{

{
System.out.println("IIB");
}
H()
{
this(10.09);
System.out.println("H()");
}
{
System.out.println("IIB1");
}
H(double d)
{
System.out.println("H(double)");
}

public static void main(String args[])
{
H h1=new H();
H h2=new H(90.0);
}
}