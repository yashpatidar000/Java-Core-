class E
{
int i;
E()
{
System.out.println(i);
i=10;
}

public static void main(String args[])
{

E e1=new E();

E e2=new E();

System.out.println(e1.i);
System.out.println(e2.i);

}
}