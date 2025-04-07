/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_francisco_cordova_s4;

import java.util.Scanner;

/**
 *
 * @author fcord
 */
public class Exp2_Francisco_Cordova_S4 {

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
        int precio_entrada_a = 2000;
        int precio_entrada_b = 3000;
        int precio_entrada_c = 4000;
        boolean edad_valida = true;
        System.out.println("Bienvenido al teatro moro");
        System.out.println("Cual es su edad");
        int edad = scanner.nextInt();
        for(int i=1; i<9; i++)
            if (seguir_programa) {
                System.out.println("Que desea hacer?: 1) Comprar entrada  2) Salir");
                int res_usuario = scanner.nextInt();
                if (res_usuario == 1){ 
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
                                break;
                            case 2:
                                monto_total += precio_entrada_a;
                                break;
                            case 3:
                                monto_total += precio_entrada_a;
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
                                break;
                            case 2:
                                monto_total += precio_entrada_b;
                                break;
                            case 3:
                                monto_total += precio_entrada_b;
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
                                break;
                            case 2:
                                monto_total += precio_entrada_c;
                                break;
                            case 3:
                                monto_total += precio_entrada_c;
                                break;
                        }
                    }else{
                        System.out.println("Seleccione un número válido");
                    }
                }else
                    seguir_programa = false;
                
            }else
                i+=10;
        if (edad <= 18){
            monto_total = monto_total - (monto_total*0.10);
        }else if (edad >= 60){
            monto_total = monto_total - (monto_total*0.15);
        }
        
        
        
        
        
        
        System.out.println("Su total a pagar es: $" + monto_total);
        System.out.println("Hasta pronto");
    }}