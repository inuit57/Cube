
public class CubeMain {
	
	public static void main(String[] args) {
		
		Cube c = new Cube("abcdefghijk"); 
		
		c.moveLeft();
		System.out.println(c.str);
		
		c.moveLeft(2); 
		System.out.println(c.str);
		
		c.moveRight(3);
		System.out.println(c.str);
		
		c.moveRight();
		System.out.println(c.str);
	}

}
