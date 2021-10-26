package fr.mael;

import java.util.Scanner;

public class IntQuestion extends Question {

    public static Scanner scan = new Scanner(System.in);

    //Attributs
    private String text;
    private  int answer;

    //Constructeur

    public IntQuestion(){
        text = "";
        answer = 0;
    }

    public IntQuestion(String t, int v, int a){
        super(v);
        text = t;
        answer = a;
    }

    //Méthodes

    public void setAnswer(int a) {
        answer = a;
    }

    public void setText(String t) {
        text = t;
    }


    public void ask(){
        System.out.println(text + " (Entrez un entier)");
    }

    public boolean readAnswer(){
        int ans = scan.nextInt();
        return (ans == answer);
    }
}
