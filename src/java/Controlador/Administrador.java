package Controlador;

import Clases.Barrio;
import Clases.Comuna;
import Clases.Incidente;
import Clases.TipoIncidente;
import Clases.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author desarrollo4
 */
public class Administrador {

    private List<Usuario> listausuarios = new ArrayList<Usuario>();
    private List<Barrio> listabarrio = new ArrayList<Barrio>();
    private List<Comuna> listaComunas = new ArrayList<Comuna>();
    private Usuario usuario = new Usuario();
    private Barrio barrio = new Barrio();
    private Comuna comuna = new Comuna();
    private Incidente incidente = new Incidente();
    private List<Barrio> lstbarrio = new ArrayList<Barrio>();
    private List<Incidente>lstincidente = new ArrayList<Incidente>();

    public Administrador() {
        listarComuna();      
        usuario = new Usuario();
        listarIncidente();
    }

    public List<Usuario> getListausuarios() {
        return listausuarios;
    }

    public void setListausuarios(List<Usuario> listausuarios) {
        this.listausuarios = listausuarios;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Comuna> getListaComunas() {
        return listaComunas;
    }

    public void setListaComunas(List<Comuna> listaComunas) {
        this.listaComunas = listaComunas;
    }

     public List<Barrio> getListabarrio() {
        return listabarrio;
    }

    public void setListabarrio(List<Barrio> listabarrio) {
        this.listabarrio = listabarrio;
    }

    public Incidente getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }

    public List<Barrio> getLstbarrio() {
        return lstbarrio;
    }

    public void setLstbarrio(List<Barrio> lstbarrio) {
        this.lstbarrio = lstbarrio;
    }

    public List<Incidente> getLstincidente() {
        return lstincidente;
    }

    public void setLstincidente(List<Incidente> lstincidente) {
        this.lstincidente = lstincidente;
    }
    

    public void ValidarUsuario() {

//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Bienvenido " + usuario.getUsu_nombre() + "!"));
    }

    public final List<Comuna> listarComuna() {

        comuna.setCom_codigo(1);
        comuna.setCom_nombre("COMUNA ATARDECERES");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(2);
        comuna.setCom_nombre("COMUNA SAN JOSÉ");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(3);
        comuna.setCom_nombre("COMUNA CUMANDAY");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(4);
        comuna.setCom_nombre("COMUNA ESTACIÓN");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(5);
        comuna.setCom_nombre("COMUNA CIUDADELA DEL NORTE");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(6);
        comuna.setCom_nombre("COMUNA ECOTURÍSTICO CERRO DE ORO");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(7);
        comuna.setCom_nombre("COMUNA TESORITO");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(8);
        comuna.setCom_nombre("COMUNA PALOGRANDE");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(9);
        comuna.setCom_nombre("COMUNA UNIVERSITARIA");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(10);
        comuna.setCom_nombre("COMUNA LA FUENTE");
        getListaComunas().add(comuna);
        comuna = new Comuna();

        comuna.setCom_codigo(11);
        comuna.setCom_nombre("COMUNA LA MACARENA");
        getListaComunas().add(comuna);

        return getListaComunas();

    }

