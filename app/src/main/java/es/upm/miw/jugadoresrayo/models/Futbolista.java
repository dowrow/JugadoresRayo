package es.upm.miw.jugadoresrayo.models;

/**
 * Created by dowrow on 30/10/15.
 */
public class Futbolista {

    private int _id;

    private String _nombre;

    private int _dorsal;

    private boolean _lesionado;

    private String _equipo;

    private String _url_imagen;

    public Futbolista(int _id, String _nombre, int _dorsal, boolean _lesionado, String _equipo, String _url_imagen) {
        this._id = _id;
        this._nombre = _nombre;
        this._dorsal = _dorsal;
        this._lesionado = _lesionado;
        this._equipo = _equipo;
        this._url_imagen = _url_imagen;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int get_dorsal() {
        return _dorsal;
    }

    public void set_dorsal(int _dorsal) {
        this._dorsal = _dorsal;
    }

    public boolean is_lesionado() {
        return _lesionado;
    }

    public void set_lesionado(boolean _lesionado) {
        this._lesionado = _lesionado;
    }

    public String get_equipo() {
        return _equipo;
    }

    public void set_equipo(String _equipo) {
        this._equipo = _equipo;
    }

    public String get_url_imagen() {
        return _url_imagen;
    }

    public void set_url_imagen(String _url_imagen) {
        this._url_imagen = _url_imagen;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "_id=" + _id +
                ", _nombre='" + _nombre + '\'' +
                ", _dorsal=" + _dorsal +
                ", _lesionado=" + _lesionado +
                ", _equipo='" + _equipo + '\'' +
                ", _url_imagen='" + _url_imagen + '\'' +
                '}';
    }
}
