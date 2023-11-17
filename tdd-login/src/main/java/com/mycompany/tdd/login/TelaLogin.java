/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdd.login;

/**
 *
 * @author atenor
 */
public class TelaLogin {
    private String userArmazenado = "mandssltn";
    private String senhaArmazenada = "12345";
    
    public boolean login (String usuario, String senha){
        return verificarUser(usuario) && verificarSenha(senha);
    }
    
    private boolean verificarUser(String user){
        if (user == null || user == " "){
        return false;
        }
        else{
            return userArmazenado.equals(user);
        }   
    };
    
    private boolean verificarSenha(String senha){
        if(senha == null || senha == " "){
            return false;
        }
        else{
            return senhaArmazenada.equals(senha);
        }
    }
}
