package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Institucion Salud")
public class InstitucionSalud {
    @Column(name = "id_inst_salud")
    private int idInstPrevision;
    @Column
    private String descripcion;
    @Column(name = "porc_dcto")
    private float porcDcto;
}
