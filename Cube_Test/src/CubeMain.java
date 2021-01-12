import java.util.Scanner;

public class CubeMain {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		Cube c = new Cube("abcdefghijk");
		String str;
		sc = new Scanner(System.in);
		boolean flag = true; 
		
		
		
		c.printCube();
		
		while(flag) {
			System.out.print("CUBE > ");
			str = sc.nextLine(); 
			
			System.out.println();
			
			char ch_arr[] = new char[str.length()]; 
			ch_arr = str.toCharArray(); 
			
			for(int i=0 ; i< ch_arr.length ; i++) {
				if(ch_arr[i] == 'Q') {
					System.out.println("Bye~");
					//exit();
					flag = false; 
				}
				
				
				
				if ( ch_arr[0] == '\'') {
					System.out.println("잘못된 입력감지! 다시 입력해주세요.");
					break; 
				}
				
				switch(ch_arr[i]) 
				{
	
				case 'U' : 
					System.out.print('U');
					if ( (i+1 < ch_arr.length) &&  (ch_arr[i+1] =='\'') ) {
						System.out.print('\'');
						i++; 
						c.cube_U('r'); // U'
					}
					else {
						c.cube_U('U'); 
					}
					break;
				case 'D' :
					System.out.print('D');
					if ( (i+1 < ch_arr.length) &&  (ch_arr[i+1] =='\'') ) {
						System.out.print('\'');
						i++; 
						c.cube_D('r'); // U'
					}
					else {
						c.cube_D('D'); 
					}
					break; 
				case 'R' : 
					System.out.print('R');
					if ( (i+1 < ch_arr.length) &&  (ch_arr[i+1] =='\'') ) {
						System.out.print('\'');
						i++; 
						c.cube_D('r'); // U'
					}
					else {
						c.cube_D('R'); 
					}
					break;
				case 'L' : 
					System.out.print('L');
					if ( (i+1 < ch_arr.length) &&  (ch_arr[i+1] =='\'') ) {
						System.out.print('\'');
						i++; 
						c.cube_L('r'); // U'
					}
					else {
						c.cube_L('L'); 
					}
					break; 
				} // swith 문 끝. 
				
				if(flag) {
					System.out.println();
					c.printCube(); 
					System.out.println();
				}
			} // for문 끝.
		} //while(flag) 끝. 
		
				
//		c.cube_U('U');
//		c.printCube();
		
//		c.cube_D('D');
//		c.printCube();
		
//		c.cube_L('L');
//		c.printCube();
		
//		c.cube_R('R'); 
//		c.printCube();
		
//		c.moveLeft();
//		System.out.println(c.str);
//		
//		c.moveLeft(2); 
//		System.out.println(c.str);
//		
//		c.moveRight(3);
//		System.out.println(c.str);
//		
//		c.moveRight();
//		System.out.println(c.str);
	}

}