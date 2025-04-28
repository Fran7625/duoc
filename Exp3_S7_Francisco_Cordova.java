/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp3_s7_francisco_cordova;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author fcord
 */
public class Exp3_S7_Francisco_Cordova{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir_programa = true;
        double monto_total = 0;
        int precio_entrada_vip = 10000;
        int precio_entrada_platea = 5000;
        int precio_entrada_balcon = 2500;
        int contador = -1;
        List<String> asientos = new ArrayList <>();
        List<Integer> precio = new LinkedList<>();
        List<Double> descuento = new LinkedList<>();
        List<String> tipo_descuento = new ArrayList <>();
        System.out.println("Bienvenido al teatro moro");
        for(int i=1; i<100; i++)
            if (seguir_programa) {
                System.out.println("Que desea hacer?: 1) Comprar entrada 2) Resumen de ventas 3)Generar boleta 4)Calcular ingresos totales 5)Salir");
                int res_usuario = scanner.nextInt();
                if (res_usuario == 1){
                    System.out.println("Cual es su edad");
                    int edad = scanner.nextInt();
                    System.out.println("Que ubicacion desea comprar?: 1)VIP, 2)Platea, 3)Balcon");
                    int ubi_solicitada = scanner.nextInt();
                    switch (ubi_solicitada) {
                        case 1:
                            asientos.add("VIP");
                            precio.add(precio_entrada_vip);
                            if (edad <= 18){
                                descuento.add(10000 - (10000*0.10));
                                tipo_descuento.add("10%");
                            } else if (edad >= 60){
                                descuento.add(10000 - (10000*0.15));
                                tipo_descuento.add("15%");
                            } else if (edad > 18 && edad < 60){
                                descuento.add(10000 - 0.0);
                                tipo_descuento.add("0%");
                            }
                            break;
                        case 2:
                            asientos.add("Platea");
                            precio.add(precio_entrada_platea);
                            if (edad <= 18){
                                descuento.add(5000 - (5000*0.10));
                                tipo_descuento.add("10%");
                            } else if (edad >= 60){
                                descuento.add(5000 - (5000*0.15));
                                tipo_descuento.add("15%");
                            } else if (edad > 18 && edad < 60){
                               descuento.add(5000 - 0.0);
                                tipo_descuento.add("0%"); 
                            }
                            break;
                        case 3:
                            asientos.add("Balcon");
                            precio.add(precio_entrada_balcon);
                            if (edad <= 18){
                                descuento.add(2500 - (2500*0.10));
                                tipo_descuento.add("10%");
                            } else if (edad >= 60){
                                descuento.add(2500 - (2500*0.15));
                                tipo_descuento.add("15%");
                            } else if (edad > 18 && edad < 60) {
                                descuento.add(2500 - 0.0);
                                tipo_descuento.add("0%");
                            }
                            break;
                            }
                    contador+=1;
                }else if (res_usuario == 2){
                    for (int contador_ventas = 0; contador_ventas<asientos.size(); contador_ventas++ ){
                        System.out.println("Asiento: " + (contador_ventas+1));
                        System.out.println("Ubicacion: " + asientos.get(contador_ventas));
                        System.out.println("Costo Final : $" + descuento.get(contador_ventas));
                        System.out.println("Descuento Aplicado: $" + tipo_descuento.get(contador_ventas));   
                    }
                }else if (res_usuario == 3){    
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                System.out.println("             Teatro moro            ");
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                System.out.println("Ubicacion: " + asientos.get(contador));
                System.out.println("Costo Base: $" + precio.get(contador));
                System.out.println("Descuento Aplicado: $" + tipo_descuento.get(contador));
                System.out.println("Costo Final : $" + descuento.get(contador));
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                System.out.println("Gracias por su visita al Teatro Moro");
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");   
                }else if (res_usuario == 4){
                    for (int contador_precios = 0; contador_precios<descuento.size(); contador_precios++ ){
                        monto_total += descuento.get(contador_precios);
                    }
                    System.out.println("Los ingresos totales son: $" + monto_total);
                    monto_total = 0;
                }else if (res_usuario == 5){
                    System.out.println("Gracias por su compra");
                   seguir_programa = false; 
                }
}}}