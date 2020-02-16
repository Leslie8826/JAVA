public class Robot {
	private String name;
	private String direction;
	private int location_x, location_y;
	
	// Initializes the instance variables of the robot object
	Robot2(String name, String direction, int x, int y){
		this.name = name;
		this.direction = direction;
		this.location_x = x;
		this.location_y = y;
	}
	
	// Sets the location of the robot on the x axis
	// Also defines the direction according to the steps taken
	void setLocation_x(int steps) {
		if(steps > 0) {
			this.direction = "East";
			this.location_x = this.location_x + steps;
		} else if(steps == 0) {
			this.direction = this.direction;
			this.location_x = this.location_x + steps;
		} else if(steps < 0) {
			this.direction = "West";
			this.location_x = this.location_x + steps;
		}
	}
	
	// Sets the location of the robot on the y axis
	// Also defines the direction according to the steps taken
	void setLocation_y(int steps) {
		if(steps > 0) {
			this.direction = "North";
			this.location_y = this.location_y + steps;
		} else if(steps == 0) {
			this.direction = this.direction;
			this.location_y = this.location_y + steps;
		} else if(steps < 0) {
			this.direction = "South";
			this.location_y = this.location_y + steps;
			}
	}
	
	int getLocation_x() {
		return this.location_x;
	}
	
	int getLocation_y() {
		return this.location_y;
	}
	
	String getDirection() {
		return this.direction;
	}
	
	void currentLocation() {
		System.out.println("\n Robot "+ this.name + ":\n direction: " +this.direction + "\n location: x = " + getLocation_x() + ", y = " + getLocation_y());
	}
}

