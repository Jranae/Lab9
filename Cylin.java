
public class Cylin {
	private int Height;
	private int Radius;
public Cylin(int Height, int Radius) {
	this.Height=Height;
	this.Radius=Radius;
}
	public int getHeight() {
		return Height;
	}
	public int getRadius() {
		return Radius;
	}
	public void setHeight(int Height) {
		this.Height=Height;
	}
	public void setRadius(int Radius) {
		this.Radius=Radius;
	}
	public double areaCylin() {
		double area= 2*Math.PI*this.Radius*this.Height+2*Math.PI*Math.pow(this.Radius, 2);
		return area;
	}
	public double VolumeCylin() {
		double Volume= Math.PI*Math.pow(this.Radius, 2)*this.Height;
		return Volume;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylin cylin1= new Cylin(5,10);
		cylin1.setHeight(10);
		cylin1.setRadius(20);
		System.out.println(cylin1.areaCylin());
		System.out.println(cylin1.VolumeCylin());
	}

}
