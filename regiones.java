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
    		int tama�o = Integer.parseInt(leer.nextLine());
    		matriz = new int[tama�o][tama�o];
    		String valores ="";
    		boolean resul = false;
    		for(int i =0;i<tama�o;i++) {
    			valores=leer.nextLine();
    			for(int j=0;j<tama�o;j++) {
    				matriz[i][j]=Integer.parseInt(valores.split(" ")[j]);
    			}
    		}
    		
    		for(int i =0;i<tama�o;i++) {
    			for(int j=0;j<tama�o;j++) {
    				if(j+1==tama�o||i+1==tama�o) {
    					
    				}else {
    				System.out.println("pocision"+i+","+j+":"+matriz[i][j]+"="+matriz[i+1][j+1]);
    					if(matriz[i][j]==matriz[i+1][j+1]) {
    						System.out.println("pocision"+(i+1)+","+j+":"+matriz[i+1][j]+"="+matriz[i][j]);
    						System.out.println("pocision"+(i)+","+(j+1)+":"+matriz[i][j+1]+"="+matriz[i][j]);
    						if(matriz[i+1][j]==matriz[i][j]||matriz[i][j+1]==matriz[i][j]) {
    							resul=true;
    						}else {
    							resul=false;
    							j=tama�o;
    							i=tama�o;
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
