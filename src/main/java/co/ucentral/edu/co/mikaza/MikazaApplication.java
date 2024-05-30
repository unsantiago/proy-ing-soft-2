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
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan
public class MikazaApplication implements CommandLineRunner {

	private final InmuebleRepository inmuebleRepository;
	private final AnfitrionRepository anfitrionRepository;
	private final CiudadRepository ciudadRepository;

	public MikazaApplication(InmuebleRepository inmuebleRepository, AnfitrionRepository anfitrionRepository, CiudadRepository ciudadRepository) {
		this.inmuebleRepository = inmuebleRepository;
		this.anfitrionRepository = anfitrionRepository;
		this.ciudadRepository = ciudadRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MikazaApplication.class, args);
	}

	// Inicialización de ciudades, anfitriones e inmuebles: Carga de datos
	@Override
	public void run(String... args) throws Exception{

		// if (ciudadRepository.count() == 0 && anfitrionRepository.count() == 0 && inmuebleRepository.count() == 0){
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
				Inmueble inmueble1 = new Inmueble(
						null,
						"Acogedor loft con terraza en 93 Park",
						"Loft",
						"Disfruta de una estadía única en nuestro acogedor loft ubicado en el corazón de 93 Park. La terraza privada te ofrece un espacio tranquilo para relajarte y disfrutar de vistas panorámicas. Equipado con todas las comodidades modernas, incluido wifi rápido, este loft es ideal para parejas o viajeros solitarios que buscan una experiencia cómoda y conveniente.",
						"/assets/prop1.webp",
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
						"Bogotá",
						anfitrion6.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble1);
			}

			/* --------------------------------  INMUEBLE 2 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 15 #85-34") == null) {
				Inmueble inmueble2 = new Inmueble(
						null,
						"Apartamento moderno cerca a la Zona T con vista panorámica",
						"Apartamento",
						"Disfruta de la vida urbana en este moderno apartamento situado cerca de la famosa Zona T de Bogotá. Con una vista panorámica impresionante, este apartamento ofrece comodidades de primera clase y una ubicación conveniente. Equipado con una cocina completa, wifi y TV por cable, este apartamento es perfecto para familias o grupos pequeños que buscan explorar la ciudad.",
						"/assets/prop2.webp",
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
						"Bogotá",
						anfitrion1.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble2);
			}

			/* --------------------------------  INMUEBLE 3 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Calle 74 #10-33") == null) {
				Inmueble inmueble3 = new Inmueble(
						null,
						"Apartamento elegante en la zona de Chapinero con excelente ubicación",
						"Apartamento",
						"Descubre la elegancia y la comodidad en este apartamento situado en la vibrante zona de Chapinero en Bogotá. Con una excelente ubicación, este apartamento ofrece fácil acceso a restaurantes, tiendas y lugares de interés. Disfruta de las comodidades modernas, como wifi, TV por cable, gimnasio, piscina, jacuzzi y calefacción, para una estancia inolvidable en la ciudad.",
						"/assets/prop3.webp",
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
						"Bogotá",
						anfitrion1.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble3);
			}

			/* --------------------------------  INMUEBLE 4 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 70 #45-90") == null) {
				Inmueble inmueble4 = new Inmueble(
						null,
						"Casa campestre con piscina y zona BBQ en el sector de El Poblado",
						"Casa",
						"Disfruta de la vida campestre en esta hermosa casa ubicada en el sector de El Poblado en Medellín. Con una amplia piscina, zona BBQ, jardín y todas las comodidades modernas, esta casa es perfecta para familias o grupos que buscan una escapada tranquila. Además, cuenta con wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable, calefacción y chimenea para garantizar una estancia cómoda y acogedora.",
						"/assets/prop4.webp",
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
						"Medellín",
						anfitrion2.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble4);
			}

			/* --------------------------------  INMUEBLE 5 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 55 #78-23") == null) {
				Inmueble inmueble5 = new Inmueble(
						null,
						"Apartamento moderno en Envigado con vista panorámica",
						"Apartamento",
						"Disfruta de la comodidad y la vista panorámica en este moderno apartamento ubicado en Envigado, Medellín. Con todas las comodidades necesarias, incluyendo wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable y lavadora y secadora, este apartamento es perfecto para una estancia cómoda y placentera. Además, su ubicación estratégica te permite acceder fácilmente a todas las atracciones de la zona.",
						"/assets/prop5.webp",
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
						"Medellín",
						anfitrion2.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble5);
			}

			/* --------------------------------  INMUEBLE 6 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 45 #65-21") == null) {
				Inmueble inmueble6 = new Inmueble(
						null,
						"Hermosa finca en Sabaneta con piscina y amplias zonas verdes",
						"Finca",
						"Descubre la tranquilidad y belleza natural de esta hermosa finca ubicada en Sabaneta, Medellín. Con una piscina privada y amplias zonas verdes, esta finca es perfecta para quienes buscan relajarse y disfrutar de la naturaleza. Además, cuenta con comodidades como wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable y entretenimiento como una cancha de fútbol, mesa de billar y ping pong. ¡Ven y disfruta de unas vacaciones inolvidables!",
						"/assets/prop6.webp",
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
						"Medellín",
						anfitrion3.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble6);
			}

			/* --------------------------------  INMUEBLE 7 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 82 #34-12") == null) {
				Inmueble inmueble7 = new Inmueble(
						null,
						"Apartamento de lujo en El Poblado con vista a la ciudad",
						"Apartamento",
						"Descubre el lujo y la comodidad en este exclusivo apartamento ubicado en El Poblado, Medellín. Con impresionantes vistas a la ciudad, este apartamento ofrece wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable y acceso a un gimnasio, piscina, sauna, jacuzzi y calefacción. Disfruta de una estadía de ensueño en uno de los barrios más exclusivos de la ciudad.",
						"/assets/prop7.webp",
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
						"Medellín",
						anfitrion4.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble7);
			}

			/* --------------------------------  INMUEBLE 8 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 35 #78-45") == null) {
				Inmueble inmueble8 = new Inmueble(
						null,
						"Casa amplia en Belén con jardín y zona BBQ",
						"Casa",
						"Disfruta de una estancia confortable en esta espaciosa casa ubicada en Belén, Medellín. Con un amplio jardín y zona BBQ, esta casa es perfecta para relajarse y disfrutar con familiares y amigos. Además, cuenta con wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable, chimenea, sala de juegos y calefacción. ¡Haz de tu visita a Medellín una experiencia inolvidable en esta encantadora casa!",
						"/assets/prop8.webp",
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
						"Medellín",
						anfitrion4.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble8);
			}

			/* --------------------------------  INMUEBLE 9 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 70 #5-23") == null) {
				Inmueble inmueble9 = new Inmueble(
						null,
						"Apartamento en el barrio San Fernando con terraza y vista panorámica",
						"Apartamento",
						"Descubre la comodidad y elegancia en este apartamento ubicado en el barrio San Fernando de Cali. Disfruta de una terraza con vista panorámica, ideal para relajarte y contemplar la ciudad. El apartamento cuenta con wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable, gimnasio, piscina, sauna, jacuzzi y calefacción. ¡Haz de tu estancia en Cali una experiencia inolvidable en este encantador apartamento!",
						"/assets/prop9.webp",
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
						"Cali",
						anfitrion4.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble9);
			}

			/* --------------------------------  INMUEBLE 10 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Calle 5 #66-12") == null) {
				Inmueble inmueble10 = new Inmueble(
						null,
						"Casa campestre en Pance con piscina y zona BBQ",
						"Casa",
						"Descubre el encanto de esta casa campestre en Pance, Cali. Disfruta de una amplia piscina, zona BBQ, jardín y terraza con vista panorámica. La casa cuenta con wifi, aire acondicionado, cocina completa, estacionamiento, TV por cable y chimenea. ¡Ven y vive una experiencia única en esta maravillosa casa campestre!",
						"/assets/prop10.webp",
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
						"Cali",
						anfitrion5.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble10);
			}

			/* --------------------------------  INMUEBLE 11 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 10 #25-58") == null) {
				Inmueble inmueble11 = new Inmueble(
						null,
						"Hermosa casa colonial en el centro histórico de Cartagena",
						"Casa",
						"Descubre la elegancia y el encanto de esta casa colonial en el corazón del centro histórico de Cartagena. Con una ubicación privilegiada, esta casa ofrece una experiencia única con su arquitectura tradicional y modernas comodidades. Disfruta de wifi, aire acondicionado, cocina completa, TV por cable, patio, terraza, piscina, jacuzzi, vista al mar y servicio de limpieza. ¡Ven y sumérgete en la historia y la belleza de Cartagena desde esta increíble casa colonial!",
						"/assets/prop11.webp",
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
						"Cartagena",
						anfitrion1.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble11);
			}

			/* --------------------------------  INMUEBLE 12 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 4 #36-76") == null) {
				Inmueble inmueble12 = new Inmueble(
						null,
						"Apartamento de lujo en Bocagrande con vista al mar",
						"Apartamento",
						"Descubre el lujo y la comodidad de este apartamento en Bocagrande con impresionantes vistas al mar. Este apartamento ofrece wifi, aire acondicionado, cocina completa, TV por cable, piscina, gimnasio, jacuzzi, terraza, servicio de limpieza y estacionamiento. Disfruta de una estancia inolvidable en uno de los destinos más exclusivos de Cartagena.",
						"/assets/prop12.webp",
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
						"Cartagena",
						anfitrion6.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble12);
			}

			/* --------------------------------  INMUEBLE 13 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 7 #25-48") == null) {
				Inmueble inmueble13 = new Inmueble(
						null,
						"Amplia casa colonial en Getsemaní con piscina privada",
						"Casa",
						"Disfruta de la elegancia y comodidad de esta amplia casa colonial en el encantador barrio Getsemaní. La casa cuenta con una piscina privada, wifi, aire acondicionado, cocina completa, TV por cable, terraza, jardín, vista al mar, servicio de limpieza y estacionamiento. Sumérgete en la cultura y la historia de Cartagena desde este acogedor y bien ubicado alojamiento.",
						"/assets/prop13.webp",
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
						"Cartagena",
						anfitrion7.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble13);
			}


			/* --------------------------------  INMUEBLE 14 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 10 #30-25") == null) {
				Inmueble inmueble14 = new Inmueble(
						null,
						"Casa moderna con piscina en el barrio Manga",
						"Casa",
						"Descubre el encanto de esta casa moderna con piscina ubicada en el pintoresco barrio Manga de Cartagena. Disfruta de comodidades como wifi, aire acondicionado, cocina completa, TV por cable, terraza, jardín, estacionamiento, vista al mar y servicio de limpieza. Relájate y disfruta de unas vacaciones inolvidables en esta casa única.",
						"/assets/prop14.webp",
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
						"Cartagena",
						anfitrion8.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble14);
			}

			/* --------------------------------  INMUEBLE 15 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 2 #22-16") == null) {
				Inmueble inmueble15 = new Inmueble(
						null,
						"Apartamento de playa en La Boquilla con acceso directo al mar",
						"Apartamento",
						"Disfruta de unas vacaciones inolvidables en este moderno apartamento de playa en La Boquilla, Cartagena. Con acceso directo al mar, esta propiedad ofrece wifi, aire acondicionado, cocina completa, TV por cable, piscina, terraza, jacuzzi, estacionamiento, vista al mar y servicio de limpieza. Relájate y disfruta del sol y la playa en este hermoso lugar.",
						"/assets/prop15.webp",
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
						"Cartagena",
						anfitrion9.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble15);
			}


			/* --------------------------------  INMUEBLE 16 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 4 #15-20") == null) {
				Inmueble inmueble16 = new Inmueble(
						null,
						"Casa frente al mar en el Rodadero con piscina y jacuzzi",
						"Casa",
						"Disfruta de unas vacaciones de lujo en esta espectacular casa frente al mar en el Rodadero, Santa Marta. Con piscina, jacuzzi, wifi, aire acondicionado, cocina completa, TV por cable, terraza, estacionamiento, vista al mar y servicio de limpieza, esta propiedad es ideal para relajarse y disfrutar de las hermosas vistas que ofrece.",
						"/assets/prop16.webp",
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
						"Santa Marta",
						anfitrion9.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble16);
			}

			/* --------------------------------  INMUEBLE 17 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 7 #24-10") == null) {
				Inmueble inmueble17 = new Inmueble(
						null,
						"Apartamento con vista al mar en el centro histórico de Santa Marta",
						"Apartamento",
						"Disfruta de unas vacaciones inolvidables en este acogedor apartamento con vista al mar, ubicado en el centro histórico de Santa Marta. Con wifi, aire acondicionado, cocina completa, TV por cable, terraza y estacionamiento cercano, este apartamento es perfecto para parejas o familias pequeñas que deseen explorar la belleza de Santa Marta.",
						"/assets/prop17.webp",
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
						"Santa Marta",
						anfitrion6.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble17);
			}

			/* --------------------------------  INMUEBLE 18 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 3 #18-25") == null) {
				Inmueble inmueble18 = new Inmueble(
						null,
						"Casa con piscina en el Rodadero a solo 5 minutos de la playa",
						"Casa",
						"Disfruta de unas vacaciones relajantes en esta hermosa casa con piscina, ubicada en el Rodadero, a solo 5 minutos de la playa. Con wifi, aire acondicionado, cocina completa, TV por cable, terraza y estacionamiento, esta casa es perfecta para grupos grandes o familias que deseen disfrutar de la playa y la vida nocturna de Santa Marta.",
						"/assets/prop18.webp",
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
						"Santa Marta",
						anfitrion7.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble18);
			}

			/* --------------------------------  INMUEBLE 19 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Calle 22 #9-18") == null) {
				Inmueble inmueble19 = new Inmueble(
						null,
						"Apartamento frente al mar en el Rodadero con balcón privado",
						"Apartamento",
						"Disfruta de unas vistas espectaculares al mar desde este hermoso apartamento en el Rodadero. Con un balcón privado, wifi, aire acondicionado, cocina completa, TV por cable y estacionamiento, este apartamento es ideal para parejas o familias pequeñas que deseen disfrutar de la playa y todas las comodidades de casa.",
						"/assets/prop19.webp",
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
						"Santa Marta",
						anfitrion10.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble19);
			}

			/* --------------------------------  INMUEBLE 20 -------------------------------- */
			if (inmuebleRepository.findByDireccion("Cra. 1 #8-45") == null) {
				Inmueble inmueble20 = new Inmueble(
						null,
						"Apartamento moderno en el centro histórico con vista al mar",
						"Apartamento",
						"Disfruta de la vida urbana en este moderno apartamento en el centro histórico de Santa Marta. Con vistas al mar, wifi, aire acondicionado, cocina completa, TV por cable y estacionamiento cercano, este apartamento es perfecto para parejas o pequeñas familias que deseen explorar la ciudad y disfrutar de sus alrededores.",
						"/assets/prop20.webp",
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
						"Santa Marta",
						anfitrion2.getIdAnfitrion()
				);
				inmuebleRepository.save(inmueble20);
			}

		}

	}

//}
