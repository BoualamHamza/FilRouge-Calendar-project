package constraints;

import java.util.HashSet;

import solvers.TopologicalSorter;

public class Tests {

	public static void main(String[] args) {
		Activity act1 = new Activity("Aller à l'université", 15);
		Activity act2 = new Activity("Attacher le vélo", 2);
		Activity act3 = new Activity("Aller dans la salle", 3);
		Activity act4 = new Activity("Sortir ses affaires", 1);
		PrecedenceConstraint c1 = new PrecedenceConstraint(act1, act2);
		PrecedenceConstraint c2 = new PrecedenceConstraint(act2, act3);
		PrecedenceConstraint c3 = new PrecedenceConstraint(act4, act4);
		PrecedenceConstraint c4 = new PrecedenceConstraint(act2, act4);
		
		System.out.println(c1.isSatisfied(0, 4) ? "La condition c1 est validée" : "La condition c1 n'est pas validée");
		System.out.println(c2.isSatisfied(0, 40) ? "La condition c2 est validée" : "La condition c2 n'est pas validée");
		System.out.println(c3.isSatisfied(0, 5) ? "La condition c3 est validée" : "La condition c3 n'est pas validée");
		System.out.println(c4.isSatisfied(0, 11) ? "La condition c4 est validée" : "La condition c4 n'est pas validée");
		
		Activity a1 = new Activity("Se lever", 1);
		Activity a2 = new Activity("Aller au travail", 15);
		Activity a3 = new Activity("Prendre une douche", 10);
		Activity a4 = new Activity("Se brosser les dents", 3);
		Activity a5 = new Activity("S'habiller", 2);
		Activity a6 = new Activity("Prendre un petit déjeuner", 15);
		Activity a7 = new Activity("Prendre connaissance du sujet d'examen", 5);
		Activity a8 = new Activity("Réviser", 30);
		Activity a9 = new Activity("Passer l'examen", 60);
		
		HashSet<Activity> activitiesEx1 = new HashSet<>();
		activitiesEx1.add(a1);
		activitiesEx1.add(a2);
		activitiesEx1.add(a3);
		activitiesEx1.add(a4);
		activitiesEx1.add(a5);
		activitiesEx1.add(a6);
		
		HashSet<Activity> activitiesEx2 = new HashSet<>();
		activitiesEx2.add(a7);
		activitiesEx2.add(a8);
		activitiesEx2.add(a9);
		
		HashSet<PrecedenceConstraint> triConstraints1 = new HashSet<>();
		triConstraints1.add(new PrecedenceConstraint(a1, a6));
		triConstraints1.add(new PrecedenceConstraint(a1, a5));
		triConstraints1.add(new PrecedenceConstraint(a6, a4));
		triConstraints1.add(new PrecedenceConstraint(a3, a5));
		triConstraints1.add(new PrecedenceConstraint(a4, a2));
		triConstraints1.add(new PrecedenceConstraint(a5, a2));
		triConstraints1.add(new PrecedenceConstraint(a6, a2));

		HashSet<PrecedenceConstraint> triConstraints2 = new HashSet<>();
		triConstraints2.add(new PrecedenceConstraint(a8, a9));
		triConstraints2.add(new PrecedenceConstraint(a9, a7));
		triConstraints2.add(new PrecedenceConstraint(a7, a8));
		
		TopologicalSorter ts = new TopologicalSorter();
		System.out.println("\nTri topologique (1)");
		if(ts.bruteForceSort(activitiesEx1, triConstraints1) != null) {
			for(Activity a : ts.bruteForceSort(activitiesEx1, triConstraints1)) { 
				System.out.println(a.getDescription()); 
			}
		} 
		System.out.println("\nTri topologique (2)");
		System.out.println(ts.bruteForceSort(activitiesEx2, triConstraints2));
		System.out.println(ts.schedule(activitiesEx2, triConstraints2));
	}
	
	
}
