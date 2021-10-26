package fr.mael;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *  Un objet Quiz représente une liste de questions.
 *  
 *  <p> Jouer au quiz consiste à répondre aux questions et à cumuler
 *  un total de points obtenus pour les bonnes réponses. </p>
 *
 * <p> Exemple de code:
 * <pre>
 * Quiz quiz = new Quiz();
 * quiz.add(new IntQuestion("Nombre de mousquetaires ?", 2, 4));
 * int score = quiz.play();
 * </pre>
 * </p>
 */
public class Quiz {

    /** Quiz.scan permet de lire les réponses aux questions. */
    public static Scanner scan = new Scanner(System.in);

    //Attributs
    ArrayList<Question> allQ;


    /** Constructeur initialisant un quiz vide. */
    public Quiz() {
	    allQ = new ArrayList<>();
    }

    //Méthode
    public void add(Question q ){
        allQ.add(q);
    }
 
    /**
     *  Joue au quiz en répondant aux questions.
     *  @return le nombre total de points cumulés par les bonnes réponses
     */
    public int play() {
        int score = 0;
        for(Question q : allQ){
            q.ask();
            if(q.readAnswer()) {
                System.out.println("... Vrai ... +" + q.getValue());
                score += q.getValue();
            }
            else {
                System.out.println("...False");
            }
        }
        return score;
    }

}
