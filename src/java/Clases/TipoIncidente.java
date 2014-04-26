package Clases;

public class TipoIncidente {

    private int tipc_codigo;
    private String tipc_descripcion;

    public TipoIncidente() {
        tipc_codigo = 0;
        tipc_descripcion = "";

    }

    public TipoIncidente(int tipc_codigo, String tipc_descripcion) {
        this.tipc_codigo = tipc_codigo;
        this.tipc_descripcion = tipc_descripcion;
    }

    public int getTipc_codigo() {
        return tipc_codigo;
    }

    public void setTipc_codigo(int tipc_codigo) {
        this.tipc_codigo = tipc_codigo;
    }

    public String getTipc_descripcion() {
        return tipc_descripcion;
    }

    public void setTipc_descripcion(String tipc_descripcion) {
        this.tipc_descripcion = tipc_descripcion;
    }

}
