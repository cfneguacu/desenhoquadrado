package desenhoquadrado;

public class DesenhoQuadrado {

	public static void main(String[] args) {
		
				int i=1;
				int j=1;
				int linha = 6;
				int coluna = 6;
				
				while (i <= linha) {
					
					System.out.print ("* ");
					
					if( i == 1 || i == linha ) {
						
						while(j < coluna) { 
							System.out.print ("* ");
							j++;
						} 
						
					}else{
						
						while (j < coluna){
							
							System.out.print("  ");
							j++;
							
							if(j==coluna-1) {
								System.out.print ("* ");
							}
							
						}
					}
					
					System.out.println();
					i++;
					j=1;
					
				}
	}

}
