import java.util.Scanner;
public class TaxiCab{
  public static void main(String[] args){
    Scanner sc = new Scanner(new File("input.txt"));
    String input = sc.nextLine();
    sc.close();
   String [] step = input.split(", ");
   int[][] cardinalPt = {{0,1},{1,0},{0,-1},{-1,0}};
  int x=0,y=0,pov = 0; //pov for the direction being faced, (point of view)
 for (String step: steps){
 char turn  = step.charAt(0);
 int distance = Integer.parseInt(step.substring(1));
 if(turn == 'R') pov = (pov + 1) % 4;
else pov = (pov +3)%4;
  x+= cardinalPt[pov][0] * distance;
  y += cardinalPt[pov][1] * distance;
 }
 System.out.println(Math.abs(x) + Math.abs(y));
 }
}
