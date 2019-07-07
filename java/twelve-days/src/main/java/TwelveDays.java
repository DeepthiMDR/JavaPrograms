class TwelveDays {
    String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth" };
    String[] gifts = {

            "a Partridge",
            "two Turtle Doves, ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, "
    };

    String verse(int verseNumber) {

        String giftsPart = "";

        for (int i = verseNumber-1 ; i >= 0; i--){
            if (i == 0 && verseNumber > 1)
                giftsPart += "and ";

            giftsPart += gifts[i];
        }

        return String.format("On the %s day of Christmas my true love gave to me: %s in a Pear Tree.\n", days[verseNumber-1],giftsPart);
    }

    String verses(int startVerse, int endVerse) {
        String verselets = "";

        for (int i = startVerse; i < endVerse ; i++) {
           verselets += verse(i) + "\n";
        }
        verselets += verse(endVerse);

        return verselets;
    }
    
    String sing() {
        return verses(1,12);
    }
}
