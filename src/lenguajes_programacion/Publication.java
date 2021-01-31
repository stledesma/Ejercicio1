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
public class Publication {
    private String autor;
    private Date publicationDate;
    private String thematicArea;

    public Publication(String autor, Date publicationDate, String thematicArea) {
        this.autor = autor;
        this.publicationDate = publicationDate;
        this.thematicArea = thematicArea;
    }

    public Publication() {
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the publicationDate
     */
    public Date getPublicationDate() {
        return publicationDate;
    }

    /**
     * @param publicationDate the publicationDate to set
     */
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * @return the thematicArea
     */
    public String getThematicArea() {
        return thematicArea;
    }

    /**
     * @param thematicArea the thematicArea to set
     */
    public void setThematicArea(String thematicArea) {
        this.thematicArea = thematicArea;
    }
    
}
