package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "institucion_prevision")

public class InstitucionPrevision {
    @Column(name = "id_inst_prevision")
    private int idInstPrevision;
    @Column
    private String descripcion;
    @Column(name = "porc_dcto")
    private float porcDcto;

    @OneToMany(mappedBy = "instPrevision") //nombre de parametro instanciado en entidad
    List<Trabajador> listaTrabajadoresPrev;

    @OneToMany(mappedBy = "idInstPrevision")
    List<Liquidacion> liquidacionPrevision;
}