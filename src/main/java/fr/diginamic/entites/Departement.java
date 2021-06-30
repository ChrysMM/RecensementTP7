package fr.diginamic.entites;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe Departement représente un département ayant un code, un nombre d'habitants, une region à laquelle appartient
 * et une liste de villes qu'il contient
 *  @author: Chrystellemm
 */
public class Departement {
    private int id;
    private String code;
    private Region region;

    /**
     * Constructeur
     * @param id identifant département
     * @param code code département
     * @param region région associée au département
     */
    public Departement(int id, String code, Region region) {
        this.id = id;
        this.code = code;
        this.region = region;
    }

    /**
     * getterur id
     * @return l'identifant du département
     */
    public int getId() {
        return id;
    }

    /**
     * Setteur identifant
     * @param id l'identifiant du déparetement
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getteur code département
     * @return le code départemental
     */
    public String getCode() {
        return code;
    }

    /**
     * setteur code département
     * @param code Le code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * getteur region
     * @return région associée au département
     */
    public Region getRegion() {
        return region;
    }

    /**
     * setteur region au département
     * @param region La région
     */
    public void setRegion(Region region) {
        this.region = region;
    }

    /**
     * redefinition toString
     * @return Une chaine de caractère représentant le département
     */
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", region=" + region +
                '}';
    }
}