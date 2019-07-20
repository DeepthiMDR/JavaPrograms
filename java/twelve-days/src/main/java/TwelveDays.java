
class TwelveDays {
    String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth" };

    String verse(int verseNumber) {

        String giftsPart = "";

        switch(verseNumber){
            case 12:
                giftsPart += "twelve Drummers Drumming, ";
            case 11:
                giftsPart += "eleven Pipers Piping, ";
            case 10:
                giftsPart += "ten Lords-a-Leaping, ";
            case 9:
                giftsPart += "nine Ladies Dancing, ";
            case 8:
                giftsPart += "eight Maids-a-Milking, ";
            case 7:
                giftsPart += "seven Swans-a-Swimming, ";
            case 6:
                giftsPart += "six Geese-a-Laying, ";
            case 5:
                giftsPart += "five Gold Rings, ";
            case 4:
                giftsPart += "four Calling Birds, ";
            case 3:
                giftsPart += "three French Hens, ";
            case 2:
                giftsPart += "two Turtle Doves, and ";
            case 1:
                giftsPart += "a Partridge";

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
