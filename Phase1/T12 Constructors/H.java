class H
{
H()
{
System.out.println("H()");
}
H(int i)
{
System.out.println("H()");
}
H(int j)
{
System.out.println("H(int)");
}
public static void main(String args[])
{
H h1=new H();
System.out.println(" --- ");
H h2=new H(9);
System.out.println(" ---  ");
H h3=new H(20);
System.out.println(" ---  ");
}
}
//