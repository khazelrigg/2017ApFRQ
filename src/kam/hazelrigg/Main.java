package kam.hazelrigg;

import kam.hazelrigg.Digits.Digits;
import kam.hazelrigg.Phrase.Phrase;
import kam.hazelrigg.StudyPractice.MultPractice;

public class Main {

    public static void main(String[] args) {
        digits();
        study();
        phrases();
    }

    static void digits() {
        Digits d1 = new Digits(1234);
        System.out.println(d1 + " is strictly increasing " + d1.isStrictlyIncreasing());
        Digits d2 = new Digits(213);
        System.out.println(d2+ " is strictly increasing " + d2.isStrictlyIncreasing());
    }

    static void study() {
        MultPractice practiceOne = new MultPractice(7, 3);
        System.out.println(practiceOne.getProblem());
        practiceOne.nextProblem();
        System.out.println(practiceOne.getProblem());
    }

    static void phrases() {
        Phrase phrase1 = new Phrase("A cat ate late.");
        phrase1.replaceNthOccurence("at", 1, "rane");
        int last = phrase1.findLastOccurence("at");
        System.out.println(last);
    }
}
