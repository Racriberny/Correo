package com.cristobalbernal.correo.ui.Model;

public class Email {
    private final String from;
    private final String to;
    private final String subject;
    private final String texto;
    private final String enviado;
    private final boolean leido;
    private final boolean eliminado;
    private final boolean spam;

    public Email(String from, String to, String subject, String texto, String enviado, boolean leido, boolean eliminado, boolean spam) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.texto = texto;
        this.enviado = enviado;
        this.leido = leido;
        this.eliminado = eliminado;
        this.spam = spam;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getTexto() {
        return texto;
    }

    public String getEnviado() {
        return enviado;
    }

    public boolean isLeido() {
        return leido;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public boolean isSpam() {
        return spam;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", texto='" + texto + '\'' +
                ", enviado='" + enviado + '\'' +
                ", leido=" + leido +
                ", eliminado=" + eliminado +
                ", spam=" + spam +
                '}';
    }
}
