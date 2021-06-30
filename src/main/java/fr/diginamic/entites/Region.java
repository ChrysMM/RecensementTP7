package fr.diginamic.entites;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Region caractérisée par un code, un nom, un nombre d'habitants, une liste de villes et de département
 * @author  Chrystellemm
 */
public class Region {
    private int id;
    private String code;
    private String nom;

    /**
     * Constructeur
     * @param id l'identifiant
     * @param code Le code
     * @param nom Le nom
     */
    public Region(int id, String code, String nom) {
        this.id = id;
        this.code = code;
        this.nom = nom;
    }

    /**
     * Getteur id
     * @return L'identifiant de la région
     */
    public int getId() {
        return id;
    }

    /**
     * Setteur id
     * @param id l'identifiant
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getteur code
     * @return Le code de la région
     */
    public String getCode() {
        return code;
    }

    /**
     * Setteur code
     * @param code Le code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getteur nom
     * @return Le nom de la région
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setteur nom
     * @param nom Le nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Redéfinition toString
     * @return Une chaîne de caractère décrivant la région
     */
    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}