
public class Cube {
	
	String str ; 
	
	public Cube(String str) {
		this.str = str; 
	}
	
	public void moveLeft() {
		char[] tmp = new char[this.str.length()]; 
		
		tmp = str.toCharArray();
		
		char tmp_char = tmp[0]; 
		
		for(int i =0 ; i< tmp.length-1 ; i++) {
			tmp[i]= tmp[i+1]; 
		}
		
		tmp[tmp.length-1]  = tmp_char;
	
		str = new String(tmp);   
	}

	public void moveLeft(int n) {
		for(int i=0 ; i<n; i++){
			moveLeft(); 
		}
	}
	
	public void moveRight() {
		char[] tmp = new char[this.str.length()]; 
		
		tmp = str.toCharArray(); 
		
		char tmp_char = tmp[tmp.length-1]; 
		
		for(int i= tmp.length-1 ; i > 0 ; i--) {
			tmp[i] = tmp[i-1] ; 
		}
		
		tmp[0] = tmp_char;
		str = new String(tmp); 
	}
	
	public void moveRight(int n) {
		for(int i=0 ; i<n; i++){
			moveRight(); 
		}
	}
	
	
	
}
