class RnaTranscription {

    String transcribe(String dnaStrand) {
       StringBuilder rnaStrand=new StringBuilder("");
       for (int i = 0; i < dnaStrand.length(); i++){
           char ch = dnaStrand.charAt(i);
           if(ch == 'G')
               rnaStrand.append('C');
           else if(ch == 'C')
               rnaStrand.append('G');
           else if(ch == 'T')
               rnaStrand.append('A');
           else
               rnaStrand.append('U');

       }
       return rnaStrand.toString();

    }

}
