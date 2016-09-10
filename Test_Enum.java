/*
An enumeration (often written as "enum") is a data type that consists of a fixed number of 
constants.

 */
enum Direction {
	NORTH (0),
	EAST (90),
	SOUTH (180),
	WEST (270);
	private final int degrees;
	Direction(int degrees) {
		this.degrees = degrees;
	}
	public int getDegrees() {
		return degrees;
	}
	// static because it doesn't rely on a particular direction
	public static Direction findCardinalDirection (int degrees) {
		if (degrees < 45) {
			return NORTH;
		} else if (degrees < 135) {
			return EAST;
		} else if (degrees < 225) {
			return SOUTH;
		} else if (degrees < 315) {
			return WEST;
		} else {
			return NORTH;
		}
	}
}
public class Test_Enum {

	public static void main(String[] args) {
		int[] compassPoints = {22, 77, 144, 288};
		for (int i = 0; i < compassPoints.length; i++) {
			System.out.println(compassPoints[i] + " degrees is (very roughly) "
					+ Direction.findCardinalDirection(compassPoints[i]));
		}
		for (Direction d : Direction.values()) {
			System.out.println(d + " is " + d.getDegrees() + " degrees.");
		}
	}
}
