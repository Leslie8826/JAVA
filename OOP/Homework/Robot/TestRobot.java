public class TestRobot {
	public static void main(String[] args) {
		Robot2 robot = new Robot2("R2D2", "North", 2, 5);
		
		robot.currentLocation();
		
		robot.setLocation_x(3);
		robot.currentLocation();
		
		robot.setLocation_x(3);
		robot.currentLocation();
		
		robot.setLocation_x(-7);
		robot.currentLocation();
		
		robot.setLocation_y(-7);
		robot.currentLocation();
		
		robot.setLocation_y(12);
		robot.currentLocation();
		
		robot.setLocation_y(0);
		robot.currentLocation();
		
		robot.setLocation_y(10);
		robot.currentLocation();
		
		robot.setLocation_x(0);
		robot.currentLocation();
		
		robot.setLocation_x(-1);
		robot.currentLocation();
		
		robot.setLocation_x(0);
		robot.currentLocation();
	}

}

