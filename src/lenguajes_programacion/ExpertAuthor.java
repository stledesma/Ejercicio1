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
public class ExpertAuthor extends Author implements InterfaceMensaje{
    private Publication publication[];
    private String mensaje = "Saludos desde Autor Experto Interface";

    public ExpertAuthor() {
    }

    public ExpertAuthor(Publication[] publication, String name, String lastName, String ci) {
        super(name, lastName, ci);
        this.publication = publication;
    }

    /**
     * @return the publication
     */
    public Publication[] getPublication() {
        return publication;
    }

    /**
     * @param publication the publication to set
     */
    public void setPublication(Publication[] publication) {
        this.publication = publication;
    }

    public ExpertAuthor(Publication[] publication) {
        this.publication = publication;
    }

    @Override
    public void Registro() {
        System.out.println("Mensaje desde Autor Experto");
    }

    @Override
    public void Mensaje() {
        System.out.println(mensaje); //To change body of generated methods, choose Tools | Templates.
    }

}
