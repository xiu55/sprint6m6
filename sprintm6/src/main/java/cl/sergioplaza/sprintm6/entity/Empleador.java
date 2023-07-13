package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;

import java.util.List;

@Data
@Entity
@Table(name = "empleadores")

public class Empleador {
    @Id
    @Column(name = "id_empleador")
    private int idEmpleador;
    @Column
    private int run;
    @Column
    private String nombre;
    @Column (name = "apellido_1")
    private String apellido1;
    @Column (name = "apellido_2")
    private String apellido2;
    @Column
    private String direccion;
    @Column
    private String email;
    //Relacion usuario
    //@Column (name = "id_usuario")
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario",nullable = false) //nombre hace refeceneria a la tabla que es FK
    //private int idUsuario;
    private Usuario usuario;

    @Column
    private long telefono;
    //Relacion tabla intermedia
    @ManyToMany
    @JoinTable(name = "empl_trab",
            joinColumns = @JoinColumn(name = "id_empleador", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_trabajador", nullable = false))
    private List<Empleador> empledores;



}
