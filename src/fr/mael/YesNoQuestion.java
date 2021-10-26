package fr.mael;

import java.util.Scanner;

public class YesNoQuestion extends Question {

    public static Scanner scan = new Scanner(System.in);

    //Attributs
    private String text;
    private boolean answer;

    //Constructeur

    public YesNoQuestion(){
        text = "";
        answer = false;
    }

    public YesNoQuestion(String t, int v, boolean a){
        super(v);
        text = t;
        answer = a;
    }

    //Méthodes
    public void setText(String t){
        text = t;
    }

    public void setAnswer(boolean a){
        answer = a;
    }

    public void ask(){
        System.out.println(text + " (Entrez true ou false)");
    }

    public boolean readAnswer(){
        boolean ans = scan.nextBoolean();
        return (ans == answer);
    }
}