    public final List<Barrio> ListarBarrios() {
        System.out.println("ingreso al metodo barrio");
        Barrio bar = new Barrio();
        bar.setCodigo_barrio(1010);
        bar.setNombre_barrio("LA LINDA");
        bar.setString_est_codigo("2");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1011);
        bar.setNombre_barrio("La Quinta");
        bar.setString_est_codigo("2");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1020);
        bar.setNombre_barrio("BELLA MONTAÑA");
        bar.setString_est_codigo("3");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1021);
        bar.setNombre_barrio("Hospital Geriatrico san Isidro");
        bar.setString_est_codigo("0");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1022);
        bar.setNombre_barrio("Escuela de Trabajo la Linda");
        bar.setString_est_codigo("0");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1030);
        bar.setNombre_barrio("SACATIN");
        bar.setString_est_codigo("1");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1040);
        bar.setNombre_barrio("VILLA PILAR");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1041);
        bar.setNombre_barrio("Villa Pilar II");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1042);
        bar.setNombre_barrio("Torres de Avila");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1043);
        bar.setNombre_barrio("Venecia");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1044);
        bar.setNombre_barrio("San Luis");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1045);
        bar.setNombre_barrio("Aquilino Villegas");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1046);
        bar.setNombre_barrio("Urb. Atalaya");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1047);
        bar.setNombre_barrio("Urb. Bello Horizonte");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1048);
        bar.setNombre_barrio("Urb. Santa Mónica");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1050);
        bar.setNombre_barrio("CHIPRE");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1051);
        bar.setNombre_barrio("Chipre Viejo");
        bar.setString_est_codigo("3");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1052);
        bar.setNombre_barrio("Balcones de Chipre");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1053);
        bar.setNombre_barrio("Bellavista");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1060);
        bar.setNombre_barrio("CAMPOHERMOSO");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1061);
        bar.setNombre_barrio("La Chimenea I y II");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1062);
        bar.setNombre_barrio("Altos de Castilla");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1063);
        bar.setNombre_barrio("Terrazas de Campohermoso");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1064);
        bar.setNombre_barrio("Conjunto Campohermoso");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1065);
        bar.setNombre_barrio("Universidad de Manizales");
        bar.setString_est_codigo("0");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1070);
        bar.setNombre_barrio("MORROGACHO");
        bar.setString_est_codigo("2");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1071);
        bar.setNombre_barrio("Topacio");
        bar.setString_est_codigo("2");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1072);
        bar.setNombre_barrio("Montana");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1080);
        bar.setNombre_barrio("LA FRANCIA");
        bar.setString_est_codigo("6");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1081);
        bar.setNombre_barrio("Palmar");
        bar.setString_est_codigo("6");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1082);
        bar.setNombre_barrio("San Francisco");
        bar.setString_est_codigo("6");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1083);
        bar.setNombre_barrio("Poblado");
        bar.setString_est_codigo("6");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1084);
        bar.setNombre_barrio("San Remo");
        bar.setString_est_codigo("6");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1085);
        bar.setNombre_barrio("Candelaria");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1090);
        bar.setNombre_barrio("LOS ALCAZARES");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1091);
        bar.setNombre_barrio("Portal de los Alcazares");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1092);
        bar.setNombre_barrio("Portales");
        bar.setString_est_codigo("5");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1093);
        bar.setNombre_barrio("Villa Real");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1094);
        bar.setNombre_barrio("Quinta Hispania");
        bar.setString_est_codigo("2");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1095);
        bar.setNombre_barrio("Asturias");
        bar.setString_est_codigo("4");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(1100);
        bar.setNombre_barrio("ARENILLO");
        bar.setString_est_codigo("2-3");
        bar.setComuna(1);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2010);
        bar.setNombre_barrio("ASIS");
        bar.setString_est_codigo("1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2011);
        bar.setNombre_barrio("Jazmin");
        bar.setString_est_codigo("1-2");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2020);
        bar.setNombre_barrio("AVANZADA");
        bar.setString_est_codigo("2 - 1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2021);
        bar.setNombre_barrio("Camino del Medio");
        bar.setString_est_codigo("1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2022);
        bar.setNombre_barrio("Tachuelo");
        bar.setString_est_codigo("1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2030);
        bar.setNombre_barrio("SAN IGNACIO");
        bar.setString_est_codigo("2");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2040);
        bar.setNombre_barrio("GALAN");
        bar.setString_est_codigo("2 - 1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2041);
        bar.setNombre_barrio("Alto Galan");
        bar.setString_est_codigo("1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2042);
        bar.setNombre_barrio("Maizal");
        bar.setString_est_codigo("1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2043);
        bar.setNombre_barrio("Holanda");
        bar.setString_est_codigo("1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2050);
        bar.setNombre_barrio("ESTRADA");
        bar.setString_est_codigo("1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2051);
        bar.setNombre_barrio("Sierra Morena");
        bar.setString_est_codigo("1");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2060);
        bar.setNombre_barrio("DELICIAS");
        bar.setString_est_codigo("3 - 2");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2070);
        bar.setNombre_barrio("SAN JOSE");
        bar.setString_est_codigo("3 - 2");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2071);
        bar.setNombre_barrio("San Vicente");
        bar.setString_est_codigo("2");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2080);
        bar.setNombre_barrio("COLON");
        bar.setString_est_codigo("3 - 2");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(2081);
        bar.setNombre_barrio("Galerias");
        bar.setString_est_codigo("3");
        bar.setComuna(2);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3010);
        bar.setNombre_barrio("LAS AMERICAS");
        bar.setString_est_codigo("3");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3011);
        bar.setNombre_barrio("La Palma");
        bar.setString_est_codigo("3");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3012);
        bar.setNombre_barrio("Residencias Caldas");
        bar.setString_est_codigo("3");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3013);
        bar.setNombre_barrio("Terminal de Transportes");
        bar.setString_est_codigo("0");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3020);
        bar.setNombre_barrio("LOS AGUSTINOS");
        bar.setString_est_codigo("3");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3030);
        bar.setNombre_barrio("CENTRO");
        bar.setString_est_codigo("3-4");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3031);
        bar.setNombre_barrio("Valvanera");
        bar.setString_est_codigo("3");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3040);
        bar.setNombre_barrio("SAN JOAQUIN");
        bar.setString_est_codigo("3");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3050);
        bar.setNombre_barrio("CAMPO AMOR");
        bar.setString_est_codigo("3");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3051);
        bar.setNombre_barrio("Hoyo Frio");
        bar.setString_est_codigo("3");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(3060);
        bar.setNombre_barrio("FUNDADORES");
        bar.setString_est_codigo("3-4");
        bar.setComuna(3);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4010);
        bar.setNombre_barrio("SANTA HELENA");
        bar.setString_est_codigo("3-4");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4011);
        bar.setNombre_barrio("Saenz");
        bar.setString_est_codigo("3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4012);
        bar.setNombre_barrio("Conjunto cerrado Fundadores");
        bar.setString_est_codigo("3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4013);
        bar.setNombre_barrio("Parque Castilla");
        bar.setString_est_codigo("3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4014);
        bar.setNombre_barrio("Universidad Autonoma");
        bar.setString_est_codigo("");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4015);
        bar.setNombre_barrio("Conjunto cerrado la Estaci3⁄4n");
        bar.setString_est_codigo("6");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4020);
        bar.setNombre_barrio("LOS CEDROS");
        bar.setString_est_codigo("3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4021);
        bar.setNombre_barrio("Urbanizacion el Rio");
        bar.setString_est_codigo("3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4030);
        bar.setNombre_barrio("SAN JORGE");
        bar.setString_est_codigo("3-4");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4040);
        bar.setNombre_barrio("EL SOL");
        bar.setString_est_codigo("4 - 3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4041);
        bar.setNombre_barrio("La Primavera");
        bar.setString_est_codigo("4");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4042);
        bar.setNombre_barrio("Conjunto las Americas");
        bar.setString_est_codigo("3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4050);
        bar.setNombre_barrio("LA ARGENTINA");
        bar.setString_est_codigo("3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4060);
        bar.setNombre_barrio("LA ASUNCION");
        bar.setString_est_codigo("3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4061);
        bar.setNombre_barrio("Villa del Río");
        bar.setString_est_codigo("3");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4070);
        bar.setNombre_barrio("VERSALLES");
        bar.setString_est_codigo("4 - 5");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4071);
        bar.setNombre_barrio("Nuevo Versalles");
        bar.setString_est_codigo("4");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4080);
        bar.setNombre_barrio("EL CAMPIN");
        bar.setString_est_codigo("4");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4090);
        bar.setNombre_barrio("LLERAS");
        bar.setString_est_codigo("3-4");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(4091);
        bar.setNombre_barrio("Bavaria");
        bar.setString_est_codigo("3-4");
        bar.setComuna(4);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5010);
        bar.setNombre_barrio("PUERTA DEL SOL (Corinto)");
        bar.setString_est_codigo("1");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5011);
        bar.setNombre_barrio("Aures");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5020);
        bar.setNombre_barrio("SIERRA MORENA");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5030);
        bar.setNombre_barrio("EL CARIBE");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5031);
        bar.setNombre_barrio("Piamonte");
        bar.setString_est_codigo("3");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5040);
        bar.setNombre_barrio("SAN CAYETANO");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5050);
        bar.setNombre_barrio("BOSQUES DEL NORTE");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5051);
        bar.setNombre_barrio("Bengala");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5060);
        bar.setNombre_barrio("SAN SEBASTIAN");
        bar.setString_est_codigo("1");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5070);
        bar.setNombre_barrio("SOLFERINO");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5071);
        bar.setNombre_barrio("Samaria");
        bar.setString_est_codigo("1");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5080);
        bar.setNombre_barrio("LA CAROLA");
        bar.setString_est_codigo("3");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5081);
        bar.setNombre_barrio("La Carolita");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5082);
        bar.setNombre_barrio("Altos de Granada");
        bar.setString_est_codigo("3");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5083);
        bar.setNombre_barrio("Villa Cafe");
        bar.setString_est_codigo("3");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5084);
        bar.setNombre_barrio("Parte del Ecoparque");
        bar.setString_est_codigo("");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5090);
        bar.setNombre_barrio("VILLAHERMOSA");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5091);
        bar.setNombre_barrio("La Daniela");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5092);
        bar.setNombre_barrio("Viña del Rio");
        bar.setString_est_codigo("3");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5093);
        bar.setNombre_barrio("La Playa");
        bar.setString_est_codigo("3");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5100);
        bar.setNombre_barrio("COMUNEROS");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5110);
        bar.setNombre_barrio("FANNY GONZALEZ");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5120);
        bar.setNombre_barrio("ALTOS DE CAPRI");
        bar.setString_est_codigo("3");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5121);
        bar.setNombre_barrio("Palonegro o Altos del Encenillo");
        bar.setString_est_codigo("3");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5130);
        bar.setNombre_barrio("VILLA JULIA");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5140);
        bar.setNombre_barrio("PORVENIR");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5141);
        bar.setNombre_barrio("Parte del Ecoparque");
        bar.setString_est_codigo("");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5150);
        bar.setNombre_barrio("SINAI");
        bar.setString_est_codigo("2");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5151);
        bar.setNombre_barrio("Parte del Ecoparque");
        bar.setString_est_codigo("");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(5160);
        bar.setNombre_barrio("PERALONSO");
        bar.setString_est_codigo("2 – 1");
        bar.setComuna(5);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6010);
        bar.setNombre_barrio("VIVEROS");
        bar.setString_est_codigo("3");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6011);
        bar.setNombre_barrio("Yarumales I y II");
        bar.setString_est_codigo("2");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6012);
        bar.setNombre_barrio("Licorera");
        bar.setString_est_codigo("3");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6013);
        bar.setNombre_barrio("Villa Luz");
        bar.setString_est_codigo("3");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6020);
        bar.setNombre_barrio("LA CUMBRE");
        bar.setString_est_codigo("3 - 2");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6030);
        bar.setNombre_barrio("MINITAS");
        bar.setString_est_codigo("3");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6040);
        bar.setNombre_barrio("BAJA SUIZA");
        bar.setString_est_codigo("4");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6050);
        bar.setNombre_barrio("ALTA SUIZA");
        bar.setString_est_codigo("4 - 5");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6051);
        bar.setNombre_barrio("La Riviera");
        bar.setString_est_codigo("4");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6060);
        bar.setNombre_barrio("RESIDENCIAS MANIZALES");
        bar.setString_est_codigo("4");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6070);
        bar.setNombre_barrio("COLSEGUROS");
        bar.setString_est_codigo("4");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6071);
        bar.setNombre_barrio("Torres de Oriente");
        bar.setString_est_codigo("5");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6072);
        bar.setNombre_barrio("Agrícola de Seguros");
        bar.setString_est_codigo("5");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6080);
        bar.setNombre_barrio("LA TOSCANA");
        bar.setString_est_codigo("3");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6081);
        bar.setNombre_barrio("Escuela de Carabineros");
        bar.setString_est_codigo("3");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6090);
        bar.setNombre_barrio("LA SULTANA");
        bar.setString_est_codigo("3");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6100);
        bar.setNombre_barrio("BOSQUES DE NIZA");
        bar.setString_est_codigo("4");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6101);
        bar.setNombre_barrio("Balcones de la Palma");
        bar.setString_est_codigo("4");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6102);
        bar.setNombre_barrio("Camino de la Palma");
        bar.setString_est_codigo("4");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6103);
        bar.setNombre_barrio("Rincón de la Palma");
        bar.setString_est_codigo("4");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6104);
        bar.setNombre_barrio("Cerro de Oro");
        bar.setString_est_codigo("3");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6105);
        bar.setNombre_barrio("Mirador de la Sierra");
        bar.setString_est_codigo("2");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(6106);
        bar.setNombre_barrio("Colinas de San Sebastián");
        bar.setString_est_codigo("5");
        bar.setComuna(6);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7010);
        bar.setNombre_barrio("SAN MARCEL");
        bar.setString_est_codigo("6");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7011);
        bar.setNombre_barrio("El Pinar");
        bar.setString_est_codigo("4");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7012);
        bar.setNombre_barrio("Arboletes");
        bar.setString_est_codigo("5");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7013);
        bar.setNombre_barrio("Conjunto cerrado Santa Ana");
        bar.setString_est_codigo("5");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7014);
        bar.setNombre_barrio("Chachafruto");
        bar.setString_est_codigo("2");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7015);
        bar.setNombre_barrio("Bosque Popular");
        bar.setString_est_codigo("4");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7020);
        bar.setNombre_barrio("ALHAMBRA");
        bar.setString_est_codigo("6");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7021);
        bar.setNombre_barrio("El portal del Bosque");
        bar.setString_est_codigo("6");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7022);
        bar.setNombre_barrio("Colinas del Viento");
        bar.setString_est_codigo("6");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7030);
        bar.setNombre_barrio("CERROS DE LA ALHAMBRA");
        bar.setString_est_codigo("6");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7031);
        bar.setNombre_barrio("Valles de la Alhambra");
        bar.setString_est_codigo("6");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7040);
        bar.setNombre_barrio("MALTERIA");
        bar.setString_est_codigo("1");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7041);
        bar.setNombre_barrio("Juanchito");
        bar.setString_est_codigo("1 - 2");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7050);
        bar.setNombre_barrio("ZONA INDUSTRIAL");
        bar.setString_est_codigo("1");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7051);
        bar.setNombre_barrio("Sena");
        bar.setString_est_codigo("1");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7060);
        bar.setNombre_barrio("CASERIO LA ENEA");
        bar.setString_est_codigo("4 - 3");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7061);
        bar.setNombre_barrio("La Capilla");
        bar.setString_est_codigo("2");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7062);
        bar.setNombre_barrio("Bosques de la Alhambra");
        bar.setString_est_codigo("4");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7063);
        bar.setNombre_barrio("Villa Fundemos");
        bar.setString_est_codigo("2");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7064);
        bar.setNombre_barrio("El Cairo");
        bar.setString_est_codigo("3");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7070);
        bar.setNombre_barrio("LA ENEA");
        bar.setString_est_codigo("3");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7071);
        bar.setNombre_barrio("Los Pinos");
        bar.setString_est_codigo("3");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7072);
        bar.setNombre_barrio("Sector Gallinazo");
        bar.setString_est_codigo("3");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7073);
        bar.setNombre_barrio("Aeropuerto");
        bar.setString_est_codigo("3");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(7080);
        bar.setNombre_barrio("LUSITANIA");
        bar.setString_est_codigo("3 – 2");
        bar.setComuna(7);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8010);
        bar.setNombre_barrio("LEONORA");
        bar.setString_est_codigo("4 - 5");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8011);
        bar.setNombre_barrio("Baja Leonora");
        bar.setString_est_codigo("4");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8020);
        bar.setNombre_barrio("LOS ROSALES");
        bar.setString_est_codigo("5 - 4 - 6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8030);
        bar.setNombre_barrio("LA RAMBLA");
        bar.setString_est_codigo("5");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8040);
        bar.setNombre_barrio("LAURELES");
        bar.setString_est_codigo("5");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8050);
        bar.setNombre_barrio("PALOGRANDE");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8051);
        bar.setNombre_barrio("Estadio");
        bar.setString_est_codigo("5");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8052);
        bar.setNombre_barrio("Universidad de Caldas");
        bar.setString_est_codigo("5");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8053);
        bar.setNombre_barrio("Universidad Nacional");
        bar.setString_est_codigo("5");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8060);
        bar.setNombre_barrio("ESTRELLA");
        bar.setString_est_codigo("5 - 6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8070);
        bar.setNombre_barrio("BELEN");
        bar.setString_est_codigo("5 - 6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8080);
        bar.setNombre_barrio("GUAYACANES");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8090);
        bar.setNombre_barrio("ARBOLEDA");
        bar.setString_est_codigo("5");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8091);
        bar.setNombre_barrio("Conjunto Ibiza");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8100);
        bar.setNombre_barrio("PALERMO");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8101);
        bar.setNombre_barrio("Los Sauces");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8102);
        bar.setNombre_barrio("Bajo Palermo");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8110);
        bar.setNombre_barrio("CAMELIA");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8111);
        bar.setNombre_barrio("Sector del Batallon");
        bar.setString_est_codigo("0");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8120);
        bar.setNombre_barrio("SANCANCIO");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8121);
        bar.setNombre_barrio("La Alameda");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8122);
        bar.setNombre_barrio("Villa del Campo");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8123);
        bar.setNombre_barrio("Loma Verde");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8130);
        bar.setNombre_barrio("MILAN");
        bar.setString_est_codigo("5 - 6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8131);
        bar.setNombre_barrio("Guaduales");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8131);
        bar.setNombre_barrio("Alto del perro");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8132);
        bar.setNombre_barrio("Tejares del Bosque");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8132);
        bar.setNombre_barrio("Sierra Bonita");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8137);
        bar.setNombre_barrio("Condominio el Tejar");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8138);
        bar.setNombre_barrio("San Sebastián de Buena Vista");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8140);
        bar.setNombre_barrio("EL TREBOL");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8141);
        bar.setNombre_barrio("Los Guaduales");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8142);
        bar.setNombre_barrio("Rincon de Doña Elvira");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8143);
        bar.setNombre_barrio("Edificio Tejarres del bosque");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8144);
        bar.setNombre_barrio("Condominio el Tejar");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8145);
        bar.setNombre_barrio("Rincon del Trebol");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8146);
        bar.setNombre_barrio("Bosques del Trebol");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(8147);
        bar.setNombre_barrio("San Sebastian de Buena Vista");
        bar.setString_est_codigo("6");
        bar.setComuna(8);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9010);
        bar.setNombre_barrio("BETANIA");
        bar.setString_est_codigo("2 - 3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9020);
        bar.setNombre_barrio("FATIMA");
        bar.setString_est_codigo("3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9030);
        bar.setNombre_barrio("VIVIENDA POPULAR");
        bar.setString_est_codigo("3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9031);
        bar.setNombre_barrio("Granjas y Viviendas");
        bar.setString_est_codigo("2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9032);
        bar.setNombre_barrio("Sector del Aguacate");
        bar.setString_est_codigo("2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9040);
        bar.setNombre_barrio("PIO XII");
        bar.setString_est_codigo("2 - 1");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9050);
        bar.setNombre_barrio("KENNEDY");
        bar.setString_est_codigo("2 - 3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9051);
        bar.setNombre_barrio("San Luis");
        bar.setString_est_codigo("2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9052);
        bar.setNombre_barrio("Pepe Caceres");
        bar.setString_est_codigo("2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9053);
        bar.setNombre_barrio("Ciudadela del Ciego");
        bar.setString_est_codigo("2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9054);
        bar.setNombre_barrio("Sector Bolivariana");
        bar.setString_est_codigo("2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9055);
        bar.setNombre_barrio("San Fernando");
        bar.setString_est_codigo("2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9060);
        bar.setNombre_barrio("CAMILO TORRES");
        bar.setString_est_codigo("2 - 3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9061);
        bar.setNombre_barrio("Santos");
        bar.setString_est_codigo("3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9062);
        bar.setNombre_barrio("Villa Mercedes");
        bar.setString_est_codigo("3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9070);
        bar.setNombre_barrio("LAS COLINAS");
        bar.setString_est_codigo("3 - 2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9071);
        bar.setNombre_barrio("11 de noviembre");
        bar.setString_est_codigo("2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9072);
        bar.setNombre_barrio("Castilla");
        bar.setString_est_codigo("3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9080);
        bar.setNombre_barrio("MALHABAR");
        bar.setString_est_codigo("3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9081);
        bar.setNombre_barrio("Sector Malhabar II");
        bar.setString_est_codigo("3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9090);
        bar.setNombre_barrio("ARANJUEZ");
        bar.setString_est_codigo("3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9091);
        bar.setNombre_barrio("El Encuentro");
        bar.setString_est_codigo("3");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(9092);
        bar.setNombre_barrio("La Paz");
        bar.setString_est_codigo("2");
        bar.setComuna(9);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10010);
        bar.setNombre_barrio("URIBE");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10011);
        bar.setNombre_barrio("Villa Nueva");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10012);
        bar.setNombre_barrio("El Palmar");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10020);
        bar.setNombre_barrio("VELEZ");
        bar.setString_est_codigo("4 - 3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10022);
        bar.setNombre_barrio("Los Alamos");
        bar.setString_est_codigo("4");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10030);
        bar.setNombre_barrio("COLOMBIA");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10040);
        bar.setNombre_barrio("EL PRADO");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10050);
        bar.setNombre_barrio("BAJO PRADO");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10060);
        bar.setNombre_barrio("GONZALEZ");
        bar.setString_est_codigo("1-2");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10070);
        bar.setNombre_barrio("PERSIA");
        bar.setString_est_codigo("2");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10071);
        bar.setNombre_barrio("Bajo Persia");
        bar.setString_est_codigo("1-2");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10072);
        bar.setNombre_barrio("Isabela");
        bar.setString_est_codigo("2");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10073);
        bar.setNombre_barrio("Eucaliptus");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10074);
        bar.setNombre_barrio("Portal Eucaliptus");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10075);
        bar.setNombre_barrio("Portal de San Luis");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10080);
        bar.setNombre_barrio("GUAMAL");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10081);
        bar.setNombre_barrio("La Fuente");
        bar.setString_est_codigo("4");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10082);
        bar.setNombre_barrio("Galicia");
        bar.setString_est_codigo("4");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10090);
        bar.setNombre_barrio("EL PARAISO");
        bar.setString_est_codigo("1");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10100);
        bar.setNombre_barrio("VILLA CARMENZA");
        bar.setString_est_codigo("4");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10110);
        bar.setNombre_barrio("ARRAYANES");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10120);
        bar.setNombre_barrio("CERVANTES");
        bar.setString_est_codigo("3");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10130);
        bar.setNombre_barrio("NEVADO");
        bar.setString_est_codigo("2");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10131);
        bar.setNombre_barrio("Andes");
        bar.setString_est_codigo("2");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10132);
        bar.setNombre_barrio("Bajo Nevado");
        bar.setString_est_codigo("1");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10133);
        bar.setNombre_barrio("Panamericana");
        bar.setString_est_codigo("1");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10140);
        bar.setNombre_barrio("MARMATO");
        bar.setString_est_codigo("1");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10141);
        bar.setNombre_barrio("La Isla");
        bar.setString_est_codigo("1");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(10142);
        bar.setNombre_barrio("Solidaridad");
        bar.setString_est_codigo("1");
        bar.setComuna(10);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11010);
        bar.setNombre_barrio("SAN ANTONIO");
        bar.setString_est_codigo("3");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11020);
        bar.setNombre_barrio("20 DE JULIO");
        bar.setString_est_codigo("1-2");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11021);
        bar.setNombre_barrio("Solidaridad");
        bar.setString_est_codigo("1-2");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11030);
        bar.setNombre_barrio("EL CARMEN");
        bar.setString_est_codigo("1-2");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11031);
        bar.setNombre_barrio("Campamento");
        bar.setString_est_codigo("1");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11032);
        bar.setNombre_barrio("La Providencia");
        bar.setString_est_codigo("1");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11033);
        bar.setNombre_barrio("Albania");
        bar.setString_est_codigo("1");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11034);
        bar.setNombre_barrio("El Rocio");
        bar.setString_est_codigo("1");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11040);
        bar.setNombre_barrio("CASTELLANA");
        bar.setString_est_codigo("6");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11050);
        bar.setNombre_barrio("EL BOSQUE");
        bar.setString_est_codigo("3");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11051);
        bar.setNombre_barrio("Bosconia");
        bar.setString_est_codigo("1");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11060);
        bar.setNombre_barrio("BUENA ESPERANZA");
        bar.setString_est_codigo("2 - 3 - 1");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11070);
        bar.setNombre_barrio("NOGALES");
        bar.setString_est_codigo("3");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11071);
        bar.setNombre_barrio("Portal de Nogales");
        bar.setString_est_codigo("3");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11080);
        bar.setNombre_barrio("PANORAMA");
        bar.setString_est_codigo("2");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11081);
        bar.setNombre_barrio("Nuevo Horizontes");
        bar.setString_est_codigo("2");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11082);
        bar.setNombre_barrio("La Montaña");
        bar.setString_est_codigo("2");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11090);
        bar.setNombre_barrio("CENTENARIO");
        bar.setString_est_codigo("3");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11091);
        bar.setNombre_barrio("Villa Kempis");
        bar.setString_est_codigo("2");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11092);
        bar.setNombre_barrio("Chapinero");
        bar.setString_est_codigo("1");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11100);
        bar.setNombre_barrio("ESTAMBUL");
        bar.setString_est_codigo("3");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11101);
        bar.setNombre_barrio("Villa Jardín");
        bar.setString_est_codigo("3");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11102);
        bar.setNombre_barrio("Torres de Esponsion");
        bar.setString_est_codigo("3");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11103);
        bar.setNombre_barrio("Niño Jesús de Praga");
        bar.setString_est_codigo("2");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11104);
        bar.setNombre_barrio("Granjas de Estambul");
        bar.setString_est_codigo("2");
        bar.setComuna(11);
        getListabarrio().add(bar);
        bar = new Barrio();

        bar.setCodigo_barrio(11105);
        bar.setNombre_barrio("Esstación Uribe");
        bar.setString_est_codigo("2");
        bar.setComuna(11);
        getListabarrio().add(bar);

        return getListabarrio();
    }
    
    public String reportarIncidencia(){ 
        return "registroincidencia";
    }   
    
    public void cargarBarrio(){
        listabarrio = new ArrayList<Barrio>();
        lstbarrio =  new ArrayList<Barrio>();
        listabarrio = ListarBarrios();     
        for (Barrio ls : listabarrio){
            if (ls.getComuna() == getComuna().getCom_codigo()){
              lstbarrio.add(ls);                
            }          
        }  
    }
    
    public void listarIncidente() {
        incidente = new Incidente();
        incidente.setInc_codigo(1);
        incidente.setBarrio(new Barrio(1));
        incidente.setInc_descripcion("Holaaa");
        incidente.setInc_fecha(new Date());
        incidente.setTipoIncidente(new TipoIncidente());
        lstincidente.add(incidente);
        for (int i = 0; i < 10; i++) {
            incidente = new Incidente();
            incidente.setInc_codigo(i+1);
            incidente.setBarrio(new Barrio(1));
            incidente.setInc_descripcion("Holaaa" + i);
            incidente.setInc_fecha(new Date());
            incidente.setTipoIncidente(new TipoIncidente());
            lstincidente.add(incidente);
        }
        for (Incidente incidente : lstincidente) {
            System.out.println("incidente" + incidente.getInc_descripcion());
        }
    }
  

}
