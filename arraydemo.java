public class arraydemo {
   public static void demo1(Integer[] inputArray) {
      for (Integer element : inputArray){
         System.out.printf("%s ", element);
         System.out.println();
      }
   }
   public static void demo1(Double[] inputArray) {
      for (Double element : inputArray){
         System.out.printf("%s ", element);
         System.out.println();
      }
   }
   public static void demo1(Character[] inputArray) {
      for (Character element : inputArray){
         System.out.printf("%s ", element);
         System.out.println();
      }
   }
   public static void main(String args[]) {
      Integer[] integerArray = { 1, 2, 3 };
      Double[] doubleArray = { 1.1, 2.2, 3.3 };
      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
      
      System.out.println("The Elements of Integer Array is :");
      demo1(integerArray);
      
      System.out.println("\nThe elements of double array is:");
      demo1(doubleArray);
      
      System.out.println("\nThe elements of character array is:");
      demo1(characterArray);
   }
}
 
