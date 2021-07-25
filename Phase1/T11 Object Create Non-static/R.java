class R
{
int i;
static R test()
{
System.out.println(123);
R Ri=new R();
Ri.i=100;
return Ri;
}
public static void main(String args[])
{
R obj=test();
System.out.println(obj.i);
}
}