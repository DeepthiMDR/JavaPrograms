class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;

    }

    String get() {
        String [] words = phrase.split("\\s|-|_");
        StringBuilder acronym = new StringBuilder("");
        for (int i = 0; i < words.length ; i++){
            if(words[i].length()!=0)
                acronym.append(words[i].charAt(0));
        }
        return acronym.toString().toUpperCase();
    }

}
