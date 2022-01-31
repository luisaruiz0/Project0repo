//Luis Ruiz
//CS1400
//Assignment 4
//11/2/21

public class Question 
{
    private String question;
    private String possibleAnswer1;
    private String possibleAnswer2;
    private String possibleAnswer3;
    private String possibleAnswer4;
    
    private int correctanswer;
    
    public Question(String q, String pa1, String pa2, String pa3, String pa4, int c)
    {
        question=q;
        possibleAnswer1=pa1;
        possibleAnswer2=pa2;
        possibleAnswer3=pa3;
        possibleAnswer4=pa4;
        correctanswer=c;
    }
    public String toString()
    {
        String s= question+"   1. "+possibleAnswer1+"   2. "+possibleAnswer2+
        "   3. "+possibleAnswer3+"   4. "+possibleAnswer4;
        return s;
    }

    public void setCorrectAnswer(int correctanswer)
    { 
        this.correctanswer=correctanswer;
    }
    public int getCorrectAnswer()
    {
        return correctanswer;
    }
    
    public void setPossibleAnswer1(String possibleAnswer1)
    { 
        this.possibleAnswer1=possibleAnswer1;
    }
    public String getPossibleAnswer1()
    {
        return possibleAnswer1;
    }
    public void setPossibleAnswer2(String possibleAnswer2)
    { 
        this.possibleAnswer2=possibleAnswer2;

    }
    public String getPossibleAnswer2()
    {
        return possibleAnswer2;
    }
    public void setPossibleAnswer3(String possibleAnswer3)
    { 
        this.possibleAnswer3=possibleAnswer3;
    }
    public String getPossibleAnswer3()
    {
        return possibleAnswer3;
    }
    public void setPossibleAnswer4(String possibleAnswer4)
    { 
        this.possibleAnswer4=possibleAnswer4;
    }
    public String getPossibleAnswer4()
    {
        return possibleAnswer4;
    }
   
    
}
