/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_francisco_cordova_s5;

import java.util.Scanner;

/**
 *
 * @author fcord
 */
public class Exp2_Francisco_Cordova_S5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean seguir_programa = true;
        String a_1 = "A-1 ";
        String a_2 = "A-2 ";
        String a_3 = "A-3 ";
        String b_1 = "B-1 ";
        String b_2 = "B-2 ";
        String b_3 = "B-3 ";
        String c_1 = "C-1 ";        
        String c_2 = "C-2 ";
        String c_3 = "C-3 ";
        String fila_a = a_1 + a_2 + a_3;
        String fila_b = b_1 + b_2 + b_3;
        String fila_c = c_1 + c_2 + c_3;
        double monto_total = 0;
        double precio_ultima_entrada = 0;
        int cantidad_entradas_vendidas = 0;
        int precio_entrada_a = 2000;
        int precio_entrada_b = 3000;
        int precio_entrada_c = 4000;
        boolean edad_valida = true;
        String ultima_entrada_fila = "";
        String ultima_entrada_ubi = "";
        System.out.println("Bienvenido al teatro moro");
        System.out.println("Cual es su edad");
        int edad = scanner.nextInt();
        for(int i=1; i<100; i++)
            if (seguir_programa) {
                System.out.println("Que desea hacer?: 1) Comprar entrada  2) Ver promociones  3)Eliminar ultima entrada  4)Mostrar ultima entrada  5)Salir");
                int res_usuario = scanner.nextInt();
                if (res_usuario == 1){ 
                    cantidad_entradas_vendidas +=1;
                    System.out.println("Que ubicacion desea comprar?: 1)VIP, 2)Platea, 3)General");
                    int ubi_solicitada = scanner.nextInt();
                    switch (ubi_solicitada) {
                        case 1:
                            ultima_entrada_ubi = "VIP";
                            break;
                        case 2:
                            ultima_entrada_ubi = "Platea";
                            break;
                        case 3:
                            ultima_entrada_ubi = "General";
                            break;
                        } 
                    System.out.println(fila_a);
                    System.out.println(fila_b);
                    System.out.println(fila_c);
                    System.out.println("Que fila desea comprar?: 1)A, 2)B, 3)C");
                    int fila_solicitada = scanner.nextInt();
                    if (fila_solicitada == 1){
                        System.out.println("Que asiento desea comprar?");
                        System.out.println("Presione 1 para comprar A-1");
                        System.out.println("Presione 2 para comprar A-2");
                        System.out.println("Presione 3 para comprar A-3");
                        System.out.println(fila_a);
                        int asiento_solicitado = scanner.nextInt();
                        switch (asiento_solicitado){
                            case 1:
                                monto_total += precio_entrada_a;
                                precio_ultima_entrada = precio_entrada_a;
                                ultima_entrada_fila = "A-1";
                                break;
                            case 2:
                                monto_total += precio_entrada_a;
                                precio_ultima_entrada = precio_entrada_a;
                                ultima_entrada_fila = "A-2";
                                break;
                            case 3:
                                monto_total += precio_entrada_a;
                                precio_ultima_entrada = precio_entrada_a;
                                ultima_entrada_fila = "A-3";
                                break;
                        }
                    }else if (fila_solicitada == 2){
                        System.out.println("Que asiento desea comprar?");
                        System.out.println("Presione 1 para comprar B-1");
                        System.out.println("Presione 2 para comprar B-2");
                        System.out.println("Presione 3 para comprar B-3");
                        System.out.println(fila_b);
                        int asiento_solicitado = scanner.nextInt();
                        switch (asiento_solicitado){
                            case 1:
                                monto_total += precio_entrada_b;
                                precio_ultima_entrada = precio_entrada_b;
                                ultima_entrada_fila = "B-1";
                                break;
                            case 2:
                                monto_total += precio_entrada_b;
                                precio_ultima_entrada = precio_entrada_b;
                                ultima_entrada_fila = "B-2";
                                break;
                            case 3:
                                monto_total += precio_entrada_b;
                                precio_ultima_entrada = precio_entrada_b;
                                ultima_entrada_fila = "B-3";
                                break;
                        }
                    }else if (fila_solicitada == 3){
                        System.out.println("Que asiento desea comprar?");
                        System.out.println("Presione 1 para comprar C-1");
                        System.out.println("Presione 2 para comprar C-2");
                        System.out.println("Presione 3 para comprar C-3");
                        System.out.println(fila_c);
                        int asiento_solicitado = scanner.nextInt();
                        switch (asiento_solicitado){
                            case 1:
                                monto_total += precio_entrada_c;
                                precio_ultima_entrada = precio_entrada_c;
                                ultima_entrada_fila = "C-1";
                                break;
                            case 2:
                                monto_total += precio_entrada_c;
                                precio_ultima_entrada = precio_entrada_c;
                                ultima_entrada_fila = "C-2";
                                break;
                            case 3:
                                monto_total += precio_entrada_c;
                                precio_ultima_entrada = precio_entrada_c;
                                ultima_entrada_fila = "C-3";
                                break;
                        }
                    }else{
                        System.out.println("Seleccione un numero válido");
                    }
                }else if (res_usuario == 2) {
                    System.out.println("3 entradas = 30% descuento en tu total a pagar");
                    System.out.println("4 entradas o mas = 45% descuento en tu total a pagar");
                }else if (res_usuario == 3) {
                    if (cantidad_entradas_vendidas == 0){
                        cantidad_entradas_vendidas += 0;
                        System.out.println("No ha comprado ninguna entrada");
                    }else if (cantidad_entradas_vendidas >=0){
                        cantidad_entradas_vendidas -=1;
                        System.out.println("Ultima entrada eliminada");
                        monto_total -= precio_ultima_entrada;
                    }
                }else if (res_usuario == 4) {
                    System.out.println(ultima_entrada_ubi);
                    System.out.println(ultima_entrada_fila);
                }else if (res_usuario == 5) {
                    seguir_programa = false;
                }
            }else
                i+=101;
        if (edad <= 18){
            monto_total = monto_total - (monto_total*0.10);
        }else if (edad >= 60){
            monto_total = monto_total - (monto_total*0.15);
        }
        if (cantidad_entradas_vendidas == 3) {
            monto_total = monto_total - (monto_total*0.30);
        }else if (cantidad_entradas_vendidas >= 4) {
            monto_total = monto_total - (monto_total*0.45);
        }
       
        System.out.println("Su total a pagar es: $" + monto_total);
        System.out.println("Hasta pronto");
    }}