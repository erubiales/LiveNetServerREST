package com.livenet.livenet.localizacion;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "localizaciones")
public class Localizacion implements Serializable {

    //Necesarios
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id = 0;

    @Column(name = "alias", nullable = false, unique = true)
    private String alias;

    @Column(name = "latitud", nullable = false)
    private float latitud;

    @Column(name = "longitud", nullable = false)
    private float longitud;

    @Column(name = "fecha_hora", nullable = false)
    private Date fechaHora;



    public Localizacion() {
    }

    public Localizacion(String alias, float latitud, float longitud, Date fechaHora) {
        this.alias = alias;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fechaHora = fechaHora;
    }

    public Localizacion(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }


    @Override
    public String toString() {
        return "Localizacion{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", fechaHora=" + fechaHora +
                '}';
    }
}
