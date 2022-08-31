package solvers;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import constraints.Activity;
import constraints.Constraint;

public class Verifier {

	Set<Constraint> constraints;
	
	public Verifier(Set <Constraint> constraints) {
		this.constraints = constraints;
	}
	
	public Set<Constraint> unsatisfied(Map<Activity, Integer> timeTable) {
		Set<Constraint> uConstraints = new HashSet<>();
		for(Constraint c : constraints) {
			if(!c.isSatisfied(timeTable)) {
				uConstraints.add(c);
			}
		}
		return uConstraints;
	}
	
}
