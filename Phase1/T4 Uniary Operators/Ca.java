class Ca
{static int i=3 ; //7 
public static void show()
{
i++;
  //4
System.out.println(i);
}
static int j=4;
public static void main(String args[])
{show();  //i
j=++i + ++i + ++j;
  //5     6    5   = 16
System.out.println(i);//6
System.out.println(j);//16
}



}