
public class Point3D extends Point2D implements Measurable {
	protected double z;
	
	public Point3D() {
		super( 0.0, 0.0 );
		this.z = 0.0;
	}

	public Point3D(double initialX, double initialY, double initialZ) {
		super(initialX, initialY);
		this.z = initialZ;
	}

	/**
	 * This method returns the z coordinate for the Point3D object. Other coordinate methods are inherited from the superclasses. 
	 * 
	 * @return double	z coordinate for the 3D point
	 */
	public double getZ(){
		return this.z;
	}

	/**
	 * Compares another Point1D object to the current Point3D object and determines if they have equal coordinates. 
	 * In this case the Point1D object's y and z values are treated as 0.0. 
	 * 
	 * @param otherPoint
	 * @return	boolean	returns truth value of equality
	 */
	@Override
	public boolean equals(Point1D otherPoint){ 
		if (otherPoint != null){
			if (this.x == otherPoint.getX() && this.y == 0.0 && this.z == 0.0){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Compares another Point2D object to the current Point3D object and determines if they have equal coordinates. 
	 * In this case the Point2D object's z value is treated as 0.0. 
	 * 
	 * @param otherPoint
	 * @return	boolean	returns truth value of equality
	 */
	@Override 
	public boolean equals(Point2D otherPoint){
		if (otherPoint != null){
			if (this.x == otherPoint.getX() && this.y == otherPoint.getY() && this.z == 0.0){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	/**
	 * Compares another Point3D object to the current Point 3D object and determines if they have equal coordinates. 
	 * 
	 * @param otherPoint
	 * @return	boolean	returns truth value of equality
	 */
	public boolean equals(Point3D otherPoint) { 
		if (otherPoint != null) {
			if (this.x == otherPoint.getX() && this.y == otherPoint.getY() && this.z == otherPoint.getZ()){
				return true;
			}
			else {
				return false;
			}
		}
		
		else {
			return false;
		}
	}
	
	/**
	 * This method returns a string that displays the object's coordinates in the format (x, y, z).
	 * 
	 * @return String	coordinates of the object
	 */
	@Override
	public String toString(){ 
		return "(" + this.x + ", " + this.y + ", " + this.z + ")";
	}
	
	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point1D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/
	public double distanceTo(Point1D otherPoint) {
		
		double dx = Math.pow(otherPoint.getX() - this.getX() , 2);
		double dy = Math.pow(0.0 - this.getY() , 2);
		double dz = Math.pow(0.0 - this.getZ() , 2);
		double sum = dx + dy + dz;
		double length = Math.sqrt(sum);
		return length;
		
	}

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point2D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/
	public double distanceTo(Point2D otherPoint) {
		
		double dx = Math.pow(otherPoint.getX() - this.getX() , 2);
		double dy = Math.pow(otherPoint.getY() - this.getY() , 2);
		double dz = Math.pow(0.0 - this.getZ() , 2);
		double sum = dx + dy + dz;
		double length = Math.sqrt(sum);
		return length;
		
	}

	/**
	* Calculates and returns distance to the otherPoint in 3D space.
	*
	* @param	otherPoint	a reference to another Point3D object
	* @returns	double		distance to otherPoint in 3D space. Zero if otherPoint is null.
	*/
	public double distanceTo(Point3D otherPoint) {
		
		double dx = Math.pow(otherPoint.getX() - this.getX() , 2);
		double dy = Math.pow(otherPoint.getY() - this.getY() , 2);
		double dz = Math.pow(otherPoint.getZ() - this.getZ() , 2);
		double sum = dx + dy + dz;
		double length = Math.sqrt(sum);
		return length;
		
		
	}



}
