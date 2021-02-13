import java.util.*;
public class Test
{
public static void main(String args[])
{
Map m=new HashMap();
m.put(1,"abc");
m.put(3,"pqr");
m.put(5,"fdg");

System.out.println(m);


/*for(int key: keys)
{
System.out.println(key);
String val=(String)m.get(key);
System.out.println(val);
}
*/
Set <Integer> keys=m.keySet();
Iterator <Integer> itr=keys.iterator();
while(itr.hasNext())
{
int key=(int)itr.next();
System.out.println(key);
String val=(String)m.get(key);
System.out.println(val);
}

}
}
