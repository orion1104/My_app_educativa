package com.example.jcod.mathmusic;

/**
 * Created by JCOD on 17/07/2016.
 */
public class DatosCliente {

    public DatosCliente()
    {

    }

    public String getStrnombre() {
        return strnombre;
    }

    public void setStrnombre(String strnombre) {
        this.strnombre = strnombre;
    }

    private String strnombre;

    public String getGetapellido() {
        return strapellido;
    }

    public void setStrapellido(String strapellido) {
        this.strapellido = strapellido;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    private String strapellido;
    private int sexo;

    public int getSexo() {
        return sexo;
    }

    public String getCorreo() {
        return correo;
    }

    private String correo;

}
