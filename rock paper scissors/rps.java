
/**
 * This program will create a simulation of a rock paper scissors game.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class rps extends sound
{
    char cpu;
    char RPS;
    int score = 0;
    int cpuscore= 0;
    char play = 'Y';
    //these are variables which can be called during the game. 
    public static void main (String args [])
    {
        new rps ();
    }

    public rps ()
    {
        instructions ();
        //displays instructions and rules of game.

        for (int i=0 ; i<3 ; i++)
        {
            play = 'Y';
            //game wont stop till someone wins the game.
            while (play == 'Y')
            {
                options ();
                //choices the users input and the cpu input(that is named upc:later in program).
                score ();
                //decides who wins the game/
            }
        }
        //create if statements to decide who wins the game.
        if (cpuscore > score)
            System.out.println ("\n You loose the game of Rock Paper Scissors");
        else if (score > cpuscore)
            {System.out.println ("\n You win the game of Rock Paper Scissors");
            sound ("applause.WAV");}
            
    }

    public void instructions ()
    {
        System.out.println ("This is how you play the game of Rock Ppaer Scissors:");
        System.out.println ("You pick one of the three choices, Rock, Paper, Scissors");
        System.out.println ("Scissors BEATS Paper \nRock BEATS Scissors \nPaper BEATS Rock");
        System.out.println ("You play till whoever wins the most games out of 3, a tie results in 0 points.");

    }

    public void options ()
    {
        int correct = 0;
        //makes sure the right character is typed.
        while (correct == 0)
        {
            RPS = IBIO.inputChar ("\nWhat is your choice (R,P,S);");

            //Displays choice in words.
            if (RPS == 'R' || RPS == 'r')
            {
                System.out.print (" You picked ROCK\n");
                correct ++;
            }
            else if (RPS == 'S' || RPS == 's')
            {
                System.out.print (" You picked SCISSORS\n");
                correct ++;
            }
            else if (RPS == 'P' || RPS == 'p')
            {
                System.out.print (" You picked PAPER\n");
                correct ++;
            }
            else
            {System.out.print ("Error, Please Try Again\n");
                //correct ++;
            }
        }
        
        int upc = (int) (Math.random ()*3) + 1;
        
        
        //randomly picks the cpu choice.
        if (upc == 1)
        {
            cpu = 'R';
            System.out.println ("The opponent picked ROCK\n");
        }
        else if (upc == 2)
        {
            cpu = 'S';
            System.out.println ("The opponent picked SCISSORS\n");
        }
        else 
        {
            cpu = 'P';
            System.out.println ("The opponent picked PAPER\n");
        }
    }

    public void score ()
    {
        play = 'y';
        //check who won the game.
        if (RPS == 'S' || RPS == 's')
        {
            if (cpu == 'P')
            {
                System.out.println ("YOU WIN THE GAME");
                score ++;
                play = 'n';
            }
            else if (cpu == 'R')
            {
                System.out.println ("YOU LOSE THE GAME");
                cpuscore ++;
                play = 'n';

            }
            else
            {
                System.out.println ("YOU TIED, GO AGAIN");
            }
        }
        else if (RPS == 'P' || RPS == 'p')
        {
            if (cpu == 'R')
            {
                System.out.println ("YOU WIN THE GAME");
                score++;
                play = 'n';
            }
            else if (cpu == 'S')
            {
                System.out.println ("You LOSE THE GAME");
                cpuscore++;
                play = 'n';
            }
            else
            {
                System.out.println ("You TIED, GO AGAIN");
            }
        }
        else if (RPS == 'R' || RPS == 'r')
        {
            if( cpu == 'S')
            {
                System.out.println ("YOU WIN THE GAME");
                score++;
                play = 'n';
            }
            else if (cpu == 'P')
            {
                System.out.println ("YOU LOSE THE GAME");
                cpuscore++;
                play = 'n';
            }
            else
            {
                System.out.println ("YOU TIED, GO AGAIN");
            }

        }
    
    System.out.println (" Your score is " + score);
    System.out.println (" The opponent's score is " + cpuscore);
    }
    

}

    