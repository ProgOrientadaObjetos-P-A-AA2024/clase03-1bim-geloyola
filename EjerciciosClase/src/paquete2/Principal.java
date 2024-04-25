/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa il = new InstitucionEducativa();
        
        // System.out.printf("%s     ", i1.);
        //valores de entrada 
        String nombresCompletos= "Mariana de Jesus";
        String tipoInstitucion= "Particular" ;
        int numeroAlumnos= 400;
        int numeroDocentes= 100;
        int numeroSedes= 5;
        //metodos establecer
        il.establecerNombreCompletos(nombresCompletos);
        il.establecerTipoInstitucion(tipoInstitucion);
        il.establecerNumeroAlumnos(numeroAlumnos);
        il.establecerNumeroDocentes(numeroDocentes);
        il.establecerNumeroSedes(numeroSedes);
         
        System.out.printf("Nombre de la Institucion:%s\n" +"Tipo de Institucion: "
                + "%s\n" + "Numero de Alumnos: %s\n" + "Numero de Docentes: %s\n"
                +"Numero de Sedes: %s\n",il.obtenerNombresCompletos(), il.obtenerTipoInstitucion(),
                il.obtenerNumeroAlumnos(),il.obtenernumeroDocentes(), il.obtenerNumeroSedes() );
       
        
        
    }
}
