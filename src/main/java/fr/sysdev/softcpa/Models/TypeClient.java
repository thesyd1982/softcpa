/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Models;

/**
 *
 * @author sysdev
 */
public enum TypeClient {
  //Objets directement construits
  PRO("Professionel"),
  PART("Particulier");
  
  String type ="";
  
   //Constructeur
  TypeClient(String type){
    this.type = type;
  }
  
  
  @Override
  public String toString(){
    return type;
  }
   
  
}
