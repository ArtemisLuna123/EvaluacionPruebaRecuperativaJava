package pruebarecuperativa.java.pruebarecuperativa;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//ANTES DE CONTINUAR
/*Para hacer este caso practico se habla de tipo de producto y productos entre otros objetos la cual seria en caso la clase padre productos 
 * y la clase hija tipo ya que me entrega solo un atributo que no tiene producto y es la categoria en si misma y otras cosas que no iban al caso como el 
 * caso cliente o vendedores si quiero ocupar esa logica.Pero como logica se llama primero a los objetos para que funcionen en la logica.
 */

 //se importa todos los import que utilizaremos para la funciones y luego se llama a los objetos. 
import pruebarecuperativa.java.pruebarecuperativa.model.Producto;
import java.util.Scanner;
import java.util.HashMap;

@SpringBootApplication
public class PruebarecuperativaApplication {
/*  Se debe crear una función que permita a don Jose obtener las ganancias sobre una
venta (ocupar hashmap)*/

public static Double sumaGanancia(HashMap<String, Double>listaProducto ){
    Double ganancia = 0.0;
   
    for(Double suma : listaProducto.values()){
        ganancia += suma;
    }
    return ganancia;
}

/*Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
productos y que luego los muestre*/
public static void productos() {
Scanner teclado = new Scanner(System.in);
System.out.println(" ¿Cuantas cantidades de producto va a ingresar? : ");
int cantidadProductos = teclado.nextInt();

//  Se crea un arreglo que pueda ingresar la  cantidad de productos solicitada
Producto[] productos = new Producto[cantidadProductos];

// Se pide al usuario que ingrese la cantidad de productos 
for (int i = 0; i < cantidadProductos; i++) {
	teclado.nextLine();
	Producto producto = new Producto();
	System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
	System.out.println("Nombre del Producto: ");
	producto.setNombre(teclado.nextLine());
	System.out.print("PrecioUnitario: ");
	producto.setPrecioUnit(teclado.nextDouble());
	productos[i] = producto;
   }
   System.out.println("Lista de productos:");
    for (int i = 0; i < cantidadProductos; i++) {
        System.out.println(productos[i].getNombre() + ": " + productos[i].getPrecioUnit());
    }
	 /*Se debe crear una función que dado un diccionario de productos con sus respectivos
     precios se obtenga, la ganancia total, el producto más caro y el producto más barato.*/
	double gananciaTotal = 0;
    for (int i = 0; i < cantidadProductos; i++) {
        gananciaTotal += productos[i].getPrecioUnit();
    }
    System.out.println("La ganancia total del listado  es: " + gananciaTotal);

 }  

	public static void main(String[] args) {
		productos();
	}
		




}
