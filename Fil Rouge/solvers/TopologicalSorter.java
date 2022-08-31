package solvers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import constraints.Activity;
import constraints.PrecedenceConstraint;

public class TopologicalSorter {

	public TopologicalSorter() {}
	
	public static void main(String[] args) {}
	
	public ArrayList<Activity> bruteForceSort(HashSet<Activity> acts, HashSet<PrecedenceConstraint> pcs) {
		ArrayList<Activity> res = new ArrayList<>();
		ArrayList<Activity> actCopy = new ArrayList<>(acts);
		
		while(!actCopy.isEmpty()) {
			boolean continuer = false;
			for(Activity o : actCopy) {
				boolean ok = true;
				for(PrecedenceConstraint c : pcs) { if(o == c.getSecond() && !res.contains(c.getFirst())) { ok = false;	}}
				if(ok) {
					res.add(o);
					actCopy.remove(o);
					continuer = true;
					break;
				}
			}
			if(!continuer) return null;
		}
		return res;
	}
	
	public HashMap<Activity, Integer> schedule(HashSet<Activity> acts, HashSet<PrecedenceConstraint> pcs) {
		HashMap<Activity, Integer> hm = new HashMap<>();
		ArrayList<Activity> r = bruteForceSort(acts, pcs);
		if(r == null) return null;
		Integer time = 0;
		for(int i = 0; i < r.size(); i++) {
			hm.put(r.get(i), time);
			time += r.get(i).getDuration();
		} return hm;
	}

}
