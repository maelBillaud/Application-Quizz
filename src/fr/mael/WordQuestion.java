package fr.mael;

import java.util.Scanner;

public class WordQuestion extends Question{

    public static Scanner scan = new Scanner(System.in);

    //Attributs
    private String text;
    private String answer;

    //Constructeur

    public WordQuestion(){
        text = "";
        answer = "";
    }

    public WordQuestion(String t, int v, String a){
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

    public void ask(){
        System.out.println(text + " (Entrez un mot)");
    }

    public boolean readAnswer(){
        String ans = scan.nextLine();
        return (ans.equals(answer));
    }
}
