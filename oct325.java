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
