import java.util.Scanner;
class SearchArray
{
public static boolean find(int[] myArray,int input){
  boolean result = false;
  for (int i= 0; i < myArray.length; i++){
    if(myArray[i] == input){
      result = true;
    }
      }
  return result;

}
public static void main(String[] args)
    {
      int[] inputArray = new int[] {95,85, 25, 90, 74, 24,43,33,40, 0, 77,-4};
      
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to search for in the array ");
    int val = sc.nextInt();

    if(find(inputArray, val)){
      System.out.println("The array contains " + val);
    } else {
      System.out.println("The array does not contain " +val);
    }
}
}
