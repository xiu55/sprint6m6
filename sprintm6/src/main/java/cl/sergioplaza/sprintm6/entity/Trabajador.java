package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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
    //Relacion trabajador - inst. prevision
    //@Column(name = "inst_prevision") | ESTO NO va xq se esta refiriendo abajo
    @ManyToOne(optional = false, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_inst_prevision")
    private InstitucionPrevision instPrevision;

    //Relacion trabajador - inst. salud
    //@Column(name = "inst_salud")
    @ManyToOne(optional = false, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_inst_salud") //referencia hacia FK
    private InstitucionSalud instSalud;

    @Column
    private long telefono;
    //Relacion trabajador - liquidacion
    @OneToMany(mappedBy = "trabajador")
    List<Liquidacion> liquidacionesTrabajador;
    //Relacion tabla INTERMEDIA
    @ManyToMany(mappedBy = "listaTrabajadores")
    private List<Trabajador> trabajadores;






    // muchos trabajdores a una prevision

    // @ManyToOne (optional = false, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    //@JoinColumn(name = "id_perfil",nullable = false)

}
