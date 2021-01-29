import java.util.Scanner;

class Student {
  String first_name;
  String last_name;
  double grade;

  public Student(String first_name, String last_name, double score) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.grade = score;

    String grade_result;
    
    String result = "Hello " + first_name + " " + last_name + "! Your Grade is ";
    if(100 >= grade && grade >= 80){
      System.out.println(result + 'A');
    } else if(80 > grade && grade >= 70) {
       System.out.println(result + 'B');
    } else if(70 > grade && grade >= 60){
       System.out.println(result + 'C');

    } else if(60 > grade && grade >= 50){
       System.out.println(result + 'D');
    } else {
      System.out.println(result + 'F');
    }

}
}
class StudentScoreAssignmentFirst {

public static void main(String[] args){
  Scanner in_first_name = new Scanner(System.in);
  System.out.println("Enter First Name");
  String f_name = in_first_name.nextLine();
  if(f_name instanceof String){
    System.out.println("Please Enter valid name");
  }
  Scanner in_last_name = new Scanner(System.in);
  System.out.println("Enter Last Name");
  String l_name =  in_last_name.nextLine();

  Scanner in = new Scanner(System.in);
  System.out.println("Enter Marks from 0 to 100");
  double score =  in.nextDouble();

  Student stu = new Student(f_name, l_name, score);

  }
}
