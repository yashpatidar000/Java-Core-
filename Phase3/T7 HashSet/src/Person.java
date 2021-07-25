
class Address
        {int houseNo=20;
                         }

public class Person implements Cloneable
{String name;
Address add;
int age;
Double weight;
/*Person(String name,Address add,int age,Double weight)
{this.add=add;
this.age=age;
this.name=name;
this.weight=weight;
}*/

    
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Person b1=new Person();
        Address a1=new Address();
        b1.add=a1;
        b1.age=34;
        b1.name="yash";
        b1.weight=66.6;
        Person b2=(Person)b1.clone();
        b2.add=a1;
        b2.age=34;
        b2.name="yash";
        b2.weight=66.6;
        
       
    }
}
