package fr.mael;

import java.util.ArrayList;
import java.util.Scanner;

public class MultChoiceAnswer extends Question  {
    public static Scanner scan = new Scanner(System.in);

    //Attributs
    private String text;
    ArrayList<String> choice = new ArrayList<>();
    private String answer1;
    private String answer2;

    //Constructeur

    public MultChoiceAnswer(){
        text = "";
        answer1 = "";
        answer2 = "";
    }

    public MultChoiceAnswer(String t, int v, String a, String b ){
        super(v);
        text = t;
        answer1 = a;
        answer2 = b;
    }

    //Méthodes
    public void setText(String t){
        text = t;
    }

    public void setAnswer1(String a){
        answer1 = a;
    }

    public void setAnswer2(String b){
        answer2 = b;
    }

    public void setBothAnswer(String a, String b){
        answer1 = a;
        answer2 = b;
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
        System.out.println(text + " (Entrez deux lettre) \n");
        for(int i = 0; i < choice.size(); i++){
            System.out.println(choice.get(i) + "\n");
        }
    }

    public boolean readAnswer(){
        String ans1 = scan.nextLine();
        String ans2 = scan.nextLine();
        return (ans1.equals(answer1) && ans2.equals(answer2));
    }
}
