/**
 * Created by Mikholae on 12/28/16.
 */
import java.util.*;
public class ComlexConv {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Double conv, COMLEXscore, USMLEscore;
        System.out.print("Enter COMLEX score: ");
        COMLEXscore = input.nextDouble();
        USMLEscore = 67.97 + (0.24*COMLEXscore);
        System.out.println("A COMLEX score of " + COMLEXscore + " is equivalent to a USMLE score of " + USMLEscore );
        System.out.println();
        System.out.println("Disclaimer: Formula based on J.S. Slocum's \"How To Predict USMLE Scores From COMLEX-USA Scores: A Guide For Directors Of ACGME-Accredited Residency Programs.\". \nNcbi.nlm.nih.gov. N.p., 2016. Web. 29 Dec. 2016.");
    }
}
