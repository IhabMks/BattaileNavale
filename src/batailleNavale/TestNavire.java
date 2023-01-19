package batailleNavale;

public class TestNavire {

	public static void main(String[] args) {
		
		Navire n = new Navire(new Coordonnee("A3"), 4, true);
		Navire N1 = new Navire(new Coordonnee("B9"), 3, true);
		Navire N2 = new Navire(new Coordonnee("B11"), 4, false);
		
		//partie touche
		Navire Nn1 = new Navire(new Coordonnee("D9"), 3, false);
		Navire Nn2 = new Navire(new Coordonnee("C11"), 4, false);
		Navire Nn3 = new Navire(new Coordonnee("A11"), 2, true);
		Navire Nn4 = new Navire(new Coordonnee("B12"), 3, false);
		Navire Nn5 = new Navire(new Coordonnee("B13"), 3, true);
		Navire Nn6 = new Navire(new Coordonnee("B6"), 2, true);
		
		//partie chevauche
		Navire Nc1 = new Navire(new Coordonnee("A9"), 4, false);
		Navire Nc2 = new Navire(new Coordonnee("B8"), 2, true);

		System.out.println(n);
		System.out.println(N1);
		System.out.println(N2);

		if (!n.contient(new Coordonnee("A3"))) {
			System.out.println("pb ne contient pas A3");
		}
		if (!n.contient(new Coordonnee("A4"))) {
			System.out.println("pb ne contient pas  A4");
		}
		if (!n.contient(new Coordonnee("A5"))) {
			System.out.println("pb ne contient pas  A5");
		}
		if (!n.contient(new Coordonnee("A6"))) {
			System.out.println("pb ne contient pas  A6");
		}

		if (n.contient(new Coordonnee("A2"))) {
			System.out.println("pb contient A2");
		}
		if (n.contient(new Coordonnee("A7"))) {
			System.out.println("pb contient A7");
		}
		if (n.contient(new Coordonnee("B4"))) {
			System.out.println("pb contient B4");
		}

		// Méthode touche cas : N1
		if (N1.touche(Nn1)) {
			System.out.println("pb N1 touche Nn1"); //en principe non
		}
		if (!N1.touche(Nn2)) {
			System.out.println("pb N1 ne touche pas Nn2");//en principe oui
		}
		if (!N1.touche(Nn3)) {
			System.out.println("pb N1 ne touche pas Nn3");//en principe oui
		}
		if (!N1.touche(Nn4)) {
			System.out.println("pb N1 ne touche pas Nn4");//en principe oui
		}
		if (N1.touche(Nn5)) {
			System.out.println("pb N1 touche Nn5"); //en principe non
		}
		if (N1.touche(Nn6)) {
			System.out.println("pb N1 touche Nn6");//en principe non
		}

		// Méthode touche cas : N2
		if (!N2.touche(Nn3)) {
			System.out.println("pb N2 ne touche pas Nn3");//en principe oui
		}
		if (N2.touche(Nn5)) {
			System.out.println("pb N2 touche Nn5");//en principe non
		}
		
		
		// Méthode chevauche
		if (N1.chevauche(Nn1)) {
			System.out.println("pb N1 chevauche Nn1"); //en principe non
		}
		if (!N1.chevauche(Nc1)) {
			System.out.println("pb N1 ne chevauche pas Nc1"); //en principe si
		}
		if (!N1.chevauche(Nc2)) {
			System.out.println("pb N1 ne chevauche pas Nc2"); //en principe si
		}

		
		 // [d1;f1] [d2;f2]
		 // [1;10] [5;15] -> intersectionNonVide true
		 // [5;15]  [1;10]-> intersectionNonVide true
		 // [1;10] [12;15] -> intersectionNonVide false
		/*if (! Navire.intersectionNonVide(1, 10, 5, 15)) {
			System.out.println("pb intersectionNonVide 1");
		}
		if (! Navire.intersectionNonVide( 5, 15, 1, 10)) {
			System.out.println("pb intersectionNonVide 2");
		}
		if (Navire.intersectionNonVide( 1, 10, 12, 15)) {
			System.out.println("pb intersectionNonVide 3");
		}
		if (Navire.intersectionNonVide(  12, 15, 1, 10)) {
			System.out.println("pb intersectionNonVide 4");
		}*/
		
		
		
		
	}

}
