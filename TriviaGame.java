//Luis Ruiz
//CS1400
//Assignment 4
//11/2/21

import java.util.Scanner;
public class TriviaGame 
{
    public static void main(String[] args) 
    {
        int pointsP1=0;
        int pointsP2=0;

        //intro
        Scanner t= new Scanner(System.in);
        System.out.println("Welcome to game, click enter to continue");
        String enter = t.nextLine();
        System.out.println("Enter numbers that corresponds with the answer. ");
        System.out.println("Player 1 begin");

        Question[] questions = new Question[10];
        questions[0] = new Question("Who invented gravity?\n", 
        "Thomas Edison", "Anthony Davis", "Isaac Newton", "Thomas Jefferson", 3 );
        questions[1] = new Question("Who is most known for being the first person on the moon?\n", 
         "Frederick Douglass", "Niel Patrick Armstrong", "Roger Williams", "Apollo 11",2 );
        questions[2] = new Question("What is former President Obama's last name?\n",
         "Barack", "Obama", "Trump", "Bush",2 );
        questions[3] = new Question("Which is not a State in the United States?\n",
         "Alaska", "California", "Las Vegas", "Georgia",3 );
        questions[4] = new Question("Who was known to found microsoft?\n",
         "Bill nye", "Steve Jobs", "Benjamin Franklin", "Bill Gates",4 );
        questions[5] = new Question("What year did the first World War end?\n",
         "1918", "1945", "1940", "1914",1 );
        questions[6] = new Question("Who was casted as Spiderman in the 2002 Film of Spider-man?\n",
         "Andrew Garfield", "Tobey Maguire", "Tom Holland", "Henry",2 );
        questions[7] = new Question("What are animals that can fly?\n",
         "Owls", "Ducks", "Squriels", "All of the Above",4 );
        questions[8] = new Question("What day did Mexico claim independence from Spain?\n",
         "July 4", "May 5", "May 6", "Septemeber 16",4 );
        questions[9] = new Question("What is the biggest Country in the world?\n",
         "United States", "Russia", "China", "Canada",2 );
        int[] answers ={3, 2, 2, 3, 4, 1, 2, 4, 4, 2};

         //player1 +5 questions

        for(int i=0; i<5; i++)
        {
            
            System.out.println(questions[i]);
            
            int qt = t.nextInt();
            
            if (qt==answers[i])
            {
                System.out.println("Correct!");
                pointsP1++;
            }
            else
            {
                System.out.println("Wrong!\n");
                System.out.println("The correct answer is "+questions[i].getCorrectAnswer());
                if(answers[i]==1)
                {
                    System.out.println(questions[i].getPossibleAnswer1()+"\n");
                }
                else if(answers[i]==2)
                {
                    System.out.println(questions[i].getPossibleAnswer2()+"\n");
                }
                else if(answers[i]==3)
                {
                    System.out.println(questions[i].getPossibleAnswer3()+"\n");
                }
                else if(answers[i]==4)
                {
                    System.out.println(questions[i].getPossibleAnswer4()+"\n");
                }
            }
        }


        //player2 start +5 questions

        System.out.println("");
        System.out.println("Player 2 press enter to begin");
        String p2 = t.nextLine();
        String pl2 = t.nextLine();

        for(int j=5; j<10; j++)
        {
            System.out.println(questions[j]);
            int qe = t.nextInt();
            if (qe==answers[j])
            {
                System.out.println("Correct!");
                pointsP2++;
            }
            else
            {
                System.out.println("Wrong!\n");
                System.out.println("The correct answer is "+questions[j].getCorrectAnswer());
                if(answers[j]==1)
                {
                    System.out.println(questions[j].getPossibleAnswer1()+"\n");
                }
                else if(answers[j]==2)
                {
                    System.out.println(questions[j].getPossibleAnswer2()+"\n");
                }
                else if(answers[j]==3)
                {
                    System.out.println(questions[j].getPossibleAnswer3()+"\n");
                }
                else if(answers[j]==4)
                {
                    System.out.println(questions[j].getPossibleAnswer4()+"\n");
                }
            }
        }

        //Ending score system
        System.out.println(""+"Total Score for Player 1");
        System.out.println(pointsP1);
        System.out.println("Total Score for Player 2");
        System.out.println(pointsP2);
        if (pointsP1>pointsP2)
        {
            System.out.println("Player 1 wins!");
        }
        else if(pointsP2>pointsP1)
        {
            System.out.println("Player 2 wins!");
        }
        else if (pointsP1==pointsP2)
        {
            System.out.println("It's a draw!");
        }
    }
    
}
