import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //You also need to use Arrays.deepToString(yourArray) when it is a 2d array.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //Compare Arrays.deeoToString(your2DArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
   

 public static String htmlTable(int[][] nums){
String html = "<table>"; // opening tab for the table
for (int row = 0; row < nums.length; row++){ // loop through rows
html = html + "<tr>";
for(int col = 0; col < nums[row].length; col++){
html = html + "<td>" + nums[row][col] + "</td";
}
html = html + "</table>" //close row
return html;
}
