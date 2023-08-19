class Student {
    String studentName;
    int academicScore;
    public Student(String sName, int aScore) {
        studentName = sName;
        academicScore = aScore;
    }
}

class Sports {
    int sportsScore;
    public Sports(int sScore) {
        sportsScore = sScore;
    }
}

class Result extends Student {
    Sports sports;
    public Result(String sName, int aScore, int sScore) {
        super(sName, aScore);
        sports = new Sports(sScore);
    }

    public void displayScores() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sports.sportsScore);
    }
}

public class CO3P5 {
    public static void main(String[] args) {
        Result result = new Result("John", 85, 90);
        result.displayScores();
    }
}
