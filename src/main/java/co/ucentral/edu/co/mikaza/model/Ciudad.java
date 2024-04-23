package co.ucentral.edu.co.mikaza.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CIUDADES")
public class Ciudad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciudad_seq")
    @SequenceGenerator(name = "ciudad_seq", sequenceName = "ciudad_sequence", allocationSize = 1)
    @Column(name = "ID_CIUDAD", nullable = false, unique = true)
    private Long idCiudad;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "CODIGO_POSTAL", nullable = false)
    private String codigoPostal;

}

