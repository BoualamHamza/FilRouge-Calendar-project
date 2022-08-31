package solvers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import constraints.Activity;
import constraints.Constraint;

public class RandomScheduler {
	
	java.util.Random random;
	
	public RandomScheduler(java.util.Random random) {
		this.random = random;
	}
	
	public Map<Activity, Integer> generateOneSchedule(Set<Activity> activities, int dateMin, int dateMax) {
		Map<Activity, Integer> scheduled = new HashMap<>();
		for(Activity a : activities) {
			int r = random.nextInt(dateMax - dateMin + 1) + dateMin;
			scheduled.put(a, r);
		}
		return scheduled;
	}
	
	public Map<Activity, Integer> generateSchedule(Set<Activity> activities, Set<Constraint> constraints, int dateMin, int dateMax, int nbrTirages) {
		ArrayList<Map<Activity, Integer>> timeTables = new ArrayList<>();
		for(int i = 0; i < nbrTirages; i++) { timeTables.add(generateOneSchedule(activities, dateMin, dateMax)); }
		
		Map<Activity, Integer> bestTimeTable = new HashMap<>();
		int bestTtConstraints = Integer.MAX_VALUE;
		Verifier v = new Verifier(constraints);
		for(int j = 0; j < timeTables.size(); j++) {
			int currentTtConstraints = v.unsatisfied(timeTables.get(j)).size();
			if(currentTtConstraints < bestTtConstraints) {
				bestTimeTable = timeTables.get(j);
				bestTtConstraints = currentTtConstraints;
			}
		}
		
		return bestTimeTable;
	}
	
}
