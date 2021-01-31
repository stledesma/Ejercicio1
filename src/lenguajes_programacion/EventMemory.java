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
public class EventMemory extends Publication implements InterfaceMensaje{
    private String eventName;
    private String eventURL;
    private String mensaje = "Saludos desde Memorias de Evento Interface";

    public EventMemory(String eventName, String eventURL, String autor, Date publicationDate, String thematicArea) {
        super(autor, publicationDate, thematicArea);
        this.eventName = eventName;
        this.eventURL = eventURL;
    }

    public EventMemory(String eventName, String eventURL) {
        this.eventName = eventName;
        this.eventURL = eventURL;
    }

    public EventMemory() {
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return the eventURL
     */
    public String getEventURL() {
        return eventURL;
    }

    /**
     * @param eventURL the eventURL to set
     */
    public void setEventURL(String eventURL) {
        this.eventURL = eventURL;
    }

    @Override
    public void Mensaje() {
        System.out.println(mensaje); //To change body of generated methods, choose Tools | Templates.
    }
    
}
