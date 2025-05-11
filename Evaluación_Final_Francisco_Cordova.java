package evaluación_final_francisco_cordova;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author fcord
 */
public class Evaluación_Final_Francisco_Cordova {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        boolean seguir_programa = true;
        boolean mujer = false;
        int precio_vip = 10000;
        int precio_palco = 7500;
        int precio_platea_alta = 5000;
        int precio_platea_baja = 3000;
        int precio_galeria = 1500;
        int contador = 0;
        int asiento_solicitado;
        int cantidad_asientos;
        List<Integer> asientos = new ArrayList<>();
        List<Integer> asientos_vendidos = new ArrayList<>();
        List<String> tipo_asiento = new ArrayList <>();
        List<Integer> precio = new ArrayList<>();
        List<Double> descuento = new ArrayList<>();
        List<String> tipo_descuento = new ArrayList <>();
        List<Integer> lista_vip = new ArrayList <>();
        lista_vip.add(1);
        lista_vip.add(2);
        lista_vip.add(3);
        lista_vip.add(4);
        lista_vip.add(5);
        List<Integer> lista_palco = new ArrayList <>();
        lista_palco.add(6);
        lista_palco.add(7);
        lista_palco.add(8);
        lista_palco.add(9);
        lista_palco.add(10);
        List<Integer> lista_platea_alta = new ArrayList <>();
        lista_platea_alta.add(11);
        lista_platea_alta.add(12);
        lista_platea_alta.add(13);
        lista_platea_alta.add(14);
        lista_platea_alta.add(15);
        List<Integer> lista_platea_baja = new ArrayList <>();
        lista_platea_baja.add(16);
        lista_platea_baja.add(17);
        lista_platea_baja.add(18);
        lista_platea_baja.add(19);
        lista_platea_baja.add(20);
        List<Integer> lista_galeria = new ArrayList <>();
        lista_galeria.add(21);
        lista_galeria.add(22);
        lista_galeria.add(23);
        lista_galeria.add(24);
        lista_galeria.add(25);
        System.out.println("Bienvenido al teatro moro");
        for(int i=1; i<10000; i++)
            if (seguir_programa) {
                System.out.println("Que desea hacer?: 1) Comprar entrada 2)Salir");
                int res_usuario = scanner.nextInt();
                if (res_usuario == 1){
                    System.out.print("Cual es su edad?: ");
                    int edad = scanner.nextInt();
                    if (edad > 18 && edad < 60){
                        System.out.println("Es mujer?: 1)Si 2)No");
                        int res_mujer = scanner.nextInt();
                        if (res_mujer == 1){
                            mujer = true;
                        }
                    } else if (edad < 0){
                        System.out.println("Edad invalida, intente otra vez");
                        continue;
                    } else if (edad > 120){
                        System.out.println("Edad invalida, intente otra vez");
                        continue;
                    }
                    System.out.println("Que ubicacion desea comprar?: 1)VIP, 2)Palco, 3)Platea alta 4)Platea baja 5)Galeria");
                    int ubi_solicitada = scanner.nextInt();
                    if (ubi_solicitada < 1){
                        System.out.println("Ubicacion no existente, intente otra vez");
                        continue;
                    }else if (ubi_solicitada > 5){
                        System.out.println("Ubicacion no existente, intente otra vez");
                        continue;
                    }
                    switch (ubi_solicitada) {
                        case 1:
                            System.out.println(lista_vip);
                            System.out.println("Cuantos asientos desea comprar?: ");
                            cantidad_asientos = scanner.nextInt();
                            if (cantidad_asientos < 1){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                             continue;
                            }else if (cantidad_asientos > 5){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                            continue;
                            }
                            for(int asiento=1; asiento<=cantidad_asientos; asiento++){
                                System.out.print("Ingrese el numero del asiento: ");
                                asiento_solicitado = scanner.nextInt();
                                if (asiento_solicitado < 1){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }else if (asiento_solicitado > 5){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }
                                for(int x = 0; x<lista_vip.size(); x++){
                                    if(lista_vip.get(x)==asiento_solicitado){
                                        asientos.add(lista_vip.get(x));
                                        lista_vip.remove(x);
                                    }   
                                }
                            }
                            tipo_asiento.add("VIP");
                            precio.add(precio_vip*cantidad_asientos);
                            if (edad <= 6){
                                descuento.add((precio_vip*cantidad_asientos) - ((precio_vip*cantidad_asientos)*0.10));
                                tipo_descuento.add("10%");
                            } else if (edad >= 60){
                                descuento.add((precio_vip*cantidad_asientos) - ((precio_vip*cantidad_asientos)*0.25));
                                tipo_descuento.add("25%");
                            } else if (edad > 18 && edad < 60 && mujer == false){
                                descuento.add((precio_vip*cantidad_asientos) - 0.0);
                                tipo_descuento.add("0%");
                            } else if (edad >= 7 && edad <= 18){
                                descuento.add((precio_vip*cantidad_asientos) - ((precio_vip*cantidad_asientos)*0.15));
                                tipo_descuento.add("15%");
                            } else if (edad > 18 && edad < 60 && mujer == true){
                                descuento.add((precio_vip*cantidad_asientos) - ((precio_vip*cantidad_asientos)*0.20));
                                tipo_descuento.add("20%");
                            }
                            break;
                        case 2:
                            System.out.println(lista_palco);
                            System.out.print("Cuantos asientos desea comprar?: ");
                            cantidad_asientos = scanner.nextInt();
                            if (cantidad_asientos < 1){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                             continue;
                            }else if (cantidad_asientos > 5){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                            continue;
                            }
                            for(int asiento=1; asiento<=cantidad_asientos; asiento++){
                                System.out.print("Ingrese el numero del asiento: ");
                                asiento_solicitado = scanner.nextInt();
                                if (asiento_solicitado < 6){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }else if (asiento_solicitado > 10){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }
                                for(int x = 0; x<lista_palco.size(); x++){
                                    if(lista_palco.get(x)==asiento_solicitado){
                                        asientos.add(lista_palco.get(x));
                                        lista_palco.remove(x);
                                    }   
                                }
                            }
                            tipo_asiento.add("Palco");
                            precio.add(precio_palco*cantidad_asientos);
                            if (edad <= 6){
                                descuento.add((precio_palco*cantidad_asientos) - ((precio_palco*cantidad_asientos)*0.10));
                                tipo_descuento.add("10%");
                            } else if (edad >= 60){
                                descuento.add((precio_palco*cantidad_asientos) - ((precio_palco*cantidad_asientos)*0.25));
                                tipo_descuento.add("25%");
                            } else if (edad > 18 && edad < 60 && mujer == false){
                                descuento.add((precio_palco*cantidad_asientos) - 0.0);
                                tipo_descuento.add("0%");
                            } else if (edad >= 7 && edad <= 18){
                                descuento.add((precio_palco*cantidad_asientos) - ((precio_palco*cantidad_asientos)*0.15));
                                tipo_descuento.add("15%");
                            } else if (edad > 18 && edad < 60 && mujer == true){
                                descuento.add((precio_palco*cantidad_asientos) - ((precio_palco*cantidad_asientos)*0.20));
                                tipo_descuento.add("20%");
                            }
                            break;
                        case 3:
                            System.out.println(lista_platea_alta);
                            System.out.print("Cuantos asientos desea comprar?: ");
                            cantidad_asientos = scanner.nextInt();
                            if (cantidad_asientos < 1){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                             continue;
                            }else if (cantidad_asientos > 5){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                            continue;
                            }
                            for(int asiento=1; asiento<=cantidad_asientos; asiento++){
                                System.out.print("Ingrese el numero del asiento: ");
                                asiento_solicitado = scanner.nextInt();
                                if (asiento_solicitado < 11){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }else if (asiento_solicitado > 16){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }
                                for(int x = 0; x<lista_platea_alta.size(); x++){
                                    if(lista_platea_alta.get(x)==asiento_solicitado){
                                        asientos.add(lista_platea_alta.get(x));
                                        lista_platea_alta.remove(x);
                                    }   
                                }
                            }
                            tipo_asiento.add("Platea alta");
                            precio.add(precio_platea_alta*cantidad_asientos);
                            if (edad <= 6){
                                descuento.add((precio_platea_alta*cantidad_asientos) - ((precio_platea_alta*cantidad_asientos)*0.10));
                                tipo_descuento.add("10%");
                            } else if (edad >= 60){
                                descuento.add((precio_platea_alta*cantidad_asientos) - ((precio_platea_alta*cantidad_asientos)*0.25));
                                tipo_descuento.add("25%");
                            } else if (edad > 18 && edad < 60 && mujer == false){
                                descuento.add((precio_platea_alta*cantidad_asientos) - 0.0);
                                tipo_descuento.add("0%");
                            } else if (edad >= 7 && edad <= 18){
                                descuento.add((precio_platea_alta*cantidad_asientos) - ((precio_platea_alta*cantidad_asientos)*0.15));
                                tipo_descuento.add("15%");
                            } else if (edad > 18 && edad < 60 && mujer == true){
                                descuento.add((precio_platea_alta*cantidad_asientos) - ((precio_platea_alta*cantidad_asientos)*0.20));
                                tipo_descuento.add("20%");
                            }
                            break;
                        case 4:
                            System.out.println(lista_platea_baja);
                            System.out.print("Cuantos asientos desea comprar?: ");
                            cantidad_asientos = scanner.nextInt();
                            if (cantidad_asientos < 1){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                             continue;
                            }else if (cantidad_asientos > 5){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                            continue;
                            }
                            for(int asiento=1; asiento<=cantidad_asientos; asiento++){
                                System.out.print("Ingrese el numero del asiento: ");
                                asiento_solicitado = scanner.nextInt();
                                if (asiento_solicitado < 16){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }else if (asiento_solicitado > 20){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }
                                for(int x = 0; x<lista_platea_baja.size(); x++){
                                    if(lista_platea_baja.get(x)==asiento_solicitado){
                                        asientos.add(lista_platea_baja.get(x));
                                        lista_platea_baja.remove(x);
                                    }   
                                }
                            }
                            tipo_asiento.add("Platea baja");
                            precio.add(precio_platea_baja*cantidad_asientos);
                            if (edad <= 6){
                                descuento.add((precio_platea_baja*cantidad_asientos) - ((precio_platea_baja*cantidad_asientos)*0.10));
                                tipo_descuento.add("10%");
                            } else if (edad >= 60){
                                descuento.add((precio_platea_baja*cantidad_asientos) - ((precio_platea_baja*cantidad_asientos)*0.25));
                                tipo_descuento.add("25%");
                            } else if (edad > 18 && edad < 60 && mujer == false){
                                descuento.add((precio_platea_baja*cantidad_asientos) - 0.0);
                                tipo_descuento.add("0%");
                            } else if (edad >= 7 && edad <= 18){
                                descuento.add((precio_platea_baja*cantidad_asientos) - ((precio_platea_baja*cantidad_asientos)*0.15));
                                tipo_descuento.add("15%");
                            } else if (edad > 18 && edad < 60 && mujer == true){
                                descuento.add((precio_platea_baja*cantidad_asientos) - ((precio_platea_baja*cantidad_asientos)*0.20));
                                tipo_descuento.add("20%");
                            }
                            break;
                        case 5:
                            System.out.println(lista_galeria);
                            System.out.print("Cuantos asientos desea comprar?: ");
                            cantidad_asientos = scanner.nextInt();
                            if (cantidad_asientos < 1){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                             continue;
                            }else if (cantidad_asientos > 5){
                            System.out.println("Cantidad de asientos invalida, intente otra vez");
                            continue;
                            }
                            for(int asiento=1; asiento<=cantidad_asientos; asiento++){
                                System.out.print("Ingrese el numero del asiento: ");
                                asiento_solicitado = scanner.nextInt();
                                if (asiento_solicitado < 21){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }else if (asiento_solicitado > 25){
                                    System.out.println("Asiento no existente, intente otra vez");
                                    continue;
                                }
                                for(int x = 0; x<lista_galeria.size(); x++){
                                    if(lista_galeria.get(x)==asiento_solicitado){
                                        asientos.add(lista_galeria.get(x));
                                        lista_galeria.remove(x);
                                    }   
                                }
                            }
                            tipo_asiento.add("Galeria");
                            precio.add(precio_galeria*cantidad_asientos);
                            if (edad <= 6){
                                descuento.add((precio_galeria*cantidad_asientos) - ((precio_galeria*cantidad_asientos)*0.10));
                                tipo_descuento.add("10%");
                            } else if (edad >= 60){
                                descuento.add((precio_galeria*cantidad_asientos) - ((precio_galeria*cantidad_asientos)*0.25));
                                tipo_descuento.add("25%");
                            } else if (edad > 18 && edad < 60 && mujer == false){
                                descuento.add((precio_galeria*cantidad_asientos) - 0.0);
                                tipo_descuento.add("0%");
                            } else if (edad >= 7 && edad <= 18){
                                descuento.add((precio_galeria*cantidad_asientos) - ((precio_galeria*cantidad_asientos)*0.15));
                                tipo_descuento.add("15%");
                            } else if (edad > 18 && edad < 60 && mujer == true){
                                descuento.add((precio_galeria*cantidad_asientos) - ((precio_galeria*cantidad_asientos)*0.20));
                                tipo_descuento.add("20%");
                            }
                            break;
                    }
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                System.out.println("             Teatro moro            ");
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                System.out.println("Ubicacion: " + tipo_asiento.get(contador));
                System.out.println("Asientos comprados: ");
                System.out.println(asientos);
                System.out.println("Costo Base: $" + precio.get(contador));
                System.out.println("Descuento Aplicado: $" + tipo_descuento.get(contador));
                System.out.println("Costo Final : $" + descuento.get(contador));
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                System.out.println("Gracias por su visita al Teatro Moro");
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                asientos_vendidos.addAll(asientos);
                asientos.clear();
                    contador+=1;
                    mujer = false;
                }else if (res_usuario == 2){
                    System.out.println("Gracias por su compra");
                    System.out.println("Los asientos vendidos fueron: ");
                    System.out.println(asientos_vendidos);
                    seguir_programa = false;
                }else if (res_usuario < 1){
                    System.out.println("Opcion no valida, intente otra vez");
                }else if (res_usuario > 2){
                    System.out.println("Opcion no valida, intente otra vez");
                }
                    
}}}
