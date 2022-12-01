package com.cristobalbernal.correo.ui.Model;

import java.util.Arrays;

public class Cuenta {
    private final int id;
    private final String name;
    private final String apellido;
    private final String email;
    private final Contacto[] contactos;
    private final Email[] emails;


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public Email[] getEmails() {
        return emails;
    }

    public Cuenta(int id, String name, String apellido, String email, Contacto[] contactos, Email[] emails) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.contactos = contactos;
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", contactos=" + Arrays.toString(contactos) +
                ", emails=" + Arrays.toString(emails) +
                '}';
    }
}
