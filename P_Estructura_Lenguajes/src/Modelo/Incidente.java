package Modelo;

import java.util.Date;

public class Incidente {

    private int inc_codigo;
    private String inc_descripcion;
    private Date inc_fecha;
    private Usuario usuario;
    private TipoIncidente tipoIncidente;
    private Barrio barrio;

    public Incidente() {
        inc_codigo = 0;
        inc_descripcion = "";
        inc_fecha = new Date();
    }

    public int getInc_codigo() {
        return inc_codigo;
    }

    public void setInc_codigo(int inc_codigo) {
        this.inc_codigo = inc_codigo;
    }

    public String getInc_descripcion() {
        return inc_descripcion;
    }

    public void setInc_descripcion(String inc_descripcion) {
        this.inc_descripcion = inc_descripcion;
    }

    public Date getInc_fecha() {
        return inc_fecha;
    }

    public void setInc_fecha(Date inc_fecha) {
        this.inc_fecha = inc_fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoIncidente getTipoIncidente() {
        return tipoIncidente;
    }

    public void setTipoIncidente(TipoIncidente tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

}
