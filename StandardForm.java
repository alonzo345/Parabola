/**
 * The class containing the methods for calculating the Standard form
 * properties.
 * 
 * @author Alon Zohar
 */
public class StandardForm extends Parabola {
	protected double b, c;

	/**
	 * Constructor.
	 * 
	 * @param a
	 *            The Parabola's a.
	 * @param b
	 *            The Parabola's b.
	 * @param c
	 *            The Parabola's c.
	 */
	public StandardForm(double aValue, double bValue, double cValue) {
		super(aValue);
		b = bValue;
		c = cValue;
	}

	/**
	 * Calculates f(x).
	 * 
	 * @param x
	 *            The x in f(x).
	 * @return f(x)
	 */
	public double calcY(double x) {
		return a * Math.pow(x, 2) + b * x + c;
	}

	/**
	 * Calculates the Axis of Symmetry.
	 * 
	 * @return The Axis of Symmetry.
	 */
	public double calcAxisOfSymmetry() {
		return -b / (2 * a);
	}

	/**
	 * Calculates one of the Parabola's intersection with the x axis.
	 * 
	 * @return One of the Parabola's intersection with the x axis.
	 */
	public Point calcIntersectionX1() {
		return new Point(
				(-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a), 0);
	}

	/**
	 * Calculates one of the Parabola's intersection with the x axis.
	 * 
	 * @return One of the Parabola's intersection with the x axis.
	 */
	public Point calcIntersectionX2() {
		return new Point(
				(-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a), 0);
	}

	/**
	 * Creates a String representation of the reference Parabola in Standard
	 * Form.
	 * 
	 * @return A String representation of the reference Parabola in Standard
	 *         Form.
	 */
	public String toStandard() {
		return a + "x^2 + " + b + "x + " + c;
	}

	/**
	 * Creates a String representation of the reference Parabola in Vertex Form.
	 * 
	 * @return A String representation of the reference Parabola in Vertex Form.
	 */
	public String toVertex() {
		return a + "(x - " + this.calcVertexCoordinates().getX() + ") + "
				+ this.calcVertexCoordinates().getY();
	}

	/**
	 * Creates a String representation of the reference Parabola in Intercept
	 * Form.
	 * 
	 * @return A String representation of the reference Parabola in Intercept
	 *         Form.
	 */
	public String toIntercept() {
		return a + "(x - " + this.calcIntersectionX1().getX() + ")(x - "
				+ this.calcIntersectionX2().getX() + ")";
	}
}