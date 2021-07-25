class N
{
int i;
static
{
N n1 = new N();
n1.i=10;
System.out.println("from SIB:"+n1.i);
}

public static void main(String args[])
{

System.out.println("done");
}
}