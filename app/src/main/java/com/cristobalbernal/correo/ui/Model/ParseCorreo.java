package com.cristobalbernal.correo.ui.Model;

import android.content.Context;
import android.util.Log;

import com.cristobalbernal.correo.R;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;

public class ParseCorreo {
    private final InputStream correoArchivo;
    private Cuenta cuenta;

    public ParseCorreo(Context context){
        this.correoArchivo = context.getResources().openRawResource(R.raw.correos);
    }

    public boolean parse(){
        boolean parsed = false;
        String json = null;

        try {
            int size = correoArchivo.available();
            byte[] buffer = new byte[size];
            correoArchivo.read(buffer);
            correoArchivo.close();
            json = new String(buffer, "UTF-8");
            JSONTokener tokener = new JSONTokener(json);
            JSONArray jsonArray = new JSONArray(tokener);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                JSONObject jsonAccount = jsonObject.getJSONObject("myAccount");

                int idCuenta = jsonAccount.getInt("id");
                String nombreCuenta = jsonAccount.getString("name");
                String apellidoCuenta = jsonAccount.getString("firstSurname");
                String correoCuenta = jsonAccount.getString("email");

                JSONArray arrayContacts = jsonObject.getJSONArray("contacts");
                Contacto[] contactos = new Contacto[arrayContacts.length()];
                for(int j = 0; j < arrayContacts.length(); j++) {
                    JSONObject jsonContacto = arrayContacts.getJSONObject(j);
                    int id = jsonContacto.getInt("id");
                    String nombre = jsonContacto.getString("name");
                    String apellido1 = jsonContacto.getString("firstSurname");
                    String apellido2 = jsonContacto.getString("secondSurname");
                    String fechaNacimiento = jsonContacto.getString("birth");
                    int foto = jsonContacto.getInt("foto");
                    String email = jsonContacto.getString("email");
                    String telefono1 = jsonContacto.getString("phone1");
                    String telefono2 = jsonContacto.getString("phone2");
                    String direccion = jsonContacto.getString("address");
                    Contacto contacto = new Contacto(id, nombre, apellido1, apellido2, fechaNacimiento, foto, email, telefono1, telefono2, direccion);
                    contactos[j] = contacto;
                }

                JSONArray arrayMails = jsonObject.getJSONArray("mails");
                Email[] correos = new Email[arrayMails.length()];
                for(int k = 0; k < arrayMails.length(); k++) {
                    JSONObject jsonMails = arrayMails.getJSONObject(k);
                    String de = jsonMails.getString("from");
                    String para = jsonMails.getString("to");
                    String asunto = jsonMails.getString("subject");
                    String cuerpo = jsonMails.getString("body");
                    String fechaEnvio = jsonMails.getString("sentOn");
                    boolean leido = jsonMails.getBoolean("readed");
                    boolean borrado = jsonMails.getBoolean("deleted");
                    boolean spam = jsonMails.getBoolean("spam");
                    Email correo = new Email(de, para, asunto, cuerpo, fechaEnvio, leido, borrado, spam);
                    correos[k] = correo;
                }
                cuenta = new Cuenta(idCuenta, nombreCuenta, apellidoCuenta, correoCuenta, contactos, correos);
            }

            parsed = true;
        } catch (Exception e) {
            Log.e("ParserCorreo", "Unknown Exception: "+e.getLocalizedMessage());
        }
        return parsed;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
