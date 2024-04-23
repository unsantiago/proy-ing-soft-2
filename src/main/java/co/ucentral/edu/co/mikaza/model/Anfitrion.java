package co.ucentral.edu.co.mikaza.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ANFITRIONES")
public class Anfitrion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anfitrion_seq")
    @SequenceGenerator(name = "anfitrion_seq", sequenceName = "anfitrion_sequence", allocationSize = 1)
    @Column(name = "ID_ANFITRION", nullable = false, unique = true)
    private Long idAnfitrion;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "CALIFICACION", nullable = false)
    private BigDecimal calificacion;

    // Otros atributos y métodos si son necesarios
}

