package cl.sergioplaza.sprintm6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data @Entity @Table(name = "Liquidaciones")
public class Liquidacion {
    @Id
    @Column(name = "id_liquidacion")
    private long idLiquidacion;
    @Column(name = "id_trabajador")
    private int idTrabajador;
    @Column
    private String periodo; //es DATE , cambiar a int ? fecha?
    @Column(name = "sueldo_imponible")
    private int sueldoImponible;
    @Column(name = "sueldo_liquido")
    private int sueldoLiquido;
    @Column(name = "id_inst_salud")
    private int idInstSalud;
    @Column(name = "monto_inst_salud")
    private int montoInstSalud;
    @Column(name = "id_inst_prevsional")
    private int idInstPrevisional;
    @Column(name = "monto_inst_previsional")
    private int montoInstPrevisional;
    @Column(name = "total_descuento")
    private int totalDescuento;
    @Column(name = "total_haberes")
    private int totalHaberes;
    @Column
    private int anticipo;
}
