package com.tecsup.lab01.view;
import com.tecsup.lab01.controller.UserController;
import com.tecsup.lab01.model.User;
import javax.swing.*;

public class View {
	public static void main( String[] args ){
		UserController uc=new UserController();
		User u=new User();
		
		String data;
		
		data =JOptionPane.showInputDialog("Ingrese su nombre: "); 
		u.nom=data;
		data= JOptionPane.showInputDialog("Ingrese su apellido: ");
		u.ape=data;
		data= JOptionPane.showInputDialog("Ingrese su edad: ");
		u.edad=data;
		
		uc.datos();
    }
	
}