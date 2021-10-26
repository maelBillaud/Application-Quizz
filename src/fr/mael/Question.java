package fr.mael;

/**
 * Classe abstraite représentant une question dans un quiz.
 * 
 * <p>
 * Toute question est associée à une valeur entière positive
 * qui représente le gain si on répond bien.
 * </p>
 */
public abstract class Question {

    private int value;  // valeur d'une question

    /**
     * Constructeur.
     * @param val valeur de la question
     */
    public Question (int val) {
	value = val;
    }

    /**
     * Constructeur par défaut initialisant une instance avec la valeur 0.
     */
    public Question () {
	    this(0);
    }

    /**
     * Getter.
     * @return la valeur de this
     */
    public int getValue() {
	return value;
    }

    /**
     * Setter.
     * @param val la nouvelle valeur de this
     * @return this
     */
    public Question setValue(int val) {
	    value = val;
	    return null;
    }
    
    /** Affiche la question à l'écran. */
    public abstract void ask();
    
    /**
     *  Lit la réponse au clavier.
     *  @return true si la réponse est bonne, faux sinon
     */
    public abstract boolean readAnswer();


}
