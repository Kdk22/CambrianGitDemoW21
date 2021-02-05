class IntArray
{
  public static int sum(int[] input)
  {
    int sum = 0;
    for (int i =0 ; i < input.length; i++){
      sum = sum +  input[i];

    }
    return sum;
  }
  public static void main(String[] args)
  {
    int[] inputArray = new int[] {30, 15, 83, 66, 46, 70, 88, 86, 90, 98};
    System.out.println("The sum of the array is " + sum(inputArray));
  }
}
