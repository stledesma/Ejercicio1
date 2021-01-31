/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes_programacion;

import java.time.Clock;

/**
 *
 * @author KILLER
 */
public class NewAuthor extends Author implements InterfaceMensaje{
    private String unavoidableRegister;
    private String mensaje = "Saludos desde Autor Novel Interface";

    public NewAuthor(String unavoidableRegister, String name, String lastName, String ci) {
        super(name, lastName, ci);
        this.unavoidableRegister = unavoidableRegister;
    }

    public NewAuthor(String unavoidableRegister) {
        this.unavoidableRegister = unavoidableRegister;
    }

    public NewAuthor() {
    }

    /**
     * @return the unavoidableRegister
     */
    public String getUnavoidableRegister() {
        return unavoidableRegister;
    }

    /**
     * @param unavoidableRegister the unavoidableRegister to set
     */
    public void setUnavoidableRegister(String unavoidableRegister) {
        this.unavoidableRegister = unavoidableRegister;
    }

    @Override
    public void Registro() {
        System.out.println("Mensaje desde Autor Novel");
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Mensaje() {
        System.out.println(mensaje); //To change body of generated methods, choose Tools | Templates.
    }
    
}
