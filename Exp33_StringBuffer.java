// Write a java program that uses any 5 methods of "StringBuffer" class.
public class Exp33_StringBuffer{

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("welcome to my praticals");
		
		System.out.println("Capacity: "+str.capacity());
		System.out.println("Hashcode: "+str.hashCode());
		System.out.println("Append: "+str.append(" java"));
		System.out.println("Getclass: "+str.getClass());
		System.out.println("Reverse: "+str.reverse());
		
		

	}

}
