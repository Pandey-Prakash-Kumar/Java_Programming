public class Course {
    private int courseId;
    private String courseName;
    private String duration;
    private int fee;
    void setCourseId(int courseId){
        this.courseId=courseId;
    }
    void getCourseId(){
        System.out.println(courseId);
    }
    void setCourseName(String courseName){
        this.courseName=courseName;
    }
    void getCourseName(){
        System.out.println(courseName);
    }
    void setDuration(String duration){
        this.duration=duration;
    }
    void getDuration(){
        System.out.println(duration);
    }
    void setFee(int fee){
        this.fee=fee;
    }
    void getFee(){
        System.out.println(fee);
    }


}
