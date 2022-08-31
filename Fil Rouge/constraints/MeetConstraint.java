package constraints;

import java.util.HashSet;
import java.util.Set;

public class MeetConstraint extends BinaryConstraint implements Constraint {

	public MeetConstraint(Activity act1, Activity act2) { super(act1, act2); }
	
	public Activity getFirst() { return act1; }
	
	public Activity getSecond() { return act2; }
	
	public boolean isSatisfied(int date1, int date2) {
		if(date1 + this.act1.getDuration() == date2) return true;
		return false;
	}

	@Override
	public Set<Activity> getActivities() {
		Set<Activity> acts = new HashSet<>();
		acts.add(this.act1);
		acts.add(this.act2);
		return acts;
	}
	
}
