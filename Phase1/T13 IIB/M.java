class M
{
{
System.out.println("IIB1");
}
M(int i)
{
System.out.println("M(int)");
}
M()
{
System.out.println("M()");
}
M(double j)
{
System.out.println("M(double)");
}

public static void main(String args[])
{
M m3=new M();
M m1=new M(10);
M m2=new M(10.9);
}
}// IIB1 M() IIB1 M(int) IIB1 double