/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes_programacion;

import java.util.Date;

/**
 *
 * @author KILLER
 */
public class ScientificArticle extends Publication implements InterfaceMensaje{
    private String magazineName;
    private String goiCode;
    private String mensaje = "Saludos desde Articulo Cientifico Interface";

    public ScientificArticle(String magazineName, String goiCode, String autor, Date publicationDate, String thematicArea) {
        super(autor, publicationDate, thematicArea);
        this.magazineName = magazineName;
        this.goiCode = goiCode;
    }

    public ScientificArticle(String magazineName, String goiCode) {
        this.magazineName = magazineName;
        this.goiCode = goiCode;
    }

    public ScientificArticle() {
    }

    /**
     * @return the magazineName
     */
    public String getMagazineName() {
        return magazineName;
    }

    /**
     * @param magazineName the magazineName to set
     */
    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    /**
     * @return the goiCode
     */
    public String getGoiCode() {
        return goiCode;
    }

    /**
     * @param goiCode the goiCode to set
     */
    public void setGoiCode(String goiCode) {
        this.goiCode = goiCode;
    }

    @Override
    public void Mensaje() {
        System.out.println(mensaje); //To change body of generated methods, choose Tools | Templates.
    }
    
}
