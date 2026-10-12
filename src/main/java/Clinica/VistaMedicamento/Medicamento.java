/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.VistaMedicamento;

/**
 *
 * @author Administrador
 */
public class Medicamento {
    private Long id;
    private String nom;
    private double pre;

    public Medicamento() {
    }

    public Medicamento(Long id, String nom, double pre) {
        this.id = id;
        this.nom = nom;
        this.pre = pre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }
    
    
}
