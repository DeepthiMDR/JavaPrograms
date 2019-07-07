public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        int count[] = new int[26];
        for (int i = 0; i<input.length(); i++){
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = Integer.valueOf(ch - 'a');
                count[index]++;
            }
        }
        for (int i = 0; i < 26; i++){
            if(count[i] == 0)
                return false;
        }
        return true;
    }

}
