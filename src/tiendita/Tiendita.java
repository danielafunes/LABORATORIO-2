package tiendita;

import Clases.Usuario;
import java.util.Scanner;

public class Tiendita {
    
    private static boolean session = false;
    
    private static Usuario user = null;
    
    /******************************************************************************************************************************************************************
    Nombre de la función: init
    Descripción: Este método tiene por objetivo inicializar las variable a utilizar para la ejecución del problema.
    Creador(es): Daniela Funes <00158916@uca.edu.sv>
    Parametros que recibe: 
                            menu (Arreglo): Recibe un arreglo el cual contiene los textos a mostrar en pantalla.
                            pantalla (Entero): Define el formato de mensajes a mostrar en pantalla.
                                *   La pantalla podrá tomar 2 estados: (1, 2) => 1 : Login ; 2 : Principal.
    Parametro que envia:
                            Ninguno
    Fecha de creación: 06/04/2018			Fecha última de modificación: 06/04/2018
    *******************************************************************************************************************************************************************/
    
    private static void menu (String[] menu, int pantalla) {
        Scanner scanner = new Scanner(System.in);
        
        if (pantalla == 1) {
            if (!Tiendita.session) {
                String usuario = null; String contraseña = null;
                System.out.println(menu[0]); // Imprime menu[0] => "Ingrese nombre usuario: "
                usuario = scanner.next();
                System.out.println(menu[1]); // Imprime menu[1] =>  "Ingrese contraseña:"
                contraseña = scanner.next();

                Tiendita.user.setUsuario(usuario);
                Tiendita.user.setContraseña(contraseña);
                
                if (Tiendita.user.getUsuario().equals("Daniela") && Tiendita.user.getContraseña().equals("1234")) {
                    session = true;
                } else {
                    System.out.println("¡Datos incorrectos!");
                }
            } else {
                System.out.println("Ya hay sesión abierta!");
            }
        } else {
            for (int i = 0; i < menu.length; i ++) {
                System.out.println(menu[i]);
            }
        }
    }
    
    public static void main (String[] args) {
        Tiendita.user = new Usuario();
        
        while (true) {
            if (!session) {
                String login[] = {
                    "Ingrese nombre usuario: ",
                    "Ingrese contraseña:"
                };
                System.out.println("Login: *********** ");
                menu(login, 1);
             } else {
                String principal[] = {
                  "Bienvenido a La tiendita",
                  "1. Agregar producto",
                  "2. Eliminar producto",
                  "3. Modificar producto",
                  "4. Descargar producto ",
                  "5. Cargar Producto"
                };
                
                menu(principal, 2);
             }
        }
    }
    
}
