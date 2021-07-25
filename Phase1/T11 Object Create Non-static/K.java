class K
{int m,n,p=10,q;

void test()
{
System.out.println("from test1");
}
public static void main(String args[])
{
K k1=new K();
k1.m=1;
k1.n=2;
K k2=new K();
k2.p=1;
k2.n=k1.m;

System.out.println(k1.m);
System.out.println(k1.n);
System.out.println(k1.p);
System.out.println(k1.q);
System.out.println("----");
System.out.println(k2.m);
System.out.println(k2.n);
System.out.println(k2.p);
System.out.println(k2.q);
k1.test();
k2.test();
}
}//5 55 0 0