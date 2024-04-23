package co.ucentral.edu.co.mikaza;

import co.ucentral.edu.co.mikaza.model.Anfitrion;
import co.ucentral.edu.co.mikaza.model.Ciudad;
import co.ucentral.edu.co.mikaza.model.Inmueble;
import co.ucentral.edu.co.mikaza.repository.AnfitrionRepository;
import co.ucentral.edu.co.mikaza.repository.CiudadRepository;
import co.ucentral.edu.co.mikaza.repository.InmuebleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MikazaApplication implements CommandLineRunner {

	private InmuebleRepository inmuebleRepository;
	private AnfitrionRepository anfitrionRepository;
	private CiudadRepository ciudadRepository;

	public static void main(String[] args) {
		SpringApplication.run(MikazaApplication.class, args);
	}

	// Inicialización de ciudades, anfitriones e inmuebles: Carga de datos
	@Override
	public void run(String... args) throws Exception{

		if (ciudadRepository.count() == 0 && anfitrionRepository.count() == 0 && inmuebleRepository.count() == 0){



			//Ciudades
			Ciudad ciudadBogota = new Ciudad(null, "Bogotá", "11001");
			ciudadRepository.save(ciudadBogota);

			Ciudad ciudadMedellin = new Ciudad(null, "Medellín", "05001");
			ciudadRepository.save(ciudadMedellin);

			Ciudad ciudadCali = new Ciudad(null, "Cali", "76001");
			ciudadRepository.save(ciudadCali);

			Ciudad ciudadCartagena = new Ciudad(null, "Cartagena", "13001");
			ciudadRepository.save(ciudadCartagena);

			Ciudad ciudadSantaMarta = new Ciudad(null, "Santa Marta", "47001");
			ciudadRepository.save(ciudadSantaMarta);



			//Anfitriones
			Anfitrion anfitrion1 = new Anfitrion(null, "Santiago Prieto", BigDecimal.valueOf(4.9));
			anfitrionRepository.save(anfitrion1);

			Anfitrion anfitrion2 = new Anfitrion(null, "Andrea Ramirez", BigDecimal.valueOf(4.2));
			anfitrionRepository.save(anfitrion2);

			Anfitrion anfitrion3 = new Anfitrion(null, "Alejandro Rodriguez", BigDecimal.valueOf(4.7));
			anfitrionRepository.save(anfitrion3);

			Anfitrion anfitrion4 = new Anfitrion(null, "Marcela Gomez", BigDecimal.valueOf(4.9));
			anfitrionRepository.save(anfitrion4);

			Anfitrion anfitrion5 = new Anfitrion(null, "Daniel Herrera", BigDecimal.valueOf(4.3));
			anfitrionRepository.save(anfitrion5);

			Anfitrion anfitrion6 = new Anfitrion(null, "Laura Martinez", BigDecimal.valueOf(4.8));
			anfitrionRepository.save(anfitrion6);

			Anfitrion anfitrion7 = new Anfitrion(null, "Jorge Lopez", BigDecimal.valueOf(4.6));
			anfitrionRepository.save(anfitrion7);

			Anfitrion anfitrion8 = new Anfitrion(null, "Carolina Sanchez", BigDecimal.valueOf(4.4));
			anfitrionRepository.save(anfitrion8);

			Anfitrion anfitrion9 = new Anfitrion(null, "Fernando Diaz", BigDecimal.valueOf(4.1));
			anfitrionRepository.save(anfitrion9);

			Anfitrion anfitrion10 = new Anfitrion(null, "Gabriela Vargas", BigDecimal.valueOf(4.6));
			anfitrionRepository.save(anfitrion10);



			// Inmuebles
			/* --------------------------------  INMUEBLE 1 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 93A #11A-41") == null) {
				List<String> imagenesInmueble1 = Arrays.asList(
						"uploads/inmueble1/img1.webp",
						"uploads/inmueble1/img2.webp",
						"uploads/inmueble1/img3.webp",
						"uploads/inmueble1/img4.webp",
						"uploads/inmueble1/img5.webp",
						"uploads/inmueble1/img6.webp",
						"uploads/inmueble1/img7.webp"
				);
				Inmueble inmueble1 = new Inmueble(
						null,
						"Acogedor loft con terraza en 93 Park con wifi rápido",
						"Loft",
						"Disfruta de una estadía única en nuestro acogedor loft ubicado en el corazón de 93 Park. La terraza privada te ofrece un espacio tranquilo para relajarte y disfrutar de vistas panorámicas. Equipado con todas las comodidades modernas, incluido wifi rápido, este loft es ideal para parejas o viajeros solitarios que buscan una experiencia cómoda y conveniente.",
						imagenesInmueble1,
						"Cra. 93A #11A-41",
						179550f,
						1,
						2,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina",
								"Estacionamiento",
								"TV",
								"Patio o balcón privado",
								"Refrigerador",
								"Secadora de pelo",
								"Cámaras de seguridad en la parte exterior de la propiedad",
								"Mesa de billar",
								"Conexión Ethernet",
								"Microondas",
								"Licuadora"
						),
						ciudadBogota.getIdCiudad(),
						anfitrion1.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble1);
			}

			/* --------------------------------  INMUEBLE 2 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 15 #85-34") == null) {
				List<String> imagenesInmueble2 = Arrays.asList(
						"uploads/inmueble2/img1.webp",
						"uploads/inmueble2/img2.webp",
						"uploads/inmueble2/img3.webp",
						"uploads/inmueble2/img4.webp",
						"uploads/inmueble2/img5.webp",
						"uploads/inmueble2/img6.webp",
						"uploads/inmueble2/img7.webp",
						"uploads/inmueble2/img8.webp",
						"uploads/inmueble2/img9.webp",
						"uploads/inmueble2/img10.webp"
				);
				Inmueble inmueble2 = new Inmueble(
						null,
						"Apartamento moderno cerca a la Zona T con vista panorámica",
						"Apartamento",
						"Disfruta de la vida urbana en este moderno apartamento situado cerca de la famosa Zona T de Bogotá. Con una vista panorámica impresionante, este apartamento ofrece comodidades de primera clase y una ubicación conveniente. Equipado con una cocina completa, wifi y TV por cable, este apartamento es perfecto para familias o grupos pequeños que buscan explorar la ciudad.",
						imagenesInmueble2,
						"Cra. 15 #85-34",
						250000f,
						2,
						4,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"Estacionamiento",
								"TV por cable",
								"Lavadora y secadora"
						),
						ciudadBogota.getIdCiudad(),
						anfitrion1.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble2);
			}

			/* --------------------------------  INMUEBLE 3 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Calle 74 #10-33") == null) {
				List<String> imagenesInmueble3 = Arrays.asList(
						"uploads/inmueble3/img1.webp",
						"uploads/inmueble3/img2.webp",
						"uploads/inmueble3/img3.webp",
						"uploads/inmueble3/img4.webp",
						"uploads/inmueble3/img5.webp",
						"uploads/inmueble3/img6.webp",
						"uploads/inmueble3/img7.webp",
						"uploads/inmueble3/img8.webp",
						"uploads/inmueble3/img9.webp",
						"uploads/inmueble3/img10.webp"
				);
				Inmueble inmueble3 = new Inmueble(
						null,
						"Apartamento elegante en la zona de Chapinero con excelente ubicación",
						"Apartamento",
						"Descubre la elegancia y la comodidad en este apartamento situado en la vibrante zona de Chapinero en Bogotá. Con una excelente ubicación, este apartamento ofrece fácil acceso a restaurantes, tiendas y lugares de interés. Disfruta de las comodidades modernas, como wifi, TV por cable, gimnasio, piscina, jacuzzi y calefacción, para una estancia inolvidable en la ciudad.",
						imagenesInmueble3,
						"Calle 74 #10-33",
						210000f,
						3,
						6,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"Estacionamiento",
								"TV por cable",
								"Lavadora y secadora",
								"Gimnasio",
								"Piscina",
								"Jacuzzi",
								"Calefacción"
						),
						ciudadBogota.getIdCiudad(),
						anfitrion1.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble3);
			}

			/* --------------------------------  INMUEBLE 4 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 70 #45-90") == null) {
				List<String> imagenesInmueble4 = Arrays.asList(
						"uploads/inmueble4/img1.webp",
						"uploads/inmueble4/img2.webp",
						"uploads/inmueble4/img3.webp",
						"uploads/inmueble4/img4.webp",
						"uploads/inmueble4/img5.webp",
						"uploads/inmueble4/img6.webp",
						"uploads/inmueble4/img7.webp",
						"uploads/inmueble4/img8.webp",
						"uploads/inmueble4/img9.webp",
						"uploads/inmueble4/img10.webp"
				);
				Inmueble inmueble4 = new Inmueble(
						null,
						"Casa campestre con piscina y zona BBQ en el sector de El Poblado",
						"Casa",
						"Disfruta de la vida campestre en esta hermosa casa ubicada en el sector de El Poblado en Medellín. Con una amplia piscina, zona BBQ, jardín y todas las comodidades modernas, esta casa es perfecta para familias o grupos que buscan una escapada tranquila. Además, cuenta con wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable, calefacción y chimenea para garantizar una estancia cómoda y acogedora.",
						imagenesInmueble4,
						"Cra. 70 #45-90",
						350000f,
						4,
						10,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"Estacionamiento",
								"TV por cable",
								"Piscina",
								"Zona BBQ",
								"Jardín",
								"Calefacción",
								"Chimenea"
						),
						ciudadMedellin.getIdCiudad(),
						anfitrion2.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble4);
			}

			/* --------------------------------  INMUEBLE 5 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 55 #78-23") == null) {
				List<String> imagenesInmueble5 = Arrays.asList(
						"uploads/inmueble5/img1.webp",
						"uploads/inmueble5/img2.webp",
						"uploads/inmueble5/img3.webp",
						"uploads/inmueble5/img4.webp",
						"uploads/inmueble5/img5.webp",
						"uploads/inmueble5/img6.webp",
						"uploads/inmueble5/img7.webp",
						"uploads/inmueble5/img8.webp",
						"uploads/inmueble5/img9.webp",
						"uploads/inmueble5/img10.webp"
				);
				Inmueble inmueble5 = new Inmueble(
						null,
						"Apartamento moderno en Envigado con vista panorámica",
						"Apartamento",
						"Disfruta de la comodidad y la vista panorámica en este moderno apartamento ubicado en Envigado, Medellín. Con todas las comodidades necesarias, incluyendo wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable y lavadora y secadora, este apartamento es perfecto para una estancia cómoda y placentera. Además, su ubicación estratégica te permite acceder fácilmente a todas las atracciones de la zona.",
						imagenesInmueble5,
						"Cra. 55 #78-23",
						185000f,
						2,
						4,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"Estacionamiento",
								"TV por cable",
								"Lavadora y secadora"
						),
						ciudadMedellin.getIdCiudad(),
						anfitrion2.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble5);
			}

			/* --------------------------------  INMUEBLE 6 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 45 #65-21") == null) {
				List<String> imagenesInmueble6 = Arrays.asList(
						"uploads/inmueble6/img1.webp",
						"uploads/inmueble6/img2.webp",
						"uploads/inmueble6/img3.webp",
						"uploads/inmueble6/img4.webp",
						"uploads/inmueble6/img5.webp",
						"uploads/inmueble6/img6.webp",
						"uploads/inmueble6/img7.webp",
						"uploads/inmueble6/img8.webp",
						"uploads/inmueble6/img9.webp",
						"uploads/inmueble6/img10.webp"
				);
				Inmueble inmueble6 = new Inmueble(
						null,
						"Hermosa finca en Sabaneta con piscina y amplias zonas verdes",
						"Finca",
						"Descubre la tranquilidad y belleza natural de esta hermosa finca ubicada en Sabaneta, Medellín. Con una piscina privada y amplias zonas verdes, esta finca es perfecta para quienes buscan relajarse y disfrutar de la naturaleza. Además, cuenta con comodidades como wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable y entretenimiento como una cancha de fútbol, mesa de billar y ping pong. ¡Ven y disfruta de unas vacaciones inolvidables!",
						imagenesInmueble6,
						"Cra. 45 #65-21",
						450000f,
						5,
						15,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"Estacionamiento",
								"TV por cable",
								"Piscina",
								"Zonas verdes",
								"Cancha de fútbol",
								"Billar",
								"Ping pong"
						),
						ciudadMedellin.getIdCiudad(),
						anfitrion3.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble6);
			}

			/* --------------------------------  INMUEBLE 7 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 82 #34-12") == null) {
				List<String> imagenesInmueble7 = Arrays.asList(
						"uploads/inmueble7/img1.webp",
						"uploads/inmueble7/img2.webp",
						"uploads/inmueble7/img3.webp",
						"uploads/inmueble7/img4.webp",
						"uploads/inmueble7/img5.webp",
						"uploads/inmueble7/img6.webp",
						"uploads/inmueble7/img7.webp",
						"uploads/inmueble7/img8.webp",
						"uploads/inmueble7/img9.webp",
						"uploads/inmueble7/img10.webp"
				);
				Inmueble inmueble7 = new Inmueble(
						null,
						"Apartamento de lujo en El Poblado con vista a la ciudad",
						"Apartamento",
						"Descubre el lujo y la comodidad en este exclusivo apartamento ubicado en El Poblado, Medellín. Con impresionantes vistas a la ciudad, este apartamento ofrece wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable y acceso a un gimnasio, piscina, sauna, jacuzzi y calefacción. Disfruta de una estadía de ensueño en uno de los barrios más exclusivos de la ciudad.",
						imagenesInmueble7,
						"Cra. 82 #34-12",
						320000f,
						3,
						6,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"Estacionamiento",
								"TV por cable",
								"Gimnasio",
								"Piscina",
								"Sauna",
								"Jacuzzi",
								"Calefacción"
						),
						ciudadMedellin.getIdCiudad(),
						anfitrion4.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble7);
			}

			/* --------------------------------  INMUEBLE 8 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 35 #78-45") == null) {
				List<String> imagenesInmueble8 = Arrays.asList(
						"uploads/inmueble8/img1.webp",
						"uploads/inmueble8/img2.webp",
						"uploads/inmueble8/img3.webp",
						"uploads/inmueble8/img4.webp",
						"uploads/inmueble8/img5.webp",
						"uploads/inmueble8/img6.webp",
						"uploads/inmueble8/img7.webp",
						"uploads/inmueble8/img8.webp",
						"uploads/inmueble8/img9.webp",
						"uploads/inmueble8/img10.webp"
				);
				Inmueble inmueble8 = new Inmueble(
						null,
						"Casa amplia en Belén con jardín y zona BBQ",
						"Casa",
						"Disfruta de una estancia confortable en esta espaciosa casa ubicada en Belén, Medellín. Con un amplio jardín y zona BBQ, esta casa es perfecta para relajarse y disfrutar con familiares y amigos. Además, cuenta con wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable, chimenea, sala de juegos y calefacción. ¡Haz de tu visita a Medellín una experiencia inolvidable en esta encantadora casa!",
						imagenesInmueble8,
						"Cra. 35 #78-45",
						400000f,
						4,
						10,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"Estacionamiento",
								"TV por cable",
								"Jardín",
								"Zona BBQ",
								"Chimenea",
								"Sala de juegos",
								"Calefacción"
						),
						ciudadMedellin.getIdCiudad(),
						anfitrion4.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble8);
			}

			/* --------------------------------  INMUEBLE 9 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 70 #5-23") == null) {
				List<String> imagenesInmueble9 = Arrays.asList(
						"uploads/inmueble9/img1.webp",
						"uploads/inmueble9/img2.webp",
						"uploads/inmueble9/img3.webp",
						"uploads/inmueble9/img4.webp",
						"uploads/inmueble9/img5.webp",
						"uploads/inmueble9/img6.webp",
						"uploads/inmueble9/img7.webp",
						"uploads/inmueble9/img8.webp",
						"uploads/inmueble9/img9.webp",
						"uploads/inmueble9/img10.webp"
				);
				Inmueble inmueble9 = new Inmueble(
						null,
						"Apartamento en el barrio San Fernando con terraza y vista panorámica",
						"Apartamento",
						"Descubre la comodidad y elegancia en este apartamento ubicado en el barrio San Fernando de Cali. Disfruta de una terraza con vista panorámica, ideal para relajarte y contemplar la ciudad. El apartamento cuenta con wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable, gimnasio, piscina, sauna, jacuzzi y calefacción. ¡Haz de tu estancia en Cali una experiencia inolvidable en este encantador apartamento!",
						imagenesInmueble9,
						"Cra. 70 #5-23",
						280000f,
						3,
						6,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"Estacionamiento",
								"TV por cable",
								"Gimnasio",
								"Piscina",
								"Sauna",
								"Jacuzzi",
								"Calefacción"
						),
						ciudadCali.getIdCiudad(),
						anfitrion4.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble9);
			}

			/* --------------------------------  INMUEBLE 10 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Calle 5 #66-12") == null) {
				List<String> imagenesInmueble10 = Arrays.asList(
						"uploads/inmueble10/img1.webp",
						"uploads/inmueble10/img2.webp",
						"uploads/inmueble10/img3.webp",
						"uploads/inmueble10/img4.webp",
						"uploads/inmueble10/img5.webp",
						"uploads/inmueble10/img6.webp",
						"uploads/inmueble10/img7.webp",
						"uploads/inmueble10/img8.webp",
						"uploads/inmueble10/img9.webp",
						"uploads/inmueble10/img10.webp"
				);
				Inmueble inmueble10 = new Inmueble(
						null,
						"Casa campestre en Pance con piscina y zona BBQ",
						"Casa",
						"Descubre el encanto de esta casa campestre en Pance, Cali. Disfruta de una amplia piscina, zona BBQ, jardín y terraza con vista panorámica. La casa cuenta con wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable y chimenea. ¡Ven y vive una experiencia única en esta maravillosa casa campestre!",
						imagenesInmueble10,
						"Calle 5 #66-12",
						550000f,
						5,
						12,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"Estacionamiento",
								"TV por cable",
								"Piscina",
								"Zona BBQ",
								"Jardín",
								"Terraza",
								"Chimenea"
						),
						ciudadCali.getIdCiudad(),
						anfitrion5.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble10);
			}

			/* --------------------------------  INMUEBLE 11 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 10 #25-58") == null) {
				List<String> imagenesInmueble11 = Arrays.asList(
						"uploads/inmueble11/img1.webp",
						"uploads/inmueble11/img2.webp",
						"uploads/inmueble11/img3.webp",
						"uploads/inmueble11/img4.webp",
						"uploads/inmueble11/img5.webp",
						"uploads/inmueble11/img6.webp",
						"uploads/inmueble11/img7.webp",
						"uploads/inmueble11/img8.webp",
						"uploads/inmueble11/img9.webp",
						"uploads/inmueble11/img10.webp"
				);
				Inmueble inmueble11 = new Inmueble(
						null,
						"Hermosa casa colonial en el centro histórico de Cartagena",
						"Casa",
						"Descubre la elegancia y el encanto de esta casa colonial en el corazón del centro histórico de Cartagena. Con una ubicación privilegiada, esta casa ofrece una experiencia única con su arquitectura tradicional y modernas comodidades. Disfruta de wifi, aire acondicionado, cocina completa, TV por cable, patio, terraza, piscina, jacuzzi, vista al mar y servicio de limpieza. ¡Ven y sumérgete en la historia y la belleza de Cartagena desde esta increíble casa colonial!",
						imagenesInmueble11,
						"Cra. 10 #25-58",
						480000f,
						4,
						8,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Patio",
								"Terraza",
								"Piscina",
								"Jacuzzi",
								"Vista al mar",
								"Servicio de limpieza"
						),
						ciudadCartagena.getIdCiudad(),
						anfitrion1.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble11);
			}

			/* --------------------------------  INMUEBLE 12 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 4 #36-76") == null) {
				List<String> imagenesInmueble12 = Arrays.asList(
						"uploads/inmueble12/img1.webp",
						"uploads/inmueble12/img2.webp",
						"uploads/inmueble12/img3.webp",
						"uploads/inmueble12/img4.webp",
						"uploads/inmueble12/img5.webp",
						"uploads/inmueble12/img6.webp",
						"uploads/inmueble12/img7.webp",
						"uploads/inmueble12/img8.webp",
						"uploads/inmueble12/img9.webp",
						"uploads/inmueble12/img10.webp"
				);
				Inmueble inmueble12 = new Inmueble(
						null,
						"Apartamento de lujo en Bocagrande con vista al mar",
						"Apartamento",
						"Descubre el lujo y la comodidad de este apartamento en Bocagrande con impresionantes vistas al mar. Este apartamento ofrece wifi, aire acondicionado, cocina completa, TV por cable, piscina, gimnasio, jacuzzi, terraza, servicio de limpieza y estacionamiento. Disfruta de una estancia inolvidable en uno de los destinos más exclusivos de Cartagena.",
						imagenesInmueble12,
						"Cra. 4 #36-76",
						620000f,
						3,
						6,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Piscina",
								"Gimnasio",
								"Jacuzzi",
								"Terraza",
								"Servicio de limpieza",
								"Estacionamiento"
						),
						ciudadCartagena.getIdCiudad(),
						anfitrion6.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble12);
			}

			/* --------------------------------  INMUEBLE 13 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 7 #25-48") == null) {
				List<String> imagenesInmueble13 = Arrays.asList(
						"uploads/inmueble13/img1.webp",
						"uploads/inmueble13/img2.webp",
						"uploads/inmueble13/img3.webp",
						"uploads/inmueble13/img4.webp",
						"uploads/inmueble13/img5.webp",
						"uploads/inmueble13/img6.webp",
						"uploads/inmueble13/img7.webp",
						"uploads/inmueble13/img8.webp",
						"uploads/inmueble13/img9.webp",
						"uploads/inmueble13/img10.webp"
				);
				Inmueble inmueble13 = new Inmueble(
						null,
						"Amplia casa colonial en Getsemaní con piscina privada",
						"Casa",
						"Disfruta de la elegancia y comodidad de esta amplia casa colonial en el encantador barrio Getsemaní. La casa cuenta con una piscina privada, wifi, aire acondicionado, cocina completa, TV por cable, terraza, jardín, vista al mar, servicio de limpieza y estacionamiento. Sumérgete en la cultura y la historia de Cartagena desde este acogedor y bien ubicado alojamiento.",
						imagenesInmueble13,
						"Cra. 7 #25-48",
						550000f,
						5,
						10,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Piscina privada",
								"Terraza",
								"Jardín",
								"Vista al mar",
								"Servicio de limpieza",
								"Estacionamiento"
						),
						ciudadCartagena.getIdCiudad(),
						anfitrion7.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble13);
			}


			/* --------------------------------  INMUEBLE 14 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 10 #30-25") == null) {
				List<String> imagenesInmueble14 = Arrays.asList(
						"uploads/inmueble14/img1.webp",
						"uploads/inmueble14/img2.webp",
						"uploads/inmueble14/img3.webp",
						"uploads/inmueble14/img4.webp",
						"uploads/inmueble14/img5.webp",
						"uploads/inmueble14/img6.webp",
						"uploads/inmueble14/img7.webp",
						"uploads/inmueble14/img8.webp",
						"uploads/inmueble14/img9.webp",
						"uploads/inmueble14/img10.webp"
				);
				Inmueble inmueble14 = new Inmueble(
						null,
						"Casa moderna con piscina en el barrio Manga",
						"Casa",
						"Descubre el encanto de esta casa moderna con piscina ubicada en el pintoresco barrio Manga de Cartagena. Disfruta de comodidades como wifi, aire acondicionado, cocina completa, TV por cable, terraza, jardín, estacionamiento, vista al mar y servicio de limpieza. Relájate y disfruta de unas vacaciones inolvidables en esta casa única.",
						imagenesInmueble14,
						"Cra. 10 #30-25",
						700000f,
						4,
						8,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Piscina",
								"Terraza",
								"Jardín",
								"Estacionamiento",
								"Vista al mar",
								"Servicio de limpieza"
						),
						ciudadCartagena.getIdCiudad(),
						anfitrion8.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble14);
			}

			/* --------------------------------  INMUEBLE 15 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 2 #22-16") == null) {
				List<String> imagenesInmueble15 = Arrays.asList(
						"uploads/inmueble15/img1.webp",
						"uploads/inmueble15/img2.webp",
						"uploads/inmueble15/img3.webp",
						"uploads/inmueble15/img4.webp",
						"uploads/inmueble15/img5.webp",
						"uploads/inmueble15/img6.webp",
						"uploads/inmueble15/img7.webp",
						"uploads/inmueble15/img8.webp",
						"uploads/inmueble15/img9.webp",
						"uploads/inmueble15/img10.webp"
				);
				Inmueble inmueble15 = new Inmueble(
						null,
						"Apartamento de playa en La Boquilla con acceso directo al mar",
						"Apartamento",
						"Disfruta de unas vacaciones inolvidables en este moderno apartamento de playa en La Boquilla, Cartagena. Con acceso directo al mar, esta propiedad ofrece wifi, aire acondicionado, cocina completa, TV por cable, piscina, terraza, jacuzzi, estacionamiento, vista al mar y servicio de limpieza. Relájate y disfruta del sol y la playa en este hermoso lugar.",
						imagenesInmueble15,
						"Cra. 2 #22-16",
						400000f,
						2,
						4,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Piscina",
								"Terraza",
								"Jacuzzi",
								"Estacionamiento",
								"Vista al mar",
								"Servicio de limpieza"
						),
						ciudadCartagena.getIdCiudad(),
						anfitrion9.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble15);
			}


			/* --------------------------------  INMUEBLE 16 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 4 #15-20") == null) {
				List<String> imagenesInmueble16 = Arrays.asList(
						"uploads/inmueble16/img1.webp",
						"uploads/inmueble16/img2.webp",
						"uploads/inmueble16/img3.webp",
						"uploads/inmueble16/img4.webp",
						"uploads/inmueble16/img5.webp",
						"uploads/inmueble16/img6.webp",
						"uploads/inmueble16/img7.webp",
						"uploads/inmueble16/img8.webp",
						"uploads/inmueble16/img9.webp",
						"uploads/inmueble16/img10.webp"
				);
				Inmueble inmueble16 = new Inmueble(
						null,
						"Casa frente al mar en el Rodadero con piscina y jacuzzi",
						"Casa",
						"Disfruta de unas vacaciones de lujo en esta espectacular casa frente al mar en el Rodadero, Santa Marta. Con piscina, jacuzzi, wifi, aire acondicionado, cocina completa, TV por cable, terraza, estacionamiento, vista al mar y servicio de limpieza, esta propiedad es ideal para relajarse y disfrutar de las hermosas vistas que ofrece.",
						imagenesInmueble16,
						"Cra. 4 #15-20",
						800000f,
						5,
						10,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Piscina",
								"Jacuzzi",
								"Terraza",
								"Estacionamiento",
								"Vista al mar",
								"Servicio de limpieza"
						),
						ciudadSantaMarta.getIdCiudad(),
						anfitrion9.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble16);
			}

			/* --------------------------------  INMUEBLE 17 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 7 #24-10") == null) {
				List<String> imagenesInmueble17 = Arrays.asList(
						"uploads/inmueble17/img1.webp",
						"uploads/inmueble17/img2.webp",
						"uploads/inmueble17/img3.webp",
						"uploads/inmueble17/img4.webp",
						"uploads/inmueble17/img5.webp",
						"uploads/inmueble17/img6.webp",
						"uploads/inmueble17/img7.webp",
						"uploads/inmueble17/img8.webp",
						"uploads/inmueble17/img9.webp",
						"uploads/inmueble17/img10.webp"
				);
				Inmueble inmueble17 = new Inmueble(
						null,
						"Apartamento con vista al mar en el centro histórico de Santa Marta",
						"Apartamento",
						"Disfruta de unas vacaciones inolvidables en este acogedor apartamento con vista al mar, ubicado en el centro histórico de Santa Marta. Con wifi, aire acondicionado, cocina completa, TV por cable, terraza y estacionamiento cercano, este apartamento es perfecto para parejas o familias pequeñas que deseen explorar la belleza de Santa Marta.",
						imagenesInmueble17,
						"Cra. 7 #24-10",
						350000f,
						2,
						4,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Terraza",
								"Estacionamiento cercano"
						),
						ciudadSantaMarta.getIdCiudad(),
						anfitrion6.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble17);
			}

			/* --------------------------------  INMUEBLE 18 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 3 #18-25") == null) {
				List<String> imagenesInmueble18 = Arrays.asList(
						"uploads/inmueble18/img1.webp",
						"uploads/inmueble18/img2.webp",
						"uploads/inmueble18/img3.webp",
						"uploads/inmueble18/img4.webp",
						"uploads/inmueble18/img5.webp",
						"uploads/inmueble18/img6.webp",
						"uploads/inmueble18/img7.webp",
						"uploads/inmueble18/img8.webp",
						"uploads/inmueble18/img9.webp",
						"uploads/inmueble18/img10.webp"
				);
				Inmueble inmueble18 = new Inmueble(
						null,
						"Casa con piscina en el Rodadero a solo 5 minutos de la playa",
						"Casa",
						"Disfruta de unas vacaciones relajantes en esta hermosa casa con piscina, ubicada en el Rodadero, a solo 5 minutos de la playa. Con wifi, aire acondicionado, cocina completa, TV por cable, terraza y estacionamiento, esta casa es perfecta para grupos grandes o familias que deseen disfrutar de la playa y la vida nocturna de Santa Marta.",
						imagenesInmueble18,
						"Cra. 3 #18-25",
						600000f,
						4,
						8,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Piscina",
								"Terraza",
								"Estacionamiento"
						),
						ciudadSantaMarta.getIdCiudad(),
						anfitrion7.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble18);
			}

			/* --------------------------------  INMUEBLE 19 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Calle 22 #9-18") == null) {
				List<String> imagenesInmueble19 = Arrays.asList(
						"uploads/inmueble19/img1.webp",
						"uploads/inmueble19/img2.webp",
						"uploads/inmueble19/img3.webp",
						"uploads/inmueble19/img4.webp",
						"uploads/inmueble19/img5.webp",
						"uploads/inmueble19/img6.webp",
						"uploads/inmueble19/img7.webp",
						"uploads/inmueble19/img8.webp",
						"uploads/inmueble19/img9.webp",
						"uploads/inmueble19/img10.webp"
				);
				Inmueble inmueble19 = new Inmueble(
						null,
						"Apartamento frente al mar en el Rodadero con balcón privado",
						"Apartamento",
						"Disfruta de unas vistas espectaculares al mar desde este hermoso apartamento en el Rodadero. Con un balcón privado, wifi, aire acondicionado, cocina completa, TV por cable y estacionamiento, este apartamento es ideal para parejas o familias pequeñas que deseen disfrutar de la playa y todas las comodidades de casa.",
						imagenesInmueble19,
						"Calle 22 #9-18",
						420000f,
						3,
						6,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Balcón privado",
								"Estacionamiento"
						),
						ciudadSantaMarta.getIdCiudad(),
						anfitrion10.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble19);
			}

			/* --------------------------------  INMUEBLE 20 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 1 #8-45") == null) {
				List<String> imagenesInmueble20 = Arrays.asList(
						"uploads/inmueble20/img1.webp",
						"uploads/inmueble20/img2.webp",
						"uploads/inmueble20/img3.webp",
						"uploads/inmueble20/img4.webp",
						"uploads/inmueble20/img5.webp",
						"uploads/inmueble20/img6.webp",
						"uploads/inmueble20/img7.webp",
						"uploads/inmueble20/img8.webp",
						"uploads/inmueble20/img9.webp",
						"uploads/inmueble20/img10.webp"
				);
				Inmueble inmueble20 = new Inmueble(
						null,
						"Apartamento moderno en el centro histórico con vista al mar",
						"Apartamento",
						"Disfruta de la vida urbana en este moderno apartamento en el centro histórico de Santa Marta. Con vistas al mar, wifi, aire acondicionado, cocina completa, TV por cable y estacionamiento cercano, este apartamento es perfecto para parejas o pequeñas familias que deseen explorar la ciudad y disfrutar de sus alrededores.",
						imagenesInmueble20,
						"Cra. 1 #8-45",
						320000f,
						2,
						4,
						Arrays.asList(
								"Wifi",
								"Aire acondicionado",
								"Cocina completa",
								"TV por cable",
								"Vista al mar",
								"Estacionamiento cercano"
						),
						ciudadSantaMarta.getIdCiudad(),
						anfitrion2.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble20);
			}

		}

	}

}
