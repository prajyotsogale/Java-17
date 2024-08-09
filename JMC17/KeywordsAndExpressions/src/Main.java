public class Main {
    public static void main(String[] args) {
        //In Java Programming language
        //A Keyword is one of 51 reserve words that have a predefined meaning in a language
        //Writing code is similar to writing a document. It consists of special
        //hierarchical units, which together form a whole
        //These are:
        //The Expression - An expression computes to a single value.
        //The Statement - Statements are stand-alone units of work.
        //And Code Blocks - A code block is a set of zero, one or more statements,
        //usually grouped together in some way to achieve a single goal.


        double kilometers = (100*1.609344);

        //Datatype and Semicolon at the end are not part of the expression

        int health = 50;
        if ((health > 25) && (health < 60)){
            health = health - 20;

            //health = health - 20 contains two statements
            //one is health -20 and other one is the whole line 21(above line)

            System.out.println(health);
            //Shortcut --  sout and enter






//-------------------------------------------New-------------------------------------


            int myVariable = 50;
            //In this case myVariable is an expression and the entire line including
            //int and semicolon is a statement
            myVariable++;
            myVariable--;

            int textt =
                    20
                    ;

            //semicolon means end of the statement

            int anotherVariable = 20;anotherVariable--;System.out.println("myVariable = "+anotherVariable);

            //java simply ignores the space
            int                 testSpace
                         =
                                   50
                        ;
            System.out.println(testSpace);

            //Rules for white space
            //https://google.github.io/styleguide/javaguide.html#s4.6-whitespace

            //use reformat code feature of intellij

            int tex1 = 12;
            int tex2 = 50;
            double tex4 = 34d;
            System.out.println("Reformat test");

            //first select the code and go to code(in menu bar) and
            //select the Reformat code option

            //To remove all the default indentation select the code and
            //type --   shift tab




            //if then statement
//            if(condition){
//
//            }

            //use else if the middle

            //code blocks refers to the section of code that is enclosed in
            // curly braces {}









        }
    }
}
