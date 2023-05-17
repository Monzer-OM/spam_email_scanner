package SpamEmail;

import java.util.Scanner;

// Spam (or junk e-mail) costs U.S. organizations billions of dollars a year in spam-prevention software,
// equipment, network resources, bandwidth, and lost productivity. Research online some of the most common spam e-mail messages and words,
//  and check your own junk e-mail folder. Create a list of 30 words and phrases commonly found in spam messages. Write an application in which the user enters an e-mail message.
//  Then, scan the message for each of the 30 keywords or phrases. For each occurrence of one of these within the message,
//  add a point to the message's "spam score." Next, rate the likelihood that
//  the message is spam, based on the number of points it received.

public class tryy {
    public static void main(String[] args) {
        // List of 30 keywords or phrases commonly found in spam messages
        String[] spamWordsList = { "act now",
                "apply now",
                "become a member",
                "call now",
                "click below",
                "click here",
                "get it now",
                "do it today",
                "exclusive deal",
                "get started now",
                "information you requested",
                "instant",
                "free gift",
                "free hosting",
                "free info",
                "free investment",
                "free membership",
                "free money",
                "free preview",
                "free quote",
                "free trial",
                "full refund",
                "get out of debt",
                "get paid",
                "giveaway",
                "guaranteed",
                "increase sales",
                "miracle",
                "money back",
                "one time",};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an email message:");
        String message = scanner.nextLine().toLowerCase();
        System.out.println(message);

        int score = 0;
        for (int i = 0; i < spamWordsList.length; i++) {
            if (message.contains(spamWordsList[i])) {
                score++;
            }
        }

        if (score > 4) {
            System.out.println("This message is likely spam. Your score is: " + score);
        } else {
            System.out.println("This message is probably not spam. Your score is: " + score);
        }

        scanner.close();
    }
}