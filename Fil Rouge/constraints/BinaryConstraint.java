package constraints;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class BinaryConstraint implements Constraint {

	Activity act1, act2;
	
	public BinaryConstraint(Activity act1, Activity act2) {
		this.act1 = act1;
		this.act2 = act2;
	}
	
	public Activity getFirst() { return act1; }
	
	public Activity getSecond() { return act2; }
	
	@Override
	public Set<Activity> getActivities() {
		Set<Activity> acts = new HashSet<>();
		acts.add(this.act1);
		acts.add(this.act2);
		return acts;
	}
	
	public boolean isSatisfied(int date1, int date2) {
		if(date1 + this.act1.getDuration() < date2) return true;
		return false;
	}
	
	@Override
	public boolean isSatisfied(Map<Activity, Integer> timeTable) {
		return isSatisfied(timeTable.get(getFirst()), timeTable.get(getSecond()));
	}
	
}
