class B
{
static int i;
B()
{
i++; 
}
public static void main(String args[])
{
B b1=new B();
System.out.println(b1.i);
i=2;
B b2=new B();
B b3=new B();
System.out.println(b1.i);
System.out.println(i);
}
}//