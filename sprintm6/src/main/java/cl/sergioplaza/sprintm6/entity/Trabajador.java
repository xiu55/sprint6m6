package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trabajadores") //esto debe ir en minuscula o mayus?
public class Trabajador {
    @Id
    @Column(name = "id_trabajador")
    private int idTrabajador;
    @Column
    private int run;
    @Column
    private String nombre;
    @Column (name = "apellido_1")
    private String apellido1;
    @Column (name = "apellido_2")
    private String apellido2;
    @Column
    private String email;
    @Column(name = "inst_prevision")
    private int instPrevision;
    @Column(name = "inst_salud")
    private int instSalud;
    @Column
    private long telefono;

}
