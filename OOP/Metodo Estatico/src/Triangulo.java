
public class Triangulo {
	private int x,y,z;
	
	public Triangulo (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public static String tipoTriangulo(int x,int y, int z){
                if((x == y) && (y == z))
                        return "Equilatero";
                else if (( x != y) && (y != z) && (x != z))
                        return "Escaleno";
                else
                        return "Isosceles";
    }
	
	/*public static boolean verifica(int x, int y, int z) {
		 if ((Math.abs(y-z) < x) && (x < (y + z))) {
			 return true;
		 }
		 else 
			 return false;
	}*/
}
