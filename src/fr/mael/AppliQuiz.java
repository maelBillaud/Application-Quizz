package fr.mael;

public class AppliQuiz {

    public static void main(String[] args) {
	
	
	Quiz quiz = new Quiz();

	IntQuestion test = new IntQuestion();
	test.setText("Le nombre de mousquetaires ?");
	test.setAnswer(4);
	test.setValue(2);

	quiz.add(test);

	quiz.add(new YesNoQuestion("La formule faux => vrai est-elle vraie ?",3, true));

	quiz.add(new WordQuestion("Quelle est la capitale de la France ?",1, "Paris"));

	MulChoiceQuestion test2 = new MulChoiceQuestion("Qu'est ce qu'un GPU ? ", 4, "C");
	test2.addChoice("A. Un Gars Pas Utile","B. Un processeur", "C. Une carte graphique", "D.Aucune des réponses" );

	quiz.add(test2);

	MultChoiceAnswer test3 = new MultChoiceAnswer("Les caractéristiques du bilan comptable sont : ", 5, "A", "B");
	test3.addChoice("A. Le bilan n’est jamais remis à 0 d’année en année", "B. Les capitaux propres représentent la richesse de l’entreprise", "C.  On trouve le produit à gauche et les charges à droite", "D. On y trouve l’actif à gauche et le passif à droite");

	quiz.add(test3);



	int score = quiz.play();
	System.out.println("\nScore : " + score + " point(s)");
	

    }

}
