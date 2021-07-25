class P
{
P()
{
System.out.println("P()");
}
}
class Q extends P
{
Q()
{this(90);
System.out.println("Q");
}
Q(int i)
{
System.out.println("Q(int)");
}}
class R extends Q
{
R()
{
System.out.println("R()");
}
R(int i)
{
this();
System.out.println("R(int)");
}
}
class Manager8
{
public static void main(String args[])
{
P p1=new P();
Q q1=new Q();
Q q2=new Q(20);
R r1=new R();
R r2=new R(20);
}
}