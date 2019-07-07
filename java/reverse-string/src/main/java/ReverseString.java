class ReverseString {

    String reverse(String inputString) {
        StringBuilder reverseStr = new StringBuilder("");

        for (int i = inputString.length()-1; i >= 0 ; i--){
            reverseStr.append(inputString.charAt(i));
        }
        return reverseStr.toString();
    }
  
}