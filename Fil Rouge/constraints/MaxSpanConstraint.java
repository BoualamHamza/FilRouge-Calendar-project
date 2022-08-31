package constraints;

import java.util.Map;
import java.util.Set;

public class MaxSpanConstraint implements Constraint {
	Set<Activity> acts;
	int dureeMax;

	public MaxSpanConstraint(Set<Activity> acts, int dureeMax) {
		this.acts = acts;
		this.dureeMax = dureeMax;
	}
	
	@Override
	public Set<Activity> getActivities() {
		return acts;
	}

	@Override
	public boolean isSatisfied(Map<Activity, Integer> timeTable) {
		if(acts.isEmpty()) return true;
		int start = Integer.MAX_VALUE;
		int end = Integer.MIN_VALUE;
		for(Activity a : acts) {
			if(!timeTable.containsKey(a)) return false;
			if(timeTable.get(a) < start) { start = timeTable.get(a); } 
			if(timeTable.get(a) + a.getDuration() > end) { end = timeTable.get(a) + a.getDuration(); }
		} 
		return (end - start) <= dureeMax;
	}
	
}
