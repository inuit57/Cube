public class Cube {
	
	String str ; 
	
	char[][] cube = {{'R','R','W'},
					 {'G','C','W'},
					 {'G','B','B'}	} ; 
	
	public Cube(String str) {
		this.str = str; 
	}
	
	public void printCube() {
		for(int i=0 ; i<3; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.printf("%c ", cube[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void cube_U(char ch) {
		this.str = ""; 
		for(int i= 0 ; i< 3; i++) {
			str+= cube[0][i]; 
		}
		if (ch == 'U') {this.moveLeft();}
		else { this.moveRight();} // ch == 'U'' 
		
		for(int i= 0 ; i<3; i++) {
			cube[0][i] = this.str.charAt(i); 
		}
	}
	
	public void cube_R(char ch) {
		this.str = "";
		for(int i= 0 ; i<3; i++) {
			str += cube[i][2] ; 
		}
		if (ch == 'R') {this.moveLeft();}
		else { this.moveRight();}
		
		for(int i= 0 ; i<3; i++) {
			cube[i][2] = this.str.charAt(i); 
		}
	}
	
	public void cube_L(char ch) {
		this.str = "";
		for(int i= 0 ; i<3; i++) {
			str += cube[i][0] ; 
		}
		if (ch != 'L') {this.moveLeft();}
		else { this.moveRight();}
		
		for(int i= 0 ; i<3; i++) {
			cube[i][0] = this.str.charAt(i); 
		}
	}
	
	public void cube_D(char ch) {
		this.str = "";
		for(int i= 0 ; i<3; i++) {
			str += cube[2][i] ; 
		}
		if (ch != 'D') {this.moveLeft();}
		else { this.moveRight();}
		
		for(int i= 0 ; i<3; i++) {
			cube[2][i] = this.str.charAt(i); 
		}
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
