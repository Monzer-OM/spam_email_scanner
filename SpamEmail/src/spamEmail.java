import java.util.Scanner;

public class spamEmail {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] spamWords = {"Act Now", "Apply Now", "As seen on", "Avoid bankruptcy", "Be your own boss", "Billion"
                , "Bonus", "Cash", "Cheap", "Clearance"
                , "Collect", "Compare rates", "Credit card offers", "Deal", "Direct email", "Direct marketing"
                , "Discount", "Double your income", "Earn extra cash"
                , "Earn money", "Eliminate bad credit", "Extra income"
                , "Fast cash", "Financial freedom", "Free access", "Cheap consultation ", "Free gift", "Free hosting ", "Free investment"}; // the Spam word
        int spamScore = 0;  // the spam score

        boolean again = true;
        String con;


        while (again) {

            System.out.println("Enter the Email you received to check if it has any spam words: ");
            String email = scan.nextLine().toUpperCase();


            for (int i = 0; i < spamWords.length; i++) {
                if (email.contains(spamWords[i].toUpperCase())) { // here I convert the spam word to upper case **
                    System.out.println("word found: " + spamWords[i]);
                    spamScore++;
                }
            } // end of for loop

            if (spamScore == 0) {
                System.out.println("This email doesn't have any spam word, that's mean it's safe!");
            } else {
                System.out.println("This email has " + spamScore + " spam words, be careful with it :)");
            } // end of if else

            System.out.println("Do you want to continue\n1 = YES\n0 = NO");
            con = scan.nextLine();
            if (con.equals("1")){
                //again = true;
                spamScore = 0;
            }else {
                again = false;
            }
        } // end of while loop
        System.out.println("DONE, hope safe live for u :) !");
    } // end main
}// end class