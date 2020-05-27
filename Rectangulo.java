
package figuras;

/**
 *
 * @author juan4
 */
public class Rectangulo {
    private double lado1;
    private double lado2;
    
    public Rectangulo(double l1, double l2){
        lado1 = l1;
        lado2 = l2;
    }
    
    public double getArea(){
        return lado1 * lado2;
    }
    
    public double getPerimetro(){
        return (lado1 * 2) + (lado2 * 2);
    }
    
}
