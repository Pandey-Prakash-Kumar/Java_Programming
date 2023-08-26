public class Question {
    private int queNo;
    private String que;
    private String optionA,optionB,optionC,optionD;
    private char answer;
    public void setQuestion(int queNo, String que, String optionA,String optionB, String optionC, String optionD){
        this.que=que;
        this.queNo=queNo;
        this.optionA=optionA;
        this.optionB=optionB;
        this.optionC=optionC;
        this.optionD=optionD;
    }

    public void displayAnswer(char answer) {
        System.out.println(queNo+". "+que);
        System.out.println("(a) "+optionA);
        System.out.println("(b) "+optionB);
        System.out.println("(c) "+optionC);
        System.out.println("(d) "+optionD);
        System.out.println("Answer: "+answer);
    }

    void displayQuestion(){
        System.out.println(que);
    }

}
