package kam.hazelrigg.Phrase;

public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }


    private int findNthOccurence (String str, int n) {
        int index = currentPhrase.indexOf(str);
        if (currentPhrase.contains(str)) {
            for (int i = 1; i < n; i++) {
                index = currentPhrase.indexOf(str, index + 1);
                if (index == -1) {
                    return -1;
                }
            }
        }
        return index;
    }


    public void replaceNthOccurence(String str, int n, String repl) {
        int index = findNthOccurence(str, n);
        if (index != -1) {
            String chop = currentPhrase.substring(index);
            currentPhrase = currentPhrase.substring(0, index) + chop.replaceFirst(str, repl);
        }
    }

    public int findLastOccurence(String str) {
        int index = 0;
        int looper = 0;
        while (true) {
            index = currentPhrase.indexOf(str, index + 1);
            if (index == -1) {
                return findNthOccurence(str, looper);
            }
            index++;
            looper++;
        }
    }

    public String toString() {
        return currentPhrase;
    }



}
