package com.bolivarSoftware.sie.domain;

import javax.persistence.*;

/**
 * Created by Damian Gallego on 27/4/2018.
 */

@Entity
@Table(name = "ENCUESTAS")
public class Encuesta {

    @Id
    @Column(name = "ENC_ID")
    private Long id;

    @Column(name = "ENC_ID_GOOGLE")
    private String idGoogle;

    @Column(name = "ENC_NOMBRE")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "ENC_CAMP_ID")
    private Campania campania;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdGoogle() {
        return idGoogle;
    }

    public void setIdGoogle(String idGoogle) {
        this.idGoogle = idGoogle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Campania getCampania() {
        return campania;
    }

    public void setCampania(Campania campania) {
        this.campania = campania;
    }
}
