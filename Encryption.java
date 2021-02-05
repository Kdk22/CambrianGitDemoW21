import java.util.Scanner;
class Encryption
{
  // String Buffer is better than string 
  //https://stackoverflow.com/questions/2439243/what-is-the-difference-between-string-and-stringbuffer-in-java
  public static StringBuffer encrypt(String text, int val)
  {
    StringBuffer encryptedText = new StringBuffer();
    for (int i=0; i<text.length(); i++)
    {
        System.out.println(text.charAt(i));
        char ch = (char)(((int)text.charAt(i) + val) % 26 );
        System.out.println("Text is : " +ch);
        encryptedText.append(ch);
    }
    return encryptedText;
  }
  public static StringBuffer decrypt(StringBuffer text, int val)
  {
    StringBuffer decryptedText = new StringBuffer();
    for (int i=0; i<text.length(); i++)
    {
      char ch = (char)(((int)text.charAt(i) - val) % 26 );
      decryptedText.append(ch);
    }
    return decryptedText;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string to encrypt: ");
    String inputText = sc.nextLine();
    System.out.println("What value do you want to encrypt with ? ");
    int val = sc.nextInt();
    StringBuffer encrypted = new StringBuffer();
    encrypted = encrypt(inputText, val);
    System.out.println(inputText + " encrypted is " + encrypted);
    System.out.println("Using " + encrypted + " to test the decryption with " +val);
    System.out.println("The decrypted string is " + decrypt(encrypted, val));

    
  }
}
