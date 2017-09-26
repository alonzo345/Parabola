/**
 * Represents a point in the Cartesian system.
 * 
 * @author Alon Zohar
 */
public class Point {
	private double x, y;

	/**
	 * Constructor for objects of class Point. Construct a new point with the
	 * specified x y coordinates. If the x or y coordinate is negative it is set
	 * to zero.
	 * 
	 * @Param x The x coordinate.
	 * @Param y The y coordinate.
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Constructor for objects of class Point. Copy constructor, construct a
	 * point using another point.
	 * 
	 * @param Other
	 *            the reference point.
	 */
	public Point(Point other) {
		x = other.x;
		y = other.y;
	}

	/**
	 * Check the distance between this point and a given point.
	 * 
	 * @param Other
	 *            the point to check the distance from.
	 * 
	 * @return The distance.
	 */
	public double distance(Point other) {
		return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
	}

	/**
	 * Check if the given point is equal to this point.
	 * 
	 * @param Other
	 *            point to compare to.
	 * 
	 * @return True if the given point is equal to this point.
	 */
	public boolean equals(Point other) {
		return (x == other.x && y == other.y);
	}

	/**
	 * This method returns the x coordinate of the point.
	 * 
	 * @return The x coordinate.
	 */
	public double getX() {
		return x;
	}

	/**
	 * This method returns the y coordinate of the point.
	 * 
	 * @return The y coordinate.
	 */
	public double getY() {
		return y;
	}

	/**
	 * Check if this point is above a received point.
	 * 
	 * @param other
	 *            The received point.
	 * 
	 * @return True if the point is above the received point.
	 */
	public boolean isAbove(Point other) {
		return y > other.y;
	}

	/**
	 * Check if this point is left of a received point.
	 * 
	 * @param other
	 *            The received point.
	 * 
	 * @return True if the point is left of the received point.
	 */
	public boolean isLeft(Point other) {
		return x < other.x;
	}

	/**
	 * Check if this point is right of a received point.
	 * 
	 * @param other
	 *            The received point.
	 * 
	 * @return True if the point is right of the received point.
	 */
	public boolean isRight(Point other) {
		return other.isLeft(this);
	}

	/**
	 * Check if this point is under a received point.
	 * 
	 * @param other
	 *            The received point.
	 * 
	 * @return True if the point is under the received point.
	 */
	public boolean isUnder(Point other) {
		return other.isAbove(this);
	}

	/**
	 * Moves a point. If either coordinate becomes negative the point remains
	 * unchanged.
	 * 
	 * @param dx
	 *            The value of the horizontal move.
	 * @param dy
	 *            The value of the vertical move.
	 */
	public void move(double dx, double dy) {
		// Determines if the change will make the point negative.
		if (((x + dx) >= 0) && ((y + dy) >= 0)) {
			this.setXY(x + dx, y + dy);
		}
	}

	/**
	 * This method sets the x coordinate of the point. If the new x coordinate
	 * is negative the old x coordinate will remain unchanged.
	 * 
	 * @param xValue
	 *            The new x coordinate.
	 */
	public void setX(double xValue) {
		if (x >= 0) {
			this.setXY(xValue, y);
		}
	}

	/**
	 * This method sets the y coordinate of the point. If the new y coordinate
	 * is negative the old y coordinate will remain unchanged.
	 * 
	 * @param y
	 *            The new y coordinate.
	 */
	public void setY(double yValue) {
		if (y >= 0) {
			this.setXY(x, yValue);
		}
	}

	/**
	 * Returns a string representation of Point in the format (x,y).
	 * 
	 * @return String representation of Point in the format (x,y).
	 */
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	/**
	 * This method sets the x and y coordinates of the point.
	 * 
	 * @param xValue
	 *            The new x coordinate.
	 * @param yValue
	 *            The new y coordinate.
	 */
	public void setXY(double xValue, double yValue) {
		x = xValue;
		y = yValue;
	}
}