public  class wordMake{
  public static void makeWords(int remainingLetters, String result, String alphabet){
   if(remainingLetters ==0){
     System.out.println(result);
     return;
    }
   for(int i = 0; i<alphabet.length();i++){
     String letter = alphabet.substring(i,i+1);
    makeWords(remainingLetters-1,result+letter,alphabet);
    }
   }
}
