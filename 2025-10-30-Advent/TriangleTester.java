import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main (String[] args){
    //Test cases for triangleCheck
    System.out.println(triangleCheck(5, 10, 25));
    System.out.println(triangleCheck(3, 4, 5));
    System.out.println(triangleCheck(1,1,1));
    System.out.println(triangleCheck(3, 4, 3));

    try {
      File file = new File("inputTri.txt");
      Scanner input = new Scanner(file);

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a main or any void function
              //just don't put a value.
    }
  }

  //Helper function to check the sides of the triangle.
  public static boolean triangleCheck(int a, int b, int c){
    return ((a + b) > c && (a + c) > b && (b + c) > a);
  }

  public static int countTrianglesA(String filename){
    return 0;
  }
}
