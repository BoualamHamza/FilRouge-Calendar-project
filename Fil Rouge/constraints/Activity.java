package constraints;

public class Activity {

	String desc;
	int duree;
	
	public Activity(String desc, int duree) {
		this.desc = desc;
		this.duree = duree;
	}
	
	public String getDescription() { return desc; }
	
	public int getDuration() { return duree; }
	
}
