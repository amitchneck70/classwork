//main method unfinished
public static void main(String [] args){
public static void replaceNegative(int[] [] vals){
for (int row = 0; row < vals.length; row++){
for into col = 0; col < vals[row].length; col++){
if (vals[row][col]<0){//if value negative
if (row  == col){
vals[row][col]=1;
}
else{
vals[row][col]=0;
}
}
}
}
}
//returnCopy returns a copy of an array, not same array, helper func for copy
public static int[] returnCopy(int[] ary){
  int [] copy = new int[ary.length]; //make a new array copy
  for (int i = 0; i < ary.length;i++){
copy[i] = ary[i]; //copy elements index by index
}
public static int [][]copy(int [][] nums){
int[][] newArray = new int[nums.length][];
for(int i = 0; i < nums.length;i++){
newArray[i] = returnCopy(nums[i]);
}
return newArray;
}

