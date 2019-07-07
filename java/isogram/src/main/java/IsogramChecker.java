import java.util.HashMap;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        HashMap<Character , Integer > frequency = new HashMap<Character, Integer>();
        phrase = phrase.toLowerCase();

        for (int i = 0 ; i < phrase.length() ; i++){
            char ch = phrase.charAt(i);

            if (isLetter(ch) && frequency.containsKey(ch))
                return false;
            frequency.put(ch,1);
        }
        return true;
    }
    boolean isLetter(char ch){
        if(ch >= 'a' && ch <= 'z' )
            return true;
        return false;
    }

}
