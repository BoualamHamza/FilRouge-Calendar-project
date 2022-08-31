package constraints;

import java.util.Map;
import java.util.Set;

public interface Constraint {

	public Set<Activity> getActivities();
	public boolean isSatisfied(Map<Activity, Integer> arg);
	
}
