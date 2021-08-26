package sesion05_cg_mul_b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        Scanner opc = new Scanner (System.in);
        
        int a;
        int b;
        int c;;

        System.out.println("Digite 1 para cuadrado o 2 para circunferencia");
        
        a = a.nextInt();

        if(a ==1) {
        	
        System.out.println("Digite 1 para traslación. 2 Para escalado. 3 Para escalado");
        
        b = a.nextInt();
            if (b == 1){}
            if (b == 2){}
            if (b == 3){}

        }

        if(a ==2) {
        	
        System.out.println("Digite 1 para traslación. 2 Para escalado. 3 Para escalado");
        
        b = a.nextInt();
            if (a == 1){}
            if (a == 2){}
            if (a == 3){}

        }


    }
    
class Coord{
	
     private int x,y;

	public int getX() {
		
		return x;
		
	}

	public int getY() {
		
		return y;
		
	}

	public void setX(int x) {
		
		this.x = x;
		
	}

	public void setY(int y) {
		
		this.y = y;
		
	}
     


}

class Cuadrado {
	
    private Coord c, e, s, t;
    private int lado;
    
    public Cuadrado(Coord c, int lado) {
    	
        this.c=c;
        this.lado = lado;
        
    }
    public void Traslación() {

        e.setX(t.getX()+c.getX());
        c.setY(t.getY()+c.getY());
        
    }

    public void Rotación() {

    }


    public void Escalado() {
    	
        lado = (int) lado*(1+s/100.0f);
        
    }
    
}

class Circunferencia{
	
    Coord c;
    float radio;

    public void Traslación() { 
    	
    }


    public void Rotación() {

    }


    public void Escalado() {

    }
}

}