
public class CubeMain {
	
	public static void main(String[] args) {
		
		Cube c = new Cube("text"); 
		
		c.moveLeft();
		System.out.println(c.str);
		
		
		c.moveRight();
		System.out.println(c.str);
	}

}
