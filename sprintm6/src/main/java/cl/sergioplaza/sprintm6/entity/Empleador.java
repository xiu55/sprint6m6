package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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
    @Column (name = "id_usuario")
    private int idUsuario;
    @Column
    private long telefono;
}
