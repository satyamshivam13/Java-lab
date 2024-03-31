//Write a java program that uses any 5 methods of "Wrapper" class
class Exp30_WrapperClass{

    public static void main(String[] args) {
        // Autoboxing
        int i = 10;
        Integer iObj = i; 
        // Unboxing
        int j = iObj; 

        System.out.println("i = " + i);
        System.out.println("iObj = " + iObj);
        System.out.println("j = " + j);
    }
}
