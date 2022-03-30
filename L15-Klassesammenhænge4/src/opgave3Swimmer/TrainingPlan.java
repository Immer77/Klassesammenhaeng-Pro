package opgave3Swimmer;

import opgave2gift.Person;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlan {
	private char level;
	private int weeklyWaterHours;
	private int weeklyStrengthHours;
	private final ArrayList<Swimmer> swimmers = new ArrayList<>();

	
	public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
		this.level = level;
		this.weeklyWaterHours = weeklyWaterHours;
		this.weeklyStrengthHours = weeklyStrengthHours;
	}
	
	public char getLevel() {
		return level;
	}
	
	public void setLevel(char niveau) {
		this.level = niveau;
	}
	
	public int getWeeklyStrengthHours() {
		return weeklyStrengthHours;
	}
	
	public void setWeeklyStrengthHours(int weeklyStrengthHours) {
		this.weeklyStrengthHours = weeklyStrengthHours;
	}
	
	public int getWeeklyWaterHours() {
		return weeklyWaterHours;
	}
	
	public void setWeeklyWaterHours(int weeklyWaterHours) {
		this.weeklyWaterHours = weeklyWaterHours;
	}

	/** Dobbeltrettet 0..1 til mange svømmere
	 * Man kan derfor tilføje mange svømmere til en træningsplan
	 * @param swimmer
	 */
	public void addSwimmer(Swimmer swimmer){
		if(!swimmers.contains(swimmer)){
			swimmers.add(swimmer);
			swimmer.setTrainingPlan(this);
		}
	}

	/**
	 * Fjerne svømmeren
	 * @param swimmer
	 */
	public void removeSwimmer(Swimmer swimmer) {
		if(swimmers.contains(swimmer)){
			swimmers.remove(swimmer);
			swimmer.setTrainingPlan(null);
		}
	}

	@Override
	public String toString(){
		return "\nLevel: " + this.level + " WeeklyStrengthHours: " + this.weeklyStrengthHours + " WeeklyWaterHours: " + this.weeklyWaterHours;
	}
}
