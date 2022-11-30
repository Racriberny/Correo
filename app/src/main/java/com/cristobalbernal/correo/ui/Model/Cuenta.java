package com.cristobalbernal.correo.ui.Model;

public class Cuenta {
    private final int id;
    private final String name;
    private final String apellido;
    private final String correo;

    public Cuenta(int id, String name, String apellido, String correo) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

}
