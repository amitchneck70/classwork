// returnCopy returns new array with the same values as the parameter array
class MyArrays{
public static int[] returnCopy(int[] array){
  int [] copy = new int[array.length]; //make a new array copy
  for (int i = 0; i < array.length;i++){
copy[i] = array[i]; //copy elements index by index
}
return copy; //return the new copy
}
public static int [] concatArray(int [] ar1, int[] ar2){
int[] result = new int [ar1.length + ar2.length]; //new arr made from ar1 & ar2
for(int i =0;i<ar1.length;i++){
result[i] = ar1[i];
}//get all the elements of arr1 to put in new array
for(i=0;i<ar2.length;i++){
result[ar1.length + i] = ar2[i]; // get all elements from ar2
}
return result;
}

