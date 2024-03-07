
/**
 * <u>classe trapezio</u>
 * <b>@author RolloGianluca</b>
 * La classe Trapezio consente di calcolare l' area di un trapezio
 */
public class Area {
private float B,b,h;
/**
 * costruttore
 * @param B1 base maggiore del trapezio
 * @param b1 base minore del trapezio
 * @param h1 altezza del trapezio
 */
public Area(float B1,float b1,float h1){
B=B1;
b=b1;
h=h1;
}
/**
 * metodo che ritorna l' area del trapezio
 * @return valore area
 */
public float Calcolo() {
 float a=((B+b)*h/2);
 return a;
}
/**
 * metodo che testa il calcolo del area del trapezio
 * @param args
 */
public static void main(String[] args) {
	Area a1=new Area(6,5,5);
	System.out.println(a1.Calcolo());
}
}
