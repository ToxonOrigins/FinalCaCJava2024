package net.javaguides.springboot;

import net.javaguides.springboot.model.Producto;
import net.javaguides.springboot.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("")
@SpringBootApplication
public class SpringbootBackendApplication extends SpringBootServletInitializer implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private ProductoRepository ProductoRepository;

	@Override
	public void run(String... args) throws Exception {
	Producto producto = new Producto();
	producto.setNombre("Placa De Video Asus Rog Strix Rtx 2060 6gb Evo V2 Gaming");
	producto.setDescripcion("Las tarjetas gráficas ROG GeForce RTX ™ funcionan con la arquitectura de GPU Turing ™ y la nueva plataforma RTX. Esto le brinda hasta 6 veces el rendimiento de las tarjetas gráficas de la generación anterior y brinda el poder del trazado de rayos en el tiempo real y la IA a los juegos.\r \n Especificaciones:\r \n Marca: Asus\r \n Línea: ROG STRIX\r\n Serie: GEFORCE RTX 20 Series\r\nModelo: RTX 2060\r\nCodigo del fabricante: 90YV0GS1-M0AA00\r\nCodigo universal del producto: 195553217811\r \nVersión: ROG-STRIX-RTX2060-6G-GAMING\r\nEdición: Oc Edition\r\nFabricante: Nvidia\r\nTipo de memoria gráfica: GDDR6\r\nTamaño de memoria: 6GB\r \nBus de memoria: 192 bits\r\nVelocidad de la memoria: 14 Gbps\r\nMotor de graficos: NVIDIA® GeForce RTX ™ 2060\r\nInterfaz con la placa madre: PCI Express x16\r\nNucleos: 1920 Unidades\r\nVelocidad clock nucleo (MHZ) Boost: 1710 MHz, Modo de juego: 1680 MHz (Boost Clock)\r\nAfterburner OC: Si\r\nVelocidad Clock Memoria (MHZ): 14 Gpbs\r\nMaximo de pantallas: 4\r \nTecnologia G-Sync: Si\r\nAdaptive ventical Sync: Si\r\nSoporte HDCP: 2.2\r\nConsumo: 175 W\r\nSalidas: Si x 2 (HDMI2.0b Nativo)-Sí x 2 (DisplayPort nativo 1.4a)-Si (2,2)\r\n Alimentacion recomendada: 500W\r\n Resolucion maxima digital: 7680x4320\r\nSoporte directx version: 12 API\r\nSoporte opengl version: 4.5\r\nEntrada de alimentación: 8 pines x1\r\nIluminacion: RGB\r \nDimenciones: 30.05 x 13.06 x 4.89 cm - 11.85 x 5.16 x 1.93 pulgadas\r\nPeso: 758 g / 1198 g");
	producto.setPrecio(320000);
	producto.setImg("https://quietpc.es/images/products/asus-rtx2060s-o8g-evo-gaming-box.jpg");
	ProductoRepository.save(producto);

	Producto producto1 = new Producto();
	producto1.setNombre("Joystick Inalambrico Redragon G808");
	producto1.setDescripcion("Más que un joystick wireless: es el periférico ideal para todos los jugadores de PC y PlayStation 3. \nSin cables, y con una conexión wireless de 2.4Ghz.\n En PC nos conectaremos mediante un dongle USB 2.0 incluido con tu dispositivo Redragon, para obtener la conexión que deseemos, sea Xinput (joystick reconocido de forma nativa como mando de Microsoft), o Dinput (reconocido como dispositivo de juego sin controlador).Para PS3 nos conectaremos de la misma manera que conectamos un joystick convencional, insertando el cable a su puerto USB, y encender el mando con la consola prendida hasta que lo reconozca, luego, estaremos listos para jugar con nuestro nuevo joystick inalámbrico.\nEl Harrow es una pieza terminada sobre plástico ABS reforzado, de forma ergonómica y diseñada para todo tipo de jugadores. Tengan el agarre del mando que tengan, y cualquiera sea la cantidad de horas de uso que tengan pensadas. Su batería interna de Li-Ion recargable por cable USB es lo necesario para tener hasta 8 horas de uso continuo.\nOcho botones en total, todos ubicados en sus posiciones convencionales. Cuatro sobre el lado frontal derecho, ultra cómodos y con un excelente tacto y recorrido, los dos botones izquierdo y derecho que van bajo los índices en la parte superior, y los gatillos sensibles nos darán todo lo necesario para cumplir las expectativas en cualquier juego que le pongan delante al Harrow.\nSi, completamente si, equipado con dos motores para force feedback, este periférico está a la altura de los mejores, cumpliendo y excediendo los requisitos para la mejor experiencia in-game.\nEl Harrow está equipado con un D-pad de ocho direcciones, sumado a dos sticks analógicos, para que elijas la forma de desplazarte que te resulte más cómoda y mejor se adapte a tu estilo de juego.\n– Tipo de conexión: Inalambrica 2.4 Ghz\n– Plataformas soportadas: PC (Dinput and Xinput), PlayStation® 3\n– Interfaz: Dongle USB 2.0\n– Botones: 8 + 2 Sticks\n– Bumpers L1/R1: 2 tipo botón\n– Triggers LT/RT: 2, sensitivos\n D-Pad: 8 vías\n Vibración: 2 motores de vibración para Force Feedback\n Fuente de alimentación: Batería interna de Li-Ion\n Tamaño: 6 x 10 x 15 cm\n Peso: 330 gr ");
	producto1.setPrecio(50000);
	producto1.setImg("https://www.mink.com.ar/qloud/ryr/fotos/14144-0.jpg");
	ProductoRepository.save(producto1);

	Producto producto2 = new Producto();
	producto2.setNombre("Intel Core I5-13400 13th Gen");
	producto2.setDescripcion("Productividad y entretenimiento, todo disponible en tu computadora de escritorio. La superioridad tecnológica de INTEL es un beneficio para todo tipo de profesionales. Asegura el mejor rendimiento de las aplicaciones, de la transferencia de datos y la conexión con otros elementos tecnológicos.\r\nModelo: i5-13400\r\nEjecuta programas de edición de videos, creación de contenido, streaming y videojuegos sin afectar el rendimiento del dispositivo.\r\nMemoria caché de 20 MB, rápida y volátil.\r\n Procesador gráfico Intel UHD Graphics 730.\r\nSoporta memoria RAM DDR4.\r\nSu potencia es de 65 W.\r\nCuenta con Hyper-Threading que favorece la ejecución de programas en simultáneo, al dividir el procesador físico en dos procesadores lógicos.\r\n Producto en empaque original.\r\n Zócalos compatibles: FCLGA1700");
	producto2.setPrecio(340000);
	producto2.setImg("https://shop.clarioncomputers.in/wp-content/uploads/2023/01/13400.png");
	ProductoRepository.save(producto2);

	Producto producto3 = new Producto();
	producto3.setNombre("Teclado gamer T-Dagger Bora T-TGK315");
	producto3.setDescripcion("Este teclado T-Dagger de alto rendimiento permite que puedas disfrutar de horas ilimitadas de juegos. Está diseñado especialmente para que puedas expresar tanto tus habilidades como tu estilo. Podrás mejorar tu experiencia de gaming, ya seas un aficionado o todo un experto y hacer que tus jugadas alcancen otro nivel.\r\n\r\nDistinción a todo color\r\nSu retroiluminación le da un toque diferente a tu equipo y resalta su composición cuando es utilizado en espacios poco iluminados.\r\nTecnología antighosting\r\nEste dispositivo tiene teclas antighosting. Esta cualidad es indispensable si requerís de un uso intensivo del periférico. Gracias a esto podrás evitar fallas al tocar varias teclas al mismo tiempo.\r\nIdioma: Español\r\nLayout: QWERTY\r\nColor de la retroiluminación: RGB\r\nConsola compatible: PS4.\r\nErgonómico y apto para diversos usos.\r\nResiste a salpicaduras.\r\nFunción antighosting incorporada.\r\nTipo de teclado: mecánico.\r\nTecla cilíndrica.\r\nCon conector USB 3.1.\r\nCon cable removible.\r\nMedidas: 35cm de ancho, 3cm de alto y 12cm de profundidad.");
	producto3.setPrecio(45000);
	producto3.setImg("https://t-daggerla.com/wp-content/uploads/2021/11/Teclado-T-TGK315-Bora-RGB.png");
	ProductoRepository.save(producto3);
	}
}
/**/