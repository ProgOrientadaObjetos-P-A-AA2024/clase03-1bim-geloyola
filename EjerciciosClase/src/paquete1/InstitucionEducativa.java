/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    
    /*Crear los método necesarios*/
    public void establecerNombreCompletos(String a){
        nombre= a;
    }
    public void establecerTipoInstitucion(String a){
        tipoInstitucion= a;
    }
    public void establecerNumeroAlumnos(int a){
        numeroAlumnos= a;
    }
    public void establecerNumeroDocentes(int a){
        numeroDocentes= a;
    }
    public void establecerNumeroSedes(int a){
        numeroSedes= a;
    }
    //obtener
    public String obtenerNombresCompletos(){
        return nombre;
    }
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    public int obtenernumeroDocentes(){
        return numeroDocentes;
    }
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    
}
