package Modelo;

import java.util.Date;

public class Usuario {

    private int usu_codigo;
    private String usu_num_tel;
    private String usu_pass;
    private String usu_direccion;
    private Date usu_fech_regis;
    private TipoUsuario tipoUsuario;

    public Usuario() {
        usu_codigo = 0;
        usu_direccion = "";
        usu_fech_regis = new Date();
        usu_pass = "";
        usu_num_tel = "";
        tipoUsuario = new TipoUsuario();
    }

    public Usuario(int usu_codigo, String usu_num_tel, String usu_pass, String usu_direccion, Date usu_fech_regis, TipoUsuario tipoUsuario) {
        this.usu_codigo = usu_codigo;
        this.usu_num_tel = usu_num_tel;
        this.usu_pass = usu_pass;
        this.usu_direccion = usu_direccion;
        this.usu_fech_regis = usu_fech_regis;
        this.tipoUsuario = tipoUsuario;
    }

    public int getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(int usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getUsu_num_tel() {
        return usu_num_tel;
    }

    public void setUsu_num_tel(String usu_num_tel) {
        this.usu_num_tel = usu_num_tel;
    }

    public String getUsu_pass() {
        return usu_pass;
    }

    public void setUsu_pass(String usu_pass) {
        this.usu_pass = usu_pass;
    }

    public String getUsu_direccion() {
        return usu_direccion;
    }

    public void setUsu_direccion(String usu_direccion) {
        this.usu_direccion = usu_direccion;
    }

    public Date getUsu_fech_regis() {
        return usu_fech_regis;
    }

    public void setUsu_fech_regis(Date usu_fech_regis) {
        this.usu_fech_regis = usu_fech_regis;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
