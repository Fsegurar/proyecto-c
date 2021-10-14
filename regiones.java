package datos;

import java.util.Scanner;

public class regiones {

	public static Scanner leer;
	public static int[][] matriz;
	
    public static void main(String args[]) {
    	
    	
    	leer = new Scanner(System.in);
    	int N = Integer.parseInt(leer.nextLine());
    	int contador=0;
    	
    	do {
    		if(contador==0){
        		System.out.println(" Caso#"+(contador+1)+":");
        	    }else{
        	        System.out.println("Caso#"+(contador+1)+":");
        	    }
    		int tamaño = Integer.parseInt(leer.nextLine());
    		matriz = new int[tamaño][tamaño];
    		String valores ="";
    		boolean resul = false;
    		for(int i =0;i<tamaño;i++) {
    			valores=leer.nextLine();
    			for(int j=0;j<tamaño;j++) {
    				matriz[i][j]=Integer.parseInt(valores.split(" ")[j]);
    			}
    		}
    		
    		for(int i =0;i<tamaño;i++) {
    			for(int j=0;j<tamaño;j++) {
    				if(j+1==tamaño||i+1==tamaño) {
    					
    				}else {
    				System.out.println("pocision"+i+","+j+":"+matriz[i][j]+"="+matriz[i+1][j+1]);
    					if(matriz[i][j]==matriz[i+1][j+1]) {
    						System.out.println("pocision"+(i+1)+","+j+":"+matriz[i+1][j]+"="+matriz[i][j]);
    						System.out.println("pocision"+(i)+","+(j+1)+":"+matriz[i][j+1]+"="+matriz[i][j]);
    						if(matriz[i+1][j]==matriz[i][j]||matriz[i][j+1]==matriz[i][j]) {
    							resul=true;
    						}else {
    							resul=false;
    							j=tamaño;
    							i=tamaño;
    						}
    					}
    				}
    			}
    		}
    		if(resul) {
    			System.out.println("YES");
    		}else {
    			System.out.println("NO");
    		}
    		
    		
    	
			
    		contador++;
    	}while(contador<N);
        
        
    }
}
