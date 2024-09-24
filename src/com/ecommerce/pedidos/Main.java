package com.ecommerce.pedidos;

import com.ecommerce.Cliente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicita el nombre del cliente
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();
        
        Cliente cliente = new Cliente(1, nombreCliente);

        // Lista de productos cárnicos 
        Producto tocinoBarriguero = new Producto(1, "Tocino Barriguero", 11750);
        Producto canonCerdo = new Producto(2, "Cañón de Cerdo", 11400);
        Producto costillaCerdo = new Producto(3, "Costilla de Cerdo", 10950);
        Producto piernaCerdo = new Producto(4, "Pierna de Cerdo", 9950);
        Producto solomitoCerdo = new Producto(5, "Solomito de Cerdo", 12500);
        Producto chuletaCerdo = new Producto(6, "Chuleta de Cerdo", 16500);
        Producto bondiolaCerdo = new Producto(7, "Bondiola de Cerdo", 14000);
        Producto lomoCerdo = new Producto(8, "Lomo de Cerdo", 15000);
        Producto costillasBabyBack = new Producto(9, "Costilla Fina", 18000);

        Producto bistecRes = new Producto(10, "Bistec de Res", 24200);
        Producto puntaAnca = new Producto(11, "Punta de Anca", 35600);
        Producto churrasco = new Producto(12, "Churrasco", 30000);
        Producto ribeye = new Producto(13, "Solimto de Res ", 32000);
        Producto solomilloRes = new Producto(14, "Solomillo", 28000);
        Producto asadoTira = new Producto(15, "Carne de sancocho", 21340);
        Producto carneMolidaEspecial = new Producto(16, "Carne Molida Especial", 16450);
        Producto costillaRes = new Producto(17, "Costilla de Res", 22000);
        Producto pechoRes = new Producto(18, "Pecho de Res", 15900);

        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("Menú:");
            System.out.println("1. Agregar producto al carrito");
            System.out.println("2. Ver total");
            System.out.println("3. Finalizar compra");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar productos al carrito
                    System.out.println("Seleccione producto:");
                    System.out.println("1. Tocino Barriguero - $11,750");
                    System.out.println("2. Cañón de Cerdo - $11,400");
                    System.out.println("3. Costilla de Cerdo - $10,950");
                    System.out.println("4. Pierna de Cerdo - $9,950");
                    System.out.println("5. Solomito de Cerdo - $12,500");
                    System.out.println("6. Chuleta de Cerdo - $16,500");
                    System.out.println("7. Bondiola de Cerdo - $14,000");
                    System.out.println("8. Lomo de Cerdo - $15,000");
                    System.out.println("9. Costilla Fina - $18,000");
                    System.out.println("10. Bistec de Res - $24,200");
                    System.out.println("11. Punta de Anca - $35,600");
                    System.out.println("12. Chur - $30,000");
                    System.out.println("13. Ribeye - $32,000");
                    System.out.println("14. Solomillo - $28,000");
                    System.out.println("15. Carne de Sancocho - $21,340");
                    System.out.println("16. Carne Molida Especial - $16,450");
                    System.out.println("17. Costilla de Res - $22,000");
                    System.out.println("18. Pecho de Res - $15,900");

                    int eleccionProducto = scanner.nextInt();
                    
                    switch (eleccionProducto) {
                        case 1:
                            cliente.agregarProducto(tocinoBarriguero);
                            break;
                        case 2:
                            cliente.agregarProducto(canonCerdo);
                            break;
                        case 3:
                            cliente.agregarProducto(costillaCerdo);
                            break;
                        case 4:
                            cliente.agregarProducto(piernaCerdo);
                            break;
                        case 5:
                            cliente.agregarProducto(solomitoCerdo);
                            break;
                        case 6:
                            cliente.agregarProducto(chuletaCerdo);
                            break;
                        case 7:
                            cliente.agregarProducto(bondiolaCerdo);
                            break;
                        case 8:
                            cliente.agregarProducto(lomoCerdo);
                            break;
                        case 9:
                            cliente.agregarProducto(costillasBabyBack);
                            break;
                        case 10:
                            cliente.agregarProducto(bistecRes);
                            break;
                        case 11:
                            cliente.agregarProducto(puntaAnca);
                            break;
                        case 12:
                            cliente.agregarProducto(churrasco);
                            break;
                        case 13:
                            cliente.agregarProducto(ribeye);
                            break;
                        case 14:
                            cliente.agregarProducto(solomilloRes);
                            break;
                        case 15:
                            cliente.agregarProducto(asadoTira);
                            break;
                        case 16:
                            cliente.agregarProducto(carneMolidaEspecial);
                            break;
                        case 17:
                            cliente.agregarProducto(costillaRes);
                            break;
                        case 18:
                            cliente.agregarProducto(pechoRes);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;

                case 2:
                    // Mostrar total
                    System.out.printf("Total: $%.2f%n", cliente.calcularTotal());
                    break;

                case 3:
                    // Finalizar compra
                    Pedido pedido = new Pedido(1, cliente, cliente.getCarritoCompras());
                    pedido.mostrarResumenPedido();
                    
                    // Terminar el programa después de finalizar la compra
                    ejecutando = false; 
                    break;

                case 4:
                    
                    // Salir del programa
                    ejecutando = false; 
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}