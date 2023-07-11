package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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

}
