class Five 
{
public static void main(String args[])
{ int i=10;
int k=i++ + ++i;
System.out.println(i);
System.out.println(k);
have();
then();
has();
hash();
}
public static void have()
{int i=10;
int k=i++ + ++i +i++;
System.out.println("\n");
System.out.println(i);
System.out.println(k);
}
public static void then()
{int i=10;
int k=i-- + --i + i++;
System.out.println("\n");
System.out.println(i);
System.out.println(k);
}
public static void has()
{int i=10;
int j=i-- + --i + i++;
int k=j-- + --j + j++;
System.out.println("\n");
System.out.println(i);
System.out.println(j);
System.out.println(k);
}
public static void hash()
{int i=1;
int j=i-- + --i + i++;
int k=j-- + --j + j++;
int l=j++ + --i + k++; 
System.out.println("\n");
System.out.println(i);
System.out.println(j);
System.out.println(k);
System.out.println(l);
}
}
