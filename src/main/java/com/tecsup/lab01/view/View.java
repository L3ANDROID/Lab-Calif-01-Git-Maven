package com.tecsup.lab01.view;
import com.tecsup.lab01.controller.UserController;
import com.tecsup.lab01.model.User;
import javax.swing.*;

public class View {
	
	public static void  Imprimir() {
		
		UserController uc=new UserController();
		User u=new User();
		
		String data;
		
		String data =JOptionPane.showInputDialog("Ingrese su nombre: "); 
		u.nom=data;
		String data= JOptionPane.showInputDialog("Ingrese su apellido: ");
		u.ape=data;
		String data= JOptionPane.showInputDialog("Ingrese su edad: ");
		u.edad=data;
		
		uc.datos();
		
		
		
	}
	
}