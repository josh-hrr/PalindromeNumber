class Main {
  public static void main(String[] args) {
    int testing = -121;
    System.out.println(isPalindrome(testing));
  }

  public static boolean isPalindrome(int x) { 
        String test = "";
        test = test + String.valueOf(x); 

        String resultOne = "";
        String resultTwo = "";

        boolean result = false;
        
        for(int i = 0; i<test.length(); i++){
            System.out.println(test.charAt(i)); 
            resultOne = resultOne + test.charAt(i);
        } 

        for(int i = test.length() - 1; i>=0; i--){
            System.out.println(test.charAt(i)); 
            resultTwo = resultTwo + test.charAt(i);
        }

        if(resultOne.equals(resultTwo)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}