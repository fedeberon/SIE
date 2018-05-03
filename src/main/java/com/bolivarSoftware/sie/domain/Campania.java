package com.bolivarSoftware.sie.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Damian Gallego on 26/4/2018.
 */
@Entity
@Table(name = "CAMPANIAS")
public class Campania {

    @Id
    @Column(name = "CAM_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "CAM_FECHA_INICIO")
    private Date fechaDeInicio;

    @Column(name = "CAM_FECHA_FIN")
    private Date fechaDeFin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(Date fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }


}
