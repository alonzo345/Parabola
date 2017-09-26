/**
 * The class containing the method names.
 * 
 * @author Alon Zohar
 */
abstract public class Parabola {
	protected double a;

	// Note: add option to calc y in main.

	/**
	 * Constructor.
	 * 
	 * @param a
	 *            The Parabola's a.
	 */
	public Parabola(double aValue) {
		a = aValue;

		if (a == 0) {
			a = 1;
		}
	}

	/**
	 * Calculates f(x).
	 * 
	 * @param x
	 *            The x in f(x).
	 * @return f(x)
	 */
	public abstract double calcY(double x);

	/**
	 * Calculates the Axis of Symmetry.
	 * 
	 * @return The Axis of Symmetry.
	 */
	public abstract double calcAxisOfSymmetry();

	/**
	 * Calculates the vertex's coordinates.
	 * 
	 * @return The vertex's coordinates.
	 */
	public Point calcVertexCoordinates() {
		return new Point(this.calcAxisOfSymmetry(), this.calcY(this
				.calcAxisOfSymmetry()));
	}

	/**
	 * Calculates the vertex's type.
	 * 
	 * @return The vertex's type.
	 */
	public String calcVertexType() {
		return 0 < a ? "minimum" : "maximum";
	}

	/**
	 * Calculates one of the Parabola's intersection with the x axis.
	 * 
	 * @return One of the Parabola's intersection with the x axis.
	 */
	public abstract Point calcIntersectionX1();

	/**
	 * Calculates one of the Parabola's intersection with the x axis.
	 * 
	 * @return One of the Parabola's intersection with the x axis.
	 */
	public abstract Point calcIntersectionX2();

	/**
	 * Calculates the Parabola's intersection with the y axis.
	 * 
	 * @return the Parabola's intersection with the y axis.
	 */
	public Point calcIntersectionY() {
		return new Point(0, this.calcY(0));
	}

	/**
	 * Calculates when is the Parabola rising.
	 * 
	 * @return When is the Parabola rising.
	 */
	public String calcRising() {
		return 0 < a ? this.calcAxisOfSymmetry() + " < x" : "x < "
				+ this.calcAxisOfSymmetry();
	}

	/**
	 * Calculates when is the Parabola setting.
	 * 
	 * @return When is the Parabola rising.
	 */
	public String calcSetting() {
		return a < 0 ? this.calcAxisOfSymmetry() + " < x" : "x < "
				+ this.calcAxisOfSymmetry();
	}

	/**
	 * Calculates when is the Parabola positive.
	 * 
	 * @return When is the Parabola positive.
	 */
	public String calcPositiveZone() {
		if (a < 0 && calcVertexCoordinates().getY() <= 0) {
			return "No positive zone.";
		}

		if (0 < a && calcVertexCoordinates().getY() == 0) {
			return "Any X except 0.";
		}
		
		if (calcVertexCoordinates().getY() < 0 && 0 < a) {
			if (this.calcIntersectionX1().isLeft(this.calcIntersectionX2())) {
				return "x < " + this.calcIntersectionX1().getX() + " or "
						+ this.calcIntersectionX2().getX() + " < x";
			}

			if (this.calcIntersectionX1().isRight(this.calcIntersectionX2())) {
				return "x < " + this.calcIntersectionX2().getX() + " or "
						+ this.calcIntersectionX1().getX() + " < x";
			}
		}

		if (0 < calcVertexCoordinates().getY() && a < 0) {
			if (this.calcIntersectionX1().isLeft(this.calcIntersectionX2())) {
				return this.calcIntersectionX1().getX() + " < x < "
						+ this.calcIntersectionX2().getX();
			}

			if (this.calcIntersectionX1().isRight(this.calcIntersectionX2())) {
				return this.calcIntersectionX2().getX() + " < x < "
						+ this.calcIntersectionX1().getX();
			}
		}

		return "Any X.";
	}

	/**
	 * Calculates when is the Parabola negative.
	 * 
	 * @return When is the Parabola negative.
	 */
	public String calcNegativeZone() {
		if (a > 0 && calcVertexCoordinates().getY() >= 0) {
			return "No negative zone.";
		}

		if (0 > a && calcVertexCoordinates().getY() == 0) {
			return "Any X except 0.";
		}

		if (calcVertexCoordinates().getY() > 0 && 0 > a) {
			if (this.calcIntersectionX1().isLeft(this.calcIntersectionX2())) {
				return "x < " + this.calcIntersectionX1().getX() + " or "
						+ this.calcIntersectionX2().getX() + " < x";
			}

			if (this.calcIntersectionX1().isRight(this.calcIntersectionX2())) {
				return "x < " + this.calcIntersectionX2().getX() + " or "
						+ this.calcIntersectionX1().getX() + " < x";
			}
		}

		if (0 > calcVertexCoordinates().getY() && a > 0) {
			if (this.calcIntersectionX1().isLeft(this.calcIntersectionX2())) {
				return this.calcIntersectionX1().getX() + " < x < "
						+ this.calcIntersectionX2().getX();
			}

			if (this.calcIntersectionX1().isRight(this.calcIntersectionX2())) {
				return this.calcIntersectionX2().getX() + " < x < "
						+ this.calcIntersectionX1().getX();
			}
		}

		return "Any X.";
	}

	/**
	 * Creates a String representation of the reference Parabola in Standard
	 * Form.
	 * 
	 * @return A String representation of the reference Parabola in Standard
	 *         Form.
	 */
	public abstract String toStandard();

	/**
	 * Creates a String representation of the reference Parabola in Vertex Form.
	 * 
	 * @return A String representation of the reference Parabola in Vertex Form.
	 */
	public abstract String toVertex();

	/**
	 * Creates a String representation of the reference Parabola in Intercept
	 * Form.
	 * 
	 * @return A String representation of the reference Parabola in Intercept
	 *         Form.
	 */
	public abstract String toIntercept();

	/**
	 * Returns a String representation of the Parabola.
	 * 
	 * @return a String representation of the Parabola.
	 */
	public String toString() {
		String summery = "Axis of symmetry: " + this.calcAxisOfSymmetry();
		summery += "\nVertex coordinates: " + this.calcVertexCoordinates();
		summery += "\nVertex type: " + this.calcVertexType();
		summery += "\nIntersection with x-axis: " + this.calcIntersectionX1();
		summery += "\nIntersection with x-axis: " + this.calcIntersectionX2();
		summery += "\nIntersection with y-axis: " + this.calcIntersectionY();
		summery += "\nThe Parabola is rising when: " + this.calcRising();
		summery += "\nThe Parabola is setting when: " + this.calcSetting();
		summery += "\nThe Parabola is positive when: "
				+ this.calcPositiveZone();
		summery += "\nThe Parabola is negative when: "
				+ this.calcNegativeZone();
		summery += "\nThe Parabola in Standard form: " + this.toStandard();
		summery += "\nThe Parabola in Vertex form: " + this.toVertex();
		summery += "\nThe Parabola in Intercept form: " + this.toIntercept();

		return summery;
	}
}