/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajavarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Crhistian
 */
public interface calculadora extends Remote {

    public int div(int a, int b) throws RemoteException;
    public int mul(int a, int b) throws RemoteException;
    public int sub(int a, int b) throws RemoteException;
    public int add(int a, int b) throws RemoteException;
    
}
