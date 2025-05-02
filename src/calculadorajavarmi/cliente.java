/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajavarmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Crhistian
 */
public class cliente {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            Registry miRegistro = LocateRegistry.getRegistry("localhost", 1099);
            calculadora c = (calculadora)Naming.lookup("//localhost/calculadora");
            
            while(true){
                String menu = JOptionPane.showInputDialog("     Calculadora\n\n"
                        + "Esta es la mejor calculadora\n"
                        + "Ingrese [1]..SUMAR\n"
                        + "Ingrese [2]..RESTAR\n"
                        + "Ingrese [3]..MULTIPLICAR\n"
                        + "Ingrese [2]..DIVIDIR\n"
                        + "Click boton cancelar para salir"
                );
                switch (menu){
                    case "1":{
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Sumar Ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Sumar Ingrese el segundo numero"));
                        JOptionPane.showMessageDialog(null, "La suma es: " + c.add(x, y));
                        break;
                    }
                    case "2":{
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Restar Ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Restar Ingrese el segundo numero"));
                        JOptionPane.showMessageDialog(null, "La resta es: " + c.sub(x, y));
                        break;
                    }
                    case "3":{
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Multiplicar Ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Multiplicar Ingrese el segundo numero"));
                        JOptionPane.showMessageDialog(null, "La multilpicacion es: " + c.mul(x, y));
                        break;
                    }
                    case "4":{
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Dividir Ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Dividir Ingrese el segundo numero"));
                        JOptionPane.showMessageDialog(null, "La division es: " + c.div(x, y));
                        break;
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Servidor no conectado" + e);
        }
    }
}
