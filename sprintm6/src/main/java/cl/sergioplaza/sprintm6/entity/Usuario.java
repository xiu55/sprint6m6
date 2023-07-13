package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity //Tiene su identidad en la BD > Asociado en bd
@Table( name = " Usuarios ")

public class Usuario {
    @Id
    @Column(name = "idUsuario")
    private int idUsuario;
    @Column
    private int run;
    @Column
    private String clave;
    @Column
    private String nombre;
    @Column (name = "apellido_1")
    private String apellido1;
    @Column (name = "apellido_2")
    private String apellido2;

    //relacion de perfil usuario-perfil
    @ManyToOne (optional = false, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_perfil",nullable = false)
    private Perfil perfil;
    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "idPerfil") //Enlanzando
    //@ManyToOne(fetch = FetchType.LAZY) //es el retorno del enlace, solo va eso OROIFINAL Mmany
    // @JoinColumn(name = "id_perfil") /OROGIANL
    //private int idPerfil; ORIGINAL
    @Column
    private String email;
    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
    @Column
    private long telefono;


    @OneToMany(mappedBy = "usuario")
    List<Empleador> listaEmpleador;



    //manytomany -  muchos a muchos, empleados
    //hacer relaciones faltantes en las otras clases

    //se deben sacar los colum si va join colum?
    //el join colum es para la clave foranera?

}
