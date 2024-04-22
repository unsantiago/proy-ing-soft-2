package co.ucentral.edu.co.mikaza.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Inmueble")
@Table(name="INMUEBLES")
public class Inmueble implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inmueble_seq")
    @SequenceGenerator(name = "inmueble_seq", sequenceName = "inmueble_sequence", allocationSize = 1)
    @Column(name= "ID_INMUEBLE", nullable = false, unique = true)
    private long idInmueble;

    @Column(name= "IMAGENES")
    @ElementCollection
    private List<String> imagenes;

    @Column(name= "DIRECCION", nullable = false)
    private String direccion;

    @Column(name= "PRECIO_NOCHE", nullable = false)
    private float precioNoche;

    @Column(name= "NRO_HABS", nullable = false)
    private int nroHabitaciones;

    @Column(name= "CAP_MAX", nullable = false)
    private int capacidad_Max;

    @Column(name= "SERV_ADIC", nullable = false)
    private List<String> serviciosAdicionales;

    @Column(name= "ID_CIUDAD", nullable = false)
    private long idCiudad;

    @Column(name= "ID_ANFITRION", nullable = false)
    private long idAnfitrion;
}

