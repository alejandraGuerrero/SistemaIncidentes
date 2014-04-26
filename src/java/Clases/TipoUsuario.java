package Clases;

public class TipoUsuario {

    private int tip_codigo;
    private String tip_descripcion;

    public TipoUsuario() {
        tip_descripcion = "";
        tip_codigo = 0;
    }

    public TipoUsuario(int tip_usuario, String tip_descripcion) {
        this.tip_codigo = tip_usuario;
        this.tip_descripcion = tip_descripcion;
    }

    public int getTip_codigo() {
        return tip_codigo;
    }

    public void setTip_codigo(int tip_codigo) {
        this.tip_codigo = tip_codigo;
    }

    public String getTip_descripcion() {
        return tip_descripcion;
    }

    public void setTip_descripcion(String tip_descripcion) {
        this.tip_descripcion = tip_descripcion;
    }

}
