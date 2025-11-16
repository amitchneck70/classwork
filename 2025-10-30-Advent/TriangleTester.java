import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main (String[] args){
    //Test cases for triangleCheck

    System.out.println(triangleCheck(785, 516,744));
    System.out.println(triangleCheck(272,511,358));
    System.out.println(triangleCheck(801, 791,693));

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
public static int countTrianglesA(String filename) {
  int count = 0;
  try(Scanner in = new Scanner(new File(filename))){
    while (in.hasNextLine()) {
      String[] nums = in.nextLine().trim().split("\\s+");
      if (triangleCheck(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]),
              Integer.parseInt(nums[2])))
        count++;
    }
} catch(FileNotFoundException e){
    System.out.println("File not found");
 }
 return count;
}
// pt B
public static int countTrianglesB(String filename) {
  int count = 0;
  try (Scanner in = new Scanner(new File(filename))){
    while (in.hasNextLine()) {
      int[][] lines = new int[3][3];
      for (int i = 0; i < 3; i++) {
        String[] nums = in.nextLine().trim().split("\\s+");
        for (int j = 0; j < 3; j++) lines[i][j] = Integer.parseInt(nums[j]);
      }
      for (int col = 0; col < 3; col++) {
       if(triangleCheck(lines[0][col],lines[1][col], lines[2][col]))
      count ++;
    }
  }
}catch(FileNotFoundException e){
  System.out.println("File not found");
}
return count;
}
}
