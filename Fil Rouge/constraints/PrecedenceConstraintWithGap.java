package constraints;

public class PrecedenceConstraintWithGap extends PrecedenceConstraint{

	int delaiMin, delaiMax;
	
	public PrecedenceConstraintWithGap(Activity act1, Activity act2, int delaiMin, int delaiMax) {
		super(act1, act2);
		this.delaiMin = delaiMin;
		this.delaiMax = delaiMax;
	}
	
	public boolean isSatisfied(int date1, int date2) {
		if(date1 + getFirst().getDuration() + delaiMax >= date2 && date1 + getFirst().getDuration() + delaiMin <= date2) return true;
		return false;
	}
}
