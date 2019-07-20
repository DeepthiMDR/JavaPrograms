import java.util.HashMap;

class RnaTranscription {
    HashMap<Character,Character> map = new HashMap<>();

    RnaTranscription(){

        map.put('G','C');
        map.put('C','G');
        map.put('T','A');
        map.put('A','U');
    }

    String transcribe(String dnaStrand) {
       StringBuilder rnaStrand=new StringBuilder("");

       for (int i = 0; i < dnaStrand.length(); i++){

            rnaStrand.append(map.get(dnaStrand.charAt(i)));
       }
       return rnaStrand.toString();

    }

}
