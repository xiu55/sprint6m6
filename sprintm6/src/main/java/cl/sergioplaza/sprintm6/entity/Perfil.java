package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Perfiles")

public class Perfil {
    @Id
    @Column (name = "id_perfil") //Se infiere que es columna de la tabla perfiles
    private int idPerfil;
    @Column //Esto se debe colocar para indicar que es una columna
    private String descripcion;
    @Column
    private boolean estado;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "perfil") //Enlazando
    List<Usuario> usuarios;

}
