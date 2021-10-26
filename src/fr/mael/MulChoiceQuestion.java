package fr.mael;

import java.util.Scanner;
import java.util.ArrayList;

public class MulChoiceQuestion extends Question {
    public static Scanner scan = new Scanner(System.in);

    //Attributs
    private String text;
    ArrayList<String> choice = new ArrayList<>();
    private String answer;

    //Constructeur

    public MulChoiceQuestion(){
        text = "";
        answer = "";
    }

    public MulChoiceQuestion(String t, int v, String a){
        super(v);
        text = t;
        answer = a;
    }

    //Méthodes
    public void setText(String t){
        text = t;
    }

    public void setAnswer(String a){
        answer = a;
    }

    public void addChoicesout(){
        System.out.print("Entrez le nombre de choix qu'il y a pour ce QCM : ");
        int nbChoice = scan.nextInt();
        System.out.println();
        scan.nextLine();
        for(int i = 0; i < nbChoice; i++){
            System.out.print("Entrez l'option numéro " + (i+1) + " : ");
            String test = scan.nextLine();
            choice.add(test);
            //choice.add(scan.nextLine());
        }
    }

    public void addChoice(String A, String B, String C, String D){
        choice.add(A);
        choice.add(B);
        choice.add(C);
        choice.add(D);
    }

    public void ask(){
        System.out.println(text + " (Entrez une lettre) \n");
        for(int i = 0; i < choice.size(); i++){
            System.out.println(choice.get(i) + "\n");
        }
    }

    public boolean readAnswer(){
        String ans = scan.nextLine();
        return (ans.equals(answer));
    }
}
