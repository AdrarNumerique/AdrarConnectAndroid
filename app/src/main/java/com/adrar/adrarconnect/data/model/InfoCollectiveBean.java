package com.adrar.adrarconnect.data.model;

import java.io.Serializable;

public class InfoCollectiveBean implements Serializable {

    private int id;
    private long date;
    private CentreFormationBean centreDeFormation;
    private int nombrePlacesMax;
    private int complet;
    private String idSessionConnexion;


    //---------------
    // constructeur
    //---------------

    public InfoCollectiveBean() {
        super();
    }

    public InfoCollectiveBean(int date, int nombrePlacesMax) {
        this.date = date;
        this.nombrePlacesMax = nombrePlacesMax;
    }

//    public InfoCollectiveBean(String idSessionConnexion,)

    public InfoCollectiveBean(int date, CentreFormationBean centreDeFormation, int nombrePlacesMax, int complet) {
        this.date = date;
        this.centreDeFormation = centreDeFormation;
        this.nombrePlacesMax = nombrePlacesMax;
        this.complet = complet;
    }

    //---------------
    // getter & setter
    //---------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getNombrePlacesMax() {
        return nombrePlacesMax;
    }

    public void setNombrePlacesMax(int nombrePlacesMax) {
        this.nombrePlacesMax = nombrePlacesMax;
    }

    public CentreFormationBean getCentreDeFormation() {
        return centreDeFormation;
    }

    public void setCentreDeFormation(CentreFormationBean centreDeFormation) {
        this.centreDeFormation = centreDeFormation;
    }

    public int isComplet() {
        return complet;
    }

    public void setComplet(int complet) {
        this.complet = complet;
    }
}
