
package test;

import Dominio.Actividades;
import java.util.Scanner;

public class testActividades {
    static Scanner datos=new Scanner(System.in);  //aqui se puede usar scaner en todos los metodos
    public static void main(String[] args) {
        //int [] numeros = new int[3]; //array de datos primitivos
        Actividades [] Estudiantes;
        int n=4; //numero de vehiculos ser 3
        Estudiantes =new Actividades[n];
        llenarDatos(Estudiantes);
        for (int i=0;i<Estudiantes.length;i++){
            System.out.println(Estudiantes[i]);
           }
    }
    public static void llenarDatos(Actividades est[]){
        String genero;
        String nombre;
        double nota;
        for(int i=0;i<est.length;i++){
        System.out.println("El nombre del estudiante; ");
        nombre=datos.nextLine();
        System.out.println("Genero del estudiante; ");
        genero=datos.nextLine();
        System.out.println("La nota del estudiante; ");
        nota=datos.nextDouble();
        est[i]=new Actividades(nombre,nota,genero); //esta guardando en un array los objetos
        datos.nextLine();
        }
        
    }
}


