package com.cristobalbernal.correo.ui.Model;

public class Contacto {
    private final int id;
    private final String nonbre;
    private final String primerApellido;
    private final String segundoApellido;
    private final String cumpleanos;
    private final int photo;
    private final String email;
    private final String telefono1;
    private final String telefono2;
    private final String direccion;

    public Contacto(int id, String nonbre, String primerApellido, String segundoApellido, String cumpleanos, int photo, String email, String telefono1, String telefono2, String direccion) {
        this.id = id;
        this.nonbre = nonbre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cumpleanos = cumpleanos;
        this.photo = photo;
        this.email = email;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.direccion = direccion;
    }

    public int getPhoto() {
        return photo;
    }

    public int getId() {
        return id;
    }

    public String getNonbre() {
        return nonbre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCumpleanos() {
        return cumpleanos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "id=" + id +
                ", nonbre='" + nonbre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", cumpleanos='" + cumpleanos + '\'' +
                ", photo=" + photo +
                ", email='" + email + '\'' +
                ", telefono1='" + telefono1 + '\'' +
                ", telefono2='" + telefono2 + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
