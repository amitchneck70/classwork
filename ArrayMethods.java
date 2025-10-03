// Amy Mitchneck amym4019@nycstudents.net
// Alex Mok
public class ArrayMethods{
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
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
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
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
}
return result;
public static void main(String[] args) {
int[][] test = {
{2,3,4},
{5,6,7},
{2,4,9}};
  System.out.println("arrToString" + arrToString2D(test))
System.out.println("arr2Dsum" + arr2DSum(test))
}
}
