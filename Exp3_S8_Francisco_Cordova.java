/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp3_s8_francisco_cordova;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author fcord
 */
public class Exp3_S8_Francisco_Cordova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] id_ventas = new int [10];
        int [] asientos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] edad_cliente = new int [10];
        List<Integer> descuento = new ArrayList<>();
        descuento.add(1800);
        descuento.add(1700);
        descuento.add(2000);
        List<String> promociones = new ArrayList<>();
        List<String> reservas = new ArrayList<>();
        List<Integer> precio_final = new ArrayList<>();
        List<Integer> asientos_comprados = new ArrayList<>();
        int solicitud;
        List<Integer> usuario = new ArrayList<>();
        
        System.out.println("Bienvenido al teatro moro");
        for (int i=0 ; i<asientos.length ; i++){
            id_ventas [i] = i+1;
            System.out.print("Cual es su edad?: ");
            int edad = scanner.nextInt();
            edad_cliente [i] = edad;
            if (edad <= 18) {
                precio_final.add(descuento.get(0));
                promociones.add("Estudiante");
            }else if (edad >= 65) {
                precio_final.add(descuento.get(1));
                promociones.add("Tercera edad");
            }else
                precio_final.add(descuento.get(2));
                promociones.add("Adulto");
            System.out.println(Arrays.toString(asientos));
            System.out.print("Que asiento desea comprar?:");
            int asiento = scanner.nextInt();
            for (int contador=0 ; contador<asientos.length ; contador++) {
                if (asientos[contador] == asiento){
                    asientos_comprados.add(asientos[contador]);
                    asientos[contador] = 0;
                }   
            }    
        }
    System.out.println("Id venta: " + Arrays.toString(id_ventas));
    System.out.println("Edad cliente: " + Arrays.toString(edad_cliente));
    System.out.println("Asiento comprado: " + asientos_comprados);
    System.out.println("Precio entrada: " + precio_final);
    System.out.println("Tipo descuento: " + promociones);
    
    
    }   
}
