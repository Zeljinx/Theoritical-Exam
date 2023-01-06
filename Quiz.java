public class Quiz {
    
    private int id;
    private int totalScore;
    private int maxScore;
    private String student;
    private double grade;
   
    public Quiz(int id, int totalScore, int maxScore, String student){
        this.id = id;
        this.totalScore = totalScore;
        this.maxScore = maxScore;
        this.student = student;
    }
    
    public Quiz(){
        id = 0;
        totalScore = 0;
        maxScore = 0;
        student = "Unkown";
    }
    public int getId(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    public int getTotalScore(){
        return totalScore;
    }
    public void setTotalScore(int totalScore){
        this.totalScore = totalScore;
    }
    public int getMaxScore(){
        return maxScore;
    }
    public void setMaxScore(int maxScore){
        this.maxScore = maxScore;
    }
    public String getStudent(){
        return student;
    }
    public void setStudent(String student){
        this.student = student;
    }
    
    public double grade(){
        this.grade = totalScore / maxScore;
        return grade;
    }
}
