package kam.hazelrigg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<>();
        while (num > 0) {
            int digit = num % 10;
            digitList.add(digit);
            num /= 10;
        }
        Collections.reverse(digitList);

    }

    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i) >= digitList.get(i + 1)) return false;
        }
        return true;
    }

    public String toString() {
        return digitList.toString();
    }
}
