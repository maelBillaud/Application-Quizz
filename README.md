# Application de quizz 

## 1. Structure de programme :

### - Classe  Question (Abstraite)
    C'est la classe abstraite dont vont découler toutes les autres classes de question.

#### ~ Classe IntQuestion (Fille de Question)
        Question dont on ne répond que par un entier.

#### ~ Classe MulChoiceQuestion (Fille de Question)
        Question à choix multiple.

#### ~ Classe MulChoiceAnswer (Fille de Question)
        Question avec plusieurs réponses (au maximum 2 réponses).

#### ~ Classe YesNoQuestion (Fille de Question)
        Question à laquelle on doit répondre par oui ou non.

#### ~ Classe WordQuestion (Fille de Question)
        Question à laquelle on doit répondre avec un mot.

#### ~ Classe Quiz
        Contient la méthode play() qui permet de jouer au quiz en répondant aux questions.