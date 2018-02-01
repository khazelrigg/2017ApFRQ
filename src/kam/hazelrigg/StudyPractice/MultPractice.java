package kam.hazelrigg.StudyPractice;

public class MultPractice implements StudyPractice {

    int first;
    int second;
    public MultPractice(int i, int k) {
        this.first = i;
        this.second = k;
    }

    @Override
    public String getProblem() {
        return first + " TIMES " + second;
    }

    @Override
    public void nextProblem() {
        second++;
    }
}
