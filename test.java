/*
 *Hello guys, thanks for looking at my code
 *This is very basic, as everything is in the main method
 *
 *
 *
 *
 *
 *
 *
 */
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    String path;

    System.out.print("\fWhat's your name? : ");
    String name = kb.nextLine();
    System.out.println("Hi, " + name + ", welcome to this program!");
    System.out.println("Choose what you would like to learn about: ");
    System.out.println("Enter '1' to learn some basic java code");
    System.out.println("Enter '2' to hear some testimony about computer science");
    System.out.println("Enter '3' to learn about the academic and professional journey");
    //System.out.println("Enter '4' to read some texts about computer science");
    System.out.print("--> ");
    path = kb.next();

    if (path.equals("1")) //One layer deep 
    {
        String path1;
        char q = '"';
        System.out.println("\fThank you " + name + ", you pressed 1 to learn some Java!" );
        System.out.println("What would you like to learn about?");
        System.out.println("Enter '1' to learn about printing");
        System.out.println("Enter '2' to learn about reading from keyboard");
        System.out.println("Enter '3' to learn about variables");
        System.out.println("Enter '4' to learn about loops");
        System.out.print("--> ");
        path1 = kb.next();
        
        if (path1.equals("1")) //Two layers deep
        {
            System.out.println("\fHere an example of some code I have been using in order to print things out to you:");
            System.out.println("System.out.println(" + q + "Enter '1' to learn about printing" + q + ");" ); 
            System.out.println("^ This System.out.println part is doing most of the work.");
            System.out.println("The System.out part is part of Java itself, so the println is more interesting.");
            System.out.println("The println tells this computer to print out whatever is inside the parenthesis");
            System.out.println("The ln part of println tells the computer, in basic terms, to hit the enter key and start a new line.");
            System.out.println("The parenthesis and inital quote house everything that will be printed out.");
            System.out.println("Then after another quote and parenthesis, the semi-colon tells Java this command is done."); 
        }

        else if (path1.equals("2"))
        {
            System.out.println("\fHere is some code that helped me read what you typed in as your name:");
            System.out.println("import java.util.Scanner;");
            System.out.println("Scanner kb = new Scanner(System.in);");
            System.out.println("name = kb.next()");
            System.out.println("\nThat import is allowing me to run code that is already made so I don't have to write it.");
            System.out.println("The java.util is part of the library where I get it from.");
            System.out.println("The Scanner is the important part because it allows me to get something you have typed.");
            System.out.println("\nThe next line is me actually creating the Scanner so I can use it, the Scanner is now  called kb.");
            System.out.println("The System.in initializes the Scanner so it reads from the computer/keyboard");
            System.out.println("\nThe last line fills a name variable with whatever you have typed when prompted");
        }

        else if (path1.equals("3"))
        {
            System.out.println("\fHere is some code that I have used to create variables:");
            System.out.println("\nString path;");
            System.out.println("\nchar q = '" + q + "';");
            System.out.println("Both of these accomplish the same task but do different things");
            System.out.println("The first one creates a String called path, a String being any typed character(s)");
            System.out.println("The variable is actually filled with nothing until later when I fill it with path = kb.next()");
            System.out.println("The char one is different because, first off, a char only allows one character to be saved.");
            System.out.println("This is different from a String, which can hold one or many characters.");
            System.out.println("This one is different from path because I am saying that q is a quote from the beginning instead of changing it later.");
            System.out.println("There are many ways to create variables depending on what you want to store, these include: ");
            System.out.println("char, which can hold a single character");
            System.out.println("int, which can hold any whole number up to 2^32");
            System.out.println("String, which can hold many characters/symbols that aren't special in Java such as a backslash");
            System.out.println("double, which can hold a number with a decimal point");
        }

        else if (path1.equals("4"))
        {
            String path12;
            System.out.println("There are multiple types of loops, which would you like to learn about?");
            System.out.println("Enter '1' for if/else statements");
            System.out.println("Enter '2' for while loops");
            System.out.println("Enter '3' for for loops");
            System.out.print("--> ");
            path12 = kb.next();
            if (path12.equals("1")) //three layers deep
            {
                System.out.println("\fWelcome to this section on if/else statement, the thing I have used the most of besides printing.");
                System.out.println("Here is one of the if statements that allowed me to direct you to this point:");
                System.out.println("if (path.equals(" + q + "1" + q + "))");
                System.out.println("An if-statement is pretty self-explanatory loop, it does the code after it only if the condition has been met.");
                System.out.println("For this statement, the code continues if the key that you pressed was 1, which it was");
                System.out.println("If that if statement is not accepted, you can have other if statements using else if.");
                System.out.println("If none of your if or else if statements worked, the code after just else is run");
            }

            else if (path12.equals("2"))
            {
                System.out.println("\fWelcome to this section on while loops, there are two main types of while loops.");
                System.out.println("A while loop normally looks like this: ");
                System.out.println("\nwhile (condition)");
                System.out.println("{");
                System.out.println("   //code to run");
                System.out.println("}");
                System.out.println("The other type of while loop is a do-while loop and it looks like this: ");
                System.out.println("do");
                System.out.println("{");
                System.out.println("   //code to run");
                System.out.println("} while(condition)");
                System.out.println("\nThe major difference between the two is that a do-while is guarenteed to run at least once.");


            }

            else if (path12.equals("3"))
            {
                System.out.println("\fWelcome to this section on for loops, here is the outline of a basic for loop: ");
                System.out.println("for (initialized loop variable; condition; manipulating loop varaible)");
                System.out.println("{");
                System.out.println("  //code to run");
                System.out.println("}");
                System.out.println("\nHere is an example with the outline filled in: ");
                System.out.println("for (int i = 0; i != 10; i++)");
                System.out.println("      ^ This first part creates an i variable that is set to zero");
                System.out.println("\nfor (int i = 0; i != 10; i++)");
                System.out.println("                  ^ This second part tells the loop to run if i is not equal to 10");
                System.out.println("\nfor (int i = 0; i != 10; i++)");
                System.out.println("                           ^ This third part sets i to one more than it was, after one loop it is now equal to one, not zero");
            }

        }


    }

    else if (path.equals("2")) 
    {

        System.out.println("\fThank you " + name + ", you pressed 2 to hear some testimony" );
    } 

    else if (path.equals("3")) 
    {
        String path3;
        System.out.println("\fThank you " + name + ", you pressed 3 to learn about the academic journey");
        System.out.println("Would you like to learn about my college coursework or my future professional journey?");
        System.out.println("Enter '1' to learn about my coursework");
        System.out.println("Enter '2' to learn about my future");
        System.out.print("--> ");
        path3 = kb.next();
        if (path3.equals("1"))
        {
            System.out.println("\fHere is a condensed list of the most important classes I will have to take here at App");
            System.out.println("\nCS 1440 - Computer Science I");
            System.out.println("CS 2440 - Computer Science II");
            System.out.println("CS 2450 - Intro to Computer Systems");
            System.out.println("CS 2490 - Intro to Theoretical Computer Science");
            System.out.println("CS 3100 - Junior Seminar");
            System.out.println("CS 3430 - Database");
            System.out.println("CS 3460 - Data Structures");
            System.out.println("CS 3481 - Computer Systems I");
            System.out.println("CS 3482 - Computer Systems II");
            System.out.println("CS 3490 - Programming Languages");
            System.out.println("CS 3667 - Software Engineering");
            System.out.println("CS 4100 - Senior Seminar");
            System.out.println("CS 4510 - Senior Honors Thesis");
            System.out.println("CS 1100 - Discrete Mathematics");
            System.out.println("MAT 1110 - Calculus with Analytical Geometry I");
            System.out.println("MAT 1120 - Calculus with Analytical Geometry II");
            System.out.println("MAT 2240 - Intro to Linear Algebra");  
            System.out.println("STT 3850 - Statistical Data Analysis I");

        }
        else if (path3.equals("2"))
        {
            System.out.println("\fHere are eight jobs that a computer science degree will help you get.");
            System.out.println("\nSoftware Developer (This is what I want to do) - Developing software that solves a goal or perform a function");
            System.out.println("\nComputer Programmer - They write and debug code to be used in software");
            System.out.println("\nWeb Developer - Creates and streamlines webpages and aids in web development");
            System.out.println("\nComputer Hardware Engineer - Makes and develops computer parts and tests these parts");
            System.out.println("\nDatabase Administrator - Creates databases that help store user data");
            System.out.println("\nComputer Systems Analyst - Hired by a company to test their website and software and suggests changes");
            System.out.println("\nComputer Network Architect - Help establish data connections for an entire company");
            System.out.println("\nInformation Security Analyst - Helps to develop code to protect the data of users and of companies"); 
        }

    }

   /* else if (path.equals("4")) 
    {
        System.out.println("Congrats " + name + ", you pressed 4!");
    }*/
    else
    {
        System.out.println("This code is no place for a rebel soul");
        
    }

    }

}
