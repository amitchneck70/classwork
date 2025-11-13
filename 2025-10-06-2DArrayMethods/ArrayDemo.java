import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
int [][] case1={
{3,4,5}
{6,7,8}};
int[][]case2={
{9,2},
{1}
};    
System.out.println("case 1 results:");
  System.out.println(Arrays.deepToString(case1));
System.out.println("html case1 result:")
System.out.println(htmlTable(case1));
System.out.println();
System.out.println("case 2  results:");
  System.out.println(Arrays.deepToString(case2)); 
System.out.println("html case2 result:") 
System.out.println(htmlTable(case2));}}  
public static String arrToString(int[]ary){
  String ans "["";
    for (int i = 0; i < nums.length; i++) {
      ans += ary[i];
      if ( i <n nums.length - 1 ) {
        ans += ", ";
      }
    }
    ans += "]";
  return ans;
}
//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
public static String arrToString2D(int[][]ary){
  String result = "[";
for(int i = 0; i <ary.length;i++){
result += arrToString(ary[i]);
if(i<ary.length-1)result += ",";
}
result += "]";
return result;
}
/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  int sum = 0;
for(int j= 0; j< nums.length;j++){
for(int h = 0; h< nums[j].lengtj;h++){
sum+= nums[j][h];
}
}
  return sum;
}
/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  int row = nums.length;
int col = nums[0].length;
int[][] result = new int[c][r];
for(int r =0; r <row;r++){
for(int c = 0; c<col; c++){
result[c][r] = nums[r][c];
}
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
