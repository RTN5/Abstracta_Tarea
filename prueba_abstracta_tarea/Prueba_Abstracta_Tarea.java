/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_abstracta_tarea;

/**
 *
 * @author User
 */
abstract class Consesionario{
    private String sistema;
    private String componente1;
    private String componente2;
    private String componente3;
    private int numerofallas;
    
    public Consesionario(String sistema, String componente1, String componente2, String componente3, int numerofallas){
        System.out.println("______________________________________________________________________________________________");
        System.out.println("\nIntegrando los datos, de un Diagnostico:\n");
        this.sistema = sistema;
        this.componente1 = componente1;
        this.componente2 = componente2;
        this.componente3 = componente3;
        this.numerofallas = numerofallas;
    }
    
    public double fallas(){
        System.out.println("fallas del vehiculo");
        return 0.0;
    }
    
    public void EnviarDiagnosticoPorCorreo(){
        System.out.println("Enviar al correo el diagnostico del :"+this.sistema+""+this.numerofallas);
    }
    
    public String toString(){
        return sistema+""+componente1+""+componente2+""+componente3+""+numerofallas;
    }
    
    
    public String getSistema(){
        return sistema;
    }
    
    public String getComponente1(){
        return componente1;
    }
    public void setComponentes1(String nueva){
        componente1 = nueva;
    }
    
    public String getComponente2(){
        return componente2;
    }
    public void setComponentes2(String nueva2){
        componente2 = nueva2;
    }
    
    public String getComponente3(){
        return componente3;
    }
    public void setComponentes3(String nueva3){
        componente3 = nueva3;
    }
    
    public int getNumerofallas(){
        return numerofallas;
    }
   
}  

class CasaVaca extends Consesionario{
    private int DCasaVaca;
    
    public CasaVaca(String sistema, String componente1, String componente2, String componente3, int numerofallas, int DCasaVaca){
        super(sistema, componente1, componente2, componente3, numerofallas);
        setDCasaVaca(DCasaVaca);
    }
    
    public void EnviarDiagnosticoPorCorreo(){
        System.out.println("-Dentro del Metodo EnviarDiagnosticoPorCorreo de la clase CasaVaca");
        System.out.println("-Enviado el diagnostico del Sistema de "+getSistema()+""
                + " con los siguientes  componentes defectuosos:\n   [1].- "+getComponente1()+"\n "
                        + "  [2].- "+getComponente2()+"\n   [3].- "+getComponente3()+"\n Siendo la "
                                + "revision numero "+getNumerofallas()+" de las "+getDCasaVaca()+" gratuitas");
        
    }
    
    public int getDCasaVaca(){
        return DCasaVaca;
    }
    
    public void setDCasaVaca(int nuevo){
        if(nuevo>=0.0)
            DCasaVaca=nuevo;
    }
    
    public double fallas(){
        System.out.println("              Diagnostico Online del Sistema de "+getSistema());
        return DCasaVaca;
    }
}


class Ambacar extends Consesionario{
    private int DAmbacar;
    
    public Ambacar(String sistema, String componente1, String componente2, String componente3, int numerofallas, int DAmbacar){
        super(sistema, componente1, componente2, componente3, numerofallas);
        setDAmbacar(DAmbacar);
    }
    
    public void EnviarDiagnosticoPorCorreo(){
        System.out.println("-Dentro del Metodo EnviarDiagnosticoPorCorreo de la clase Ambacar");
        System.out.println("-Enviado el diagnostico del Sistema de "+getSistema()+""
                + " con los siguientes  componentes defectuosos:\n   [1].- "+getComponente1()+"\n "
                        + "  [2].- "+getComponente2()+"\n   [3].- "+getComponente3()+""
                                + "\n Siendo la revision numero "+getNumerofallas()+" de las "+getDAmbacar()+" gratuitas");
        
    }
    
    public int getDAmbacar(){
        return DAmbacar;
    }
    
    public void setDAmbacar(int nuevo){
        if(nuevo>=0.0)
            DAmbacar=nuevo;
    }
    
    public double fallas(){
        System.out.println("            Diagnostico Online del Sistema de "+getSistema());
        return DAmbacar;
    }
}



public class Prueba_Abstracta_Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("      Universidad de las Fuerzas Armadas ESPE\n");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Materia: Programación [7450] ");
        System.out.println("Integrantes: Esteban Morales, Lenin Carrillo");
        System.out.println("Tema: Abstract \n");
    
        
        
        Consesionario ObjetoConsesionario = new CasaVaca(" Arranque ","Bateria","Rele de arranque","regulador de voltaje",4,5);
 
        System.out.println("-LLamada a EnviarDiagnosticoPorCorreo usando la referencia de la clase Consesionario");
        ObjetoConsesionario.EnviarDiagnosticoPorCorreo();
        
        CasaVaca ObjetoCasaVaca = new CasaVaca("Frenos","Azafatas","Bomba de lubricante","Pedal de freno",2,5);
        ObjetoCasaVaca.fallas();
        System.out.println("-LLamada a EnviarDiagnosticoPorCorreo usando la referencia de la clase CasaVaca");
        ObjetoCasaVaca.EnviarDiagnosticoPorCorreo();
        
        
        Ambacar ObjetoAmbacar = new Ambacar("Transmisión","Disco de Embrague","Azafatas de friccion","Diafragma de preción",1,3);
        ObjetoAmbacar.fallas();
        System.out.println("-LLamada a EnviarDiagnosticoPorCorreo usando la referencia de la clase Ambacar");
        ObjetoAmbacar.EnviarDiagnosticoPorCorreo();
        
    }
    
}
