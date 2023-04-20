public class Exercise1 {

    static boolean iwillNotCheat = false;
    static boolean iWillWin = false;

    public static void main(String[] args) {

        // Precondition
        assert iwillNotCheat == true : "I shouldn't have done that :(";

        enterCompetition();

        // Postcondition
        assert iWillWin == true : "I'm proud of myself and on what I can do!";

    }

    static void enterCompetition() {
        iWillWin = false;
    }

}
