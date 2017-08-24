
public class ThePoint {
	private int x,y;
	

	public ThePoint() {
		super();
		x=0;
		y=0;
		
		
		// TODO Auto-generated constructor stub
	}
	
	public ThePoint(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public static void CombinedPoint(int x, int y){
		System.out.print("(" + x + " , " + y + ")");
	}
	
	public static double getDistance(ThePoint p1, ThePoint p2){

		return (Math.sqrt(Math.pow((p2.getX()-p1.getX()), 2) + 
						 Math.pow(p2.getY()-p1.getY(), 2)));
	}
}
