package Day4;

class stringBufferMethods4{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello"); 
System.out.println(sb.capacity());
System.out.println(sb.length());//length=5


System.out.println(sb.capacity());
sb.append("world");
System.out.println(sb);



sb.insert(1,"java"); //insert 
System.out.println(sb);
System.out.println(sb.capacity());//capacity
sb.append("helloworld12"); 
System.out.println(sb.capacity());

sb.delete(1,5); //delete
System.out.println(sb);


  
}  
}  
