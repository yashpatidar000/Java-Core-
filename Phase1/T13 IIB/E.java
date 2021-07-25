class E
{
static int i;
void set(int m)
{
i=m;
}
public static void main(String args[])
{
E e1=new E();
E e2=new E();
E e3=new E();
e1.set(1);
e2.set(2);
e3.set(3);
System.out.println(e3.i);
}
}