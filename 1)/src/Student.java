public class Student extends Person {
    private int studentNumber;
    private int averageMark;
    public int getAverageMark() {
        return averageMark;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public boolean isEligibaleToEnroll() {
        if(averageMark >= 4) {
            return true;
        }
        else {
            return false;
        }
    }
    public void getSeminarsTaken() {
        System.out.println("Seminar...");
    }
}
