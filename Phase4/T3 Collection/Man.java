import java.util.*;
import java.io.*;
class A{
int i;
A(int i){
this.i=i;
}
}

public class Man extends ArrayList{
public static void main(String args[])
{
Man list = new Man();
list.add(90);
//list.add(new A(100));
//list.add(new A(190));
System.out.println(list);
}
}