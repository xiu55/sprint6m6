package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "institucion_salud")
public class InstitucionSalud {
    @Column(name = "id_inst_salud")
    private int idInstPrevision;
    @Column
    private String descripcion;
    @Column(name = "porc_dcto")
    private float porcDcto;

    @OneToMany(mappedBy = "instSalud")
    List<Trabajador> listaTrabajadoresSalud;
    //relacion inst. salud - liquidacion
    @OneToMany(mappedBy = "idInstSalud")
    List<Liquidacion> liquidacionSalud;


}
