
public class ValidaTriangulo {
	public static boolean verifica(int x, int y, int z) {
		 if ((Math.abs(y-z) < x) && (x < (y + z))) {
			 return true;
		 }
		 else 
			 return false;
	}
}
