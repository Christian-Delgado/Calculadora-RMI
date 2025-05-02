/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajavarmi;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author Crhistian
 */
public class servidor {
    
    public static void main (String[] args) {
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("calculadora", new rmi());
            JOptionPane.showMessageDialog(null, "Conectado el servidor");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No conectado el servidor" + e);
        }
    }
}
