class MyArrays{
//main method
public static void main(String[] args){
}
//returnCopy returns a copy of an array, not same array
public static int[] returnCopy(int[] ary){
  int [] copy = new int[ary.length]; //make a new array copy
  for (int i = 0; i < ary.length;i++){
copy[i] = ary[i]; //copy elements index by index
}
return copy; //return the new copy
}
// concatArray returns an array with the elements of two different arrays
public static int [] concatArray(int [] ary1, int[] ary2){
int[] result = new int [ar1.length + ar2.length]; //new arr made from ary1 & ary2
for(int i =0;i<ar1.length;i++){
result[i] = ar1[i];
}//get all the elements of ary1 to put in new array
for(i=0;i<ary2.length;i++){
result[ary1.length + i] = ary2[i]; // get all elements from ary2
}
return result;
}

