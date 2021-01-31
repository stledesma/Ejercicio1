/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes_programacion;

/**
 *
 * @author KILLER
 */
public class SporadicAuthor extends Author implements InterfaceMensaje{
    private String credential;
    private String mensaje = "Saludos desde Autor Exporadico Interface";

    public SporadicAuthor(String credential, String name, String lastName, String ci) {
        super(name, lastName, ci);
        this.credential = credential;
    }

    public SporadicAuthor(String credential) {
        this.credential = credential;
    }

    public SporadicAuthor() {
    }

    /**
     * @return the credential
     */
    public String getCredential() {
        return credential;
    }

    /**
     * @param credential the credential to set
     */
    public void setCredential(String credential) {
        this.credential = credential;
    }

    @Override
    public void Registro() {
       System.out.println("Mensaje desde Autor Exporadicoj"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Mensaje() {
        System.out.println(mensaje); //To change body of generated methods, choose Tools | Templates.
    }
    
}
