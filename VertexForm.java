/**
 * The class containing the methods for calculating the Vertex form properties.
 * 
 * @author Alon Zohar
 */
public class VertexForm extends Parabola {
	protected double p, k;

	/**
	 * Constructor.
	 * 
	 * @param a
	 *            The Parabola's a.
	 * @param p
	 *            The vertex's x.
	 * @param k
	 *            The vertex's y.
	 */
	public VertexForm(double aValue, double pValue, double kValue) {
		super(aValue);
		p = pValue;
		k = kValue;
	}

	/**
	 * Calculates f(x).
	 * 
	 * @param x
	 *            The x in f(x).
	 * @return f(x)
	 */
	public double calcY(double x) {
		return a * Math.pow((x - p), 2) + k;
	}

	/**
	 * Calculates the Axis of Symmetry.
	 * 
	 * @return The Axis of Symmetry.
	 */
	public double calcAxisOfSymmetry() {
		return p;
	}

	/**
	 * Calculates one of the Parabola's intersection with the x axis.
	 * 
	 * @return One of the Parabola's intersection with the x axis.
	 */
	public Point calcIntersectionX1() {
		return new Point(Math.sqrt(-k / a) + p, 0);
	}

	/**
	 * Calculates one of the Parabola's intersection with the x axis.
	 * 
	 * @return One of the Parabola's intersection with the x axis.
	 */
	public Point calcIntersectionX2() {
		return new Point(-Math.sqrt(-k / a) + p, 0);
	}

	/**
	 * Creates a String representation of the reference Parabola in Standard
	 * Form.
	 * 
	 * @return A String representation of the reference Parabola in Standard
	 *         Form.
	 */
	public String toStandard() {
		return a + "x^2 + " + (-2 * a * p) + "x + " + (a * Math.pow(p, 2) + k);
	}

	/**
	 * Creates a String representation of the reference Parabola in Vertex Form.
	 * 
	 * @return A String representation of the reference Parabola in Vertex Form.
	 */
	public String toVertex() {
		return a + "(x - " + p + ") + " + k;
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