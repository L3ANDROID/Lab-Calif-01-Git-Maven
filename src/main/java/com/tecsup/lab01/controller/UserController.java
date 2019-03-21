package com.tecsup.lab01.controller;
import com.tecsup.lab01.model.User;
import javax.swing.JOptionPane;

public class UserController {
	static String nombre,apellido,edad;
	
    public static void main( String[] args ){
    	User u=new User();
        
        nombre=u.nombre;
        apellido=u.apellido;
        edad=u.edad;
    }
    public String datos(){
    	String data=nombre+" "+apellido+" con edad de "+edad+" años";
    	return data;
    }
}