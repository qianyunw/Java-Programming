
public class Line extends Point{
	double X2;
	double Y2;
	double angle;
	double Z;
	Line(double X1, double Y1, double Z, double angle) {
		super(X1, Y1);
		this.Z = Z;
		this.angle = angle;
		
	}
	double GetX2() {
		X2 = X1 + Z * Math.cos(angle);
		return X2;
	}
	double GetY2() {
		Y2 = Y1 + Z * Math.sin(angle);
		return Y2;
	}
	double Getangle() {
		return angle;
	}
	double GetZ() {
		return Z;
	}
}
