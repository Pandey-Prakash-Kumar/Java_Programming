import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Batch {
    private String batchCode;
    private String courseName;
    private LocalTime startDate;
    private int studentCount;
    private LocalTime time;
    private String days;
    private static int numberOfBatches;

    // to increment the count of instance
    public Batch(){
        numberOfBatches++;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalTime startDate) {
        this.startDate = startDate;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public static int getNumberOfBatches() {
        return numberOfBatches;
    }

    public static void setNumberOfBatches(int numberOfBatches) {
        Batch.numberOfBatches = numberOfBatches;
    }
}
