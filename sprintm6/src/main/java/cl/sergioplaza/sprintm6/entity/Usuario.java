package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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
    @Column (name = "id_perfil")
    private int idPerfil;
    @Column
    private String email;
    @Column(name = "fecha_creacion")
    private String fechaCreacion;
    @Column
    private long telefono;




}
