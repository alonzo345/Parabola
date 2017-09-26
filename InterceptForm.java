/**
 * The class containing the methods for calculating the Intercept form
 * properties.
 * 
 * @author Alon Zohar
 */
public class InterceptForm extends Parabola {
	protected double x1, x2;

	/**
	 * Constructor.
	 * 
	 * @param a
	 *            The Parabola's a.
	 * @param x1
	 *            The Parabola's x1.
	 * @param x1
	 *            The Parabola's x2.
	 */
	public InterceptForm(double aValue, double x1Value, double x2Value) {
		super(aValue);
		x1 = x1Value;
		x2 = x2Value;
	}

	/**
	 * Calculates f(x).
	 * 
	 * @param x
	 *            The x in f(x).
	 * @return f(x)
	 */
	public double calcY(double x) {
		return a * (x - x1) * (x - x2);
	}

	/**
	 * Calculates the Axis of Symmetry.
	 * 
	 * @return The Axis of Symmetry.
	 */
	public double calcAxisOfSymmetry() {
		return -(x1 + x2) / (2 * a);
	}

	/**
	 * Calculates one of the Parabola's intersection with the x axis.
	 * 
	 * @return One of the Parabola's intersection with the x axis.
	 */
	public Point calcIntersectionX1() {
		return new Point(x1, 0);
	}

	/**
	 * Calculates one of the Parabola's intersection with the x axis.
	 * 
	 * @return One of the Parabola's intersection with the x axis.
	 */
	public Point calcIntersectionX2() {
		return new Point(x2, 0);
	}

	/**
	 * Creates a String representation of the reference Parabola in Standard
	 * Form.
	 * 
	 * @return A String representation of the reference Parabola in Standard
	 *         Form.
	 */
	public String toStandard() {
		return a + "x^2 + " + a * (-x1 - x2) + "x + " + a * x1 * x2;
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
		return a + "(x - " + x1 + ")(x - " + x2 + ")";
	}
}