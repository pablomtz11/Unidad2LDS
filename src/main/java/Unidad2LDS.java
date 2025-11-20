import java.util.Scanner;


public class Unidad2LDS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuUnidad2();
    }

    public static void menuUnidad2() {
        int opcionSubtema;

        do {
            limpiarPantalla();
            System.out.println("======================================");
            System.out.println("|    UNIDAD 2 - ESTRUCTURA ATOMICA   |");
            System.out.println("======================================");
            System.out.println("| 1.Configuracion electronica        |");
            System.out.println("| 2. El átomo                        |");
            System.out.println("| 3. Electrón diferencial            |");
            System.out.println("| 4. Modelos atómicos                |");
            System.out.println("| 5. Números cuánticos               |");
            System.out.println("| 6. Principio de Aufbau             |");
            System.out.println("| 7. Tabulación de números cuánticos |");
            System.out.println("| 0. Volver al menú de unidades      |");
            System.out.println("--------------------------------------");
            System.out.println("|Selecciona una opcion:              |");
            System.out.println("======================================");
            opcionSubtema = sc.nextInt();

            switch (opcionSubtema) {
                case 1: TemaConfiguracion_Electronica(); break;
                case 2: TemaElatomo(); break;
                case 3:TemaElectron_Diferencial(); break;
                case 4: TemaModelos_Atomicos(); break;
                case 5: TemaNumerosCuanticos(); break;
                case 6: TemaPrincipio_Aufbau(); break;
                case 7: TemaTabulacion_de_numeros_cuanticos(); break;
                case 0:
                    System.out.println("Regresando al menú...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcionSubtema != 0);
    }

    public static void TemaConfiguracion_Electronica() {
        int opcion;

        do {
            limpiarPantalla();
            System.out.println("===========================================================");
            System.out.println("|       Estructura Atómica: Configuración Electrónica     |");
            System.out.println("===========================================================");
            System.out.println("| 1. Configuración electrónica con gas noble (Z=83)                                  |");
            System.out.println("| 2. Principio de máxima multiplicidad (Regla de Hund)                                      |");
            System.out.println("| 3. Diagrama energético (Z=43)                        |");
            System.out.println("| 4. Electrón diferencial                                       |");
            System.out.println("| 5. Números cuánticos del electrón diferencial (Z=43)                                       |");
            System.out.println("| 6. Bibliografía                                       |");
            System.out.println("| 0. Salir                                                |");
            System.out.println("------------------------------------------");
            System.out.println("|Selecciona una opcion:                   |");
            System.out.println("===========================================================");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("===========================================================");
                    System.out.println("|CONFIGURACIÓN ELECTRÓNICA CON GAS NOBLE |");
                    System.out.println("===========================================================");
                    System.out.println("|Configuración electrónica del elemento con Z=83 (Bismuto) usando gas noble|");
                    System.out.println("|[Xe] 4f14 5d10 6s2 6p3|");
                    System.out.println("===========================================================");
                    esperarTecla();
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("========================================================================");
                    System.out.println("|                   Principio de máxima multiplicidad (Regla de Hund):             |");
                    System.out.println("========================================================================");
                    System.out.println("| Los electrones se distribuyen en los orbitales de un mismo subnivel de forma que se maximice el número de electrones desapareados    |");
                    System.out.println("| Esto minimiza la repulsión electrónica y estabiliza el átomo.              |");
                    System.out.println("========================================================================");
                    esperarTecla();
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("================================================================================================");
                    System.out.println("|                            Diagrama energético                                   |");
                    System.out.println("================================================================================================");
                    System.out.println("| Configuracion electronica estandar para Z= (Tecnecio): |");
                    System.out.println("|  1s ^2            |");
                    System.out.println("|  2s ^2  2p ^6                  |");
                    System.out.println("|  3s ^2  3p ^6                 |");
                    System.out.println("|  4s ^2  3d ^10  4p ^6                  |");
                    System.out.println("|  5s ^2  4d ^5                  |");
                    System.out.println("|  Ultimo electron con spin positivo                    |");
                    System.out.println("================================================================================================");
                    esperarTecla();
                    break;

                case 4:
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                   Electrón diferencial:                   |");
                    System.out.println("======================================================");
                    System.out.println("|          Es el electrón que se coloca en el último orbital de la configuración electrónica de un átomo.         |");
                    System.out.println("| Determina la reactividad química y las propiedades del elemento |");
                    System.out.println("======================================================");
                    esperarTecla();
                    break;

                case 5:
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                   Números cuánticos del electrón diferencial de Z=43:                   |");
                    System.out.println("======================================================");
                    System.out.println("| Número cuántico principal (n) = 5                 |");
                    System.out.println("| Número cuántico secundario (l) = 2 (subnivel d)                  |");
                    System.out.println("| Número cuántico magnético (m) = -1 (por ejemplo, dependiendo del orbital)                 |");
                    System.out.println("| Número cuántico spin (ms) = +1/2 (si es el electrón último colocado |");
                    System.out.println("======================================================");
                    esperarTecla();
                    break;

                case 6:
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                  === Bibliografía ===                   |");
                    System.out.println("======================================================");
                    System.out.println("|          Chang, R. (Química General). McGraw-Hill.        |");
                    System.out.println("|          Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson.        |");
                    System.out.println("| Atkins, P., & Jones, L. (Principios de Química).|");
                    System.out.println("======================================================");
                    esperarTecla();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            if (opcion != 0) esperarTecla();

        } while (opcion != 0);
    }


    public static void TemaElatomo() {
        int opcion;

        do {
            limpiarPantalla();
            System.out.println("==========================================");
            System.out.println("|          ÁTOMO, PARTÍCULAS E ISÓTOPOS        |");
            System.out.println("==========================================");
            System.out.println("|1. ¿Qué es el átomo?                 |");
            System.out.println("|2. ¿Qué es el electrón?                           |");
            System.out.println("|3. ¿Qué es el protón?                |");
            System.out.println("|4. ¿Qué es el neutrón?                     |");
            System.out.println("|5. ¿Qué es el número atómico?             |");
            System.out.println("|6. ¿Qué es el número de masa?                       |");
            System.out.println("|7. ¿Qué es un isótopo?                      |");
            System.out.println("|8. ¿Qué es la masa atómica?                     |");
            System.out.println("|9. Beneficios de la investigación isótopos                     |");
            System.out.println("|10. Peligros del uso bélico del átomo                      |");
            System.out.println("|11. Bibliografia                      |");
            System.out.println("|0. Salir                                |");
            System.out.println("------------------------------------------");
            System.out.println("|Selecciona una opcion                   |");
            System.out.println("==========================================");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|          1. ¿Qué es el átomo?       |");
                    System.out.println("=============================================");
                    System.out.println("|  Un átomo es la unidad básica de la materia, compuesto por un núcleo (protones y neutrones) y         |");
                    System.out.println("|  electrones que giran alrededor. Es la mínima porción de un elemento que conserva sus propiedades químicas.                                                        |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|         2. ¿Qué es el electrón?      |");
                    System.out.println("=============================================");
                    System.out.println("| - El electrón es una partícula subatómica con carga negativa (-1 e)       |");
                    System.out.println("|- Características: (1) Tiene muy poca masa relativa comparada con protones/neutrones;     |");
                    System.out.println("|                 (2) Participa en enlaces químicos y en la conducción eléctrica.            |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|                3. ¿Qué es el protón?                      |");
                    System.out.println("=============================================");
                    System.out.println("|  - El protón es una partícula subatómica con carga positiva (+1 e) localizada en el núcleo.                                                               |");
                    System.out.println("|  - Características: (1) Determina el número atómico del elemento;                                                         |");
                    System.out.println("|                    (2) Tiene masa aproximada de 1 uma (unidad de masa atómica).                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|          4. ¿Qué es el neutrón?       |");
                    System.out.println("=============================================");
                    System.out.println("|     - El neutrón es una partícula subatómica sin carga eléctrica (neutra) ubicada en el núcleo.                                                            |");
                    System.out.println("|      - Características: (1) Contribuye a la masa del núcleo (=1 uma);                                                     |");
                    System.out.println("|                   (2) Aporta estabilidad nuclear y su variación produce isótopos.                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|          5. ¿Qué es el número atómico?     |");
                    System.out.println("=============================================");
                    System.out.println("|     El número atómico (Z) es la cantidad de protones en el núcleo de un átomo; identifica el elemento y, en átomos neutros, también indica el número de electrones.                                                            |");
                    System.out.println("|                                                           |");
                    System.out.println("|                                                                        |");
                    System.out.println("|                                                                                             |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|          6. ¿Qué es el número de masa?    |");
                    System.out.println("=============================================");
                    System.out.println("| El número de masa (A) es la suma del número de protones y neutrones en el núcleo: A = Z + N, donde N = número de neutrones.                                                                |");
                    System.out.println("|                                                           |");
                    System.out.println("|                                                                        |");
                    System.out.println("|                                                                                             |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|       7. ¿Qué es un isótopo?                               |");
                    System.out.println("=============================================");
                    System.out.println("| Un isótopo son variantes de un mismo elemento que tienen igual número atómico (mismos protones) pero diferente número de neutrones (por tanto diferente A).                                                                |");
                    System.out.println("| Ejemplos:                                                          |");
                    System.out.println("| - Carbono: 12C (6p, 6n), 13C (6p, 7n), 14C (6p, 8n).                                                                       |");
                    System.out.println("| - Uranio: 235U (92p, 143n), 238U (92p, 146n).                                                                                            |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 8:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|      8. ¿Qué es la masa atómica?                                |");
                    System.out.println("=============================================");
                    System.out.println("|  La masa atómica (promedio atómico) es el valor promedio de las masas de los isótopos de un elemento, ponderado por su abundancia natural; se expresa en unidades de masa atómica (uma).                                                               |");
                    System.out.println("|                                                           |");
                    System.out.println("|                                                                        |");
                    System.out.println("|                                                                                             |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 9:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|      9. Tres beneficios de la investigación con isótopos:                                |");
                    System.out.println("=============================================");
                    System.out.println("| 1. Medicina: Isótopos radioactivos permiten diagnóstico por imagen (PET, gammagrafía) y tratamientos (radioterapia).                                                                |");
                    System.out.println("| 2. Datación: Isótopos como 14C permiten datar materiales arqueológicos y geológicos.                                                          |");
                    System.out.println("| 3. Agricultura e industria: Marcadores isotópicos y trazadores mejoran fertilizantes, estudios ambientales y procesos industriales.                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 10:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|       10. Peligros del uso del átomo con fines bélicos (argumento):                               |");
                    System.out.println("=============================================");
                    System.out.println("|- Las armas nucleares poseen una capacidad destructiva masiva: pérdidas humanas, destrucción de infraestructura y ecosistemas.                                                                 |");
                    System.out.println("|- Generan radiación residual y contaminación radiactiva de larga duración, afectando salud y ambiente por décadas.                                                           |");
                    System.out.println("| - Uso bélico incrementa riesgos de escalada, errores humanos, proliferación y problemas éticos sobre humanidad y supervivencia.                                                                       |");
                    System.out.println("| - Además, la recuperación social, económica y ambiental tras un ataque nuclear es extremadamente difícil y costosa.                                                                                            |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 11:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|       ========== BIBLIOGRAFÍA ==========                               |");
                    System.out.println("=============================================");
                    System.out.println("| Chang, R. (2010). Química. McGraw-Hill.                                                                |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (2012). Química: La Ciencia Central. Pearson.                                                          |");
                    System.out.println("| Zumdahl, S. (2014). Química. Cengage Learning.                                                                       |");
                    System.out.println("|Petrucci, R. H. (2011). Química General. Pearson Educación.                                                                                             |");
                    System.out.println("|Atkins, P., & Friedman, R. (2011). Química Cuántica. Oxford University Press.                                                                                             |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

    }


    public static void TemaElectron_Diferencial() {
        int opcion;
        do {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|     Estructura Atómica: ELECTRÓN DIFERENCIAL      |");
            System.out.println("=======================================");
            System.out.println("| 1. Concepto                |");
            System.out.println("| 2. Ejemplo: Tecnecio (Z=43)              |");
            System.out.println("| 3. Regla de Hund y spin                         |");
            System.out.println("| 4. Bibliografía                     |");
            System.out.println("| 0. Salir                            |");
            System.out.println("---------------------------------------");
            System.out.println("|Selecciona una opción:               |");
            System.out.println("=======================================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================");
                    System.out.println("|                                             1) Concepto de electrón diferencial:                                               |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("|El electrón diferencial es el último electrón que se agrega en la configuración electrónica de un átomo.  |");
                    System.out.println("|Determina las propiedades químicas más importantes del elemento.                                                                                                         |");
                    System.out.println("|Se encuentra en el orbital de mayor energía del subnivel incompleto.                                                                                     |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================");
                    System.out.println("|                                       2) Ejemplo: Tecnecio (Tc, Z=43)                                             |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("|Configuración electrónica: [Kr] 5s² 4d^10                   |");
                    System.out.println("|El electrón diferencial es el último en el subnivel 4d                                                                                                      |");
                    System.out.println("|Número cuántico principal n = 4                                                                                      |");
                    System.out.println("|Número cuántico secundario l = 2 (subnivel d)                                                                                  |");
                    System.out.println("|Número cuántico magnético m = depende del orbital ocupado (-2 a +2)                                                                                     |");
                    System.out.println("|Spin s = +1/2 (primer electrón en orbital vacío)                                                                             |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("============================================================================================================================");
                    System.out.println("|                                      3) Regla de Hund y spin:                                                        |");
                    System.out.println("============================================================================================================================");
                    System.out.println("|La regla de Hund indica que los electrones se colocan de manera que ocupen orbitales vacíos del subnivel antes de aparearse.                                                                                                     |");
                    System.out.println("|Esto significa que cada orbital del subnivel 4d tiene un electrón con spin positivo primero.                  |");
                    System.out.println("|El spin del electrón diferencial es positivo (+1/2).                                                                                                    |");
                    System.out.println("============================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================");
                    System.out.println("|                                                       BIBLIOGRAFÍAS                                                  |");
                    System.out.println("========================================================================================================================");
                    System.out.println("|Chang, R. (Química General). McGraw-Hill, 2010.                                                           |");
                    System.out.println("|Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson, 2012.  |");
                    System.out.println("|Atkins, P., & Jones, L. (Principios de Química). Oxford, 2010.                                                |");
                    System.out.println("========================================================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");

            }

        } while (opcion != 0);
    }

    public static void TemaModelos_Atomicos() {
        int opcion;
        do {
            limpiarPantalla();
            System.out.println("========================================================");
            System.out.println("|             MODELOS ATÓMICOS           |");
            System.out.println("========================================================");
            System.out.println("|1. Demócrito                  |");
            System.out.println("|2. Dalton                  |");
            System.out.println("|3. Thomson                              |");
            System.out.println("|4. Rutherford             |");
            System.out.println("|5. Bohr                                  |");
            System.out.println("|6. Sommerfeld                        |");
            System.out.println("|7. Schrödinger y Dirac-Jordan                      |");
            System.out.println("|8. Bibliografía                                       |");
            System.out.println("|0. Salir                                              |");
            System.out.println("--------------------------------------------------------");
            System.out.println("|Elige una opción:  |");
            System.out.println("========================================================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|        1) Demócrito (460-370 a.C.)                          |");
                    System.out.println("=============================================");
                    System.out.println("| - Propuso que la materia está formada por partículas indivisibles llamadas átomos.                                                               |");
                    System.out.println("| - No tenía evidencia experimental, era filosófico.                                                         |");
                    System.out.println("| - Introdujo la idea de que los átomos se combinan para formar la materia.                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|     2) Dalton (1803-1808)                             |");
                    System.out.println("=============================================");
                    System.out.println("| - La materia está formada por átomos indivisibles e indestructibles.                                                               |");
                    System.out.println("| - Todos los átomos de un elemento son iguales.                                                          |");
                    System.out.println("| - Los compuestos se forman por combinación de átomos en proporciones fijas.                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|           3) Thomson (1904)                       |");
                    System.out.println("=============================================");
                    System.out.println("| - Conocido como pudín de pasas.                                                               |");
                    System.out.println("| - Átomo es una esfera cargada positivamente con electrones incrustados.                                                          |");
                    System.out.println("| - Explica la neutralidad eléctrica del átomo.                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|      4) Rutherford (1911)                            |");
                    System.out.println("=============================================");
                    System.out.println("| - Experimento de la lámina de oro.                                                               |");
                    System.out.println("| - Átomo con núcleo pequeño, denso y positivo.                                                          |");
                    System.out.println("| - Electrones giran alrededor del núcleo, el resto es espacio vacío.                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|             5) Bohr (1913)             |");
                    System.out.println("=============================================");
                    System.out.println("|- Electrones giran en órbitas circulares con niveles de energía definidos.                                                               |");
                    System.out.println("|- Explica los espectros de emisión del hidrógeno.                                                           |");
                    System.out.println("|- Introduce cuantización de energía.                                                                        |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|     6) Sommerfeld (1916)                             |");
                    System.out.println("=============================================");
                    System.out.println("| - Modificación del modelo de Bohr.                                                              |");
                    System.out.println("| - Introdujo órbitas elípticas además de circulares.                                                          |");
                    System.out.println("| - Considera subniveles (s, p, d, f) para explicar espectros más precisos.                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|      7) Schrödinger y Dirac-Jordan                            |");
                    System.out.println("=============================================");
                    System.out.println("| - Schrödinger desarrolló la ecuación de onda que describe la probabilidad de encontrar electrones.                                                               |");
                    System.out.println("| - Introduce orbitales y números cuánticos (n, l, m, s).                                                          |");
                    System.out.println("| - Dirac y Jordan aportaron la formulación de la mecánica cuántica matricial.                                                                       |");
                    System.out.println("| - Juntos permitieron predecir el comportamiento de electrones en átomos complejos y el spin.                                                                       |");
                    System.out.println("| - Reemplazan órbitas fijas por modelos probabilísticos.                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 8:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|          === Bibliografía ===          |");
                    System.out.println("=============================================");
                    System.out.println("| Chang, R. (Química General). McGraw-Hill, 2010.                                                               |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson, 2012.                                                          |");
                    System.out.println("| Atkins, P., & Jones, L. (Principios de Química). Oxford, 2010.                                                                       |");
                    System.out.println("| Tipler, P. A., & Mosca, G. (Física para Ciencias e Ingeniería).                                                                       |");
                    System.out.println("| Einstein, A. (Teoría de la Relatividad).                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }  while(opcion != 0);

    }

    public static void TemaNumerosCuanticos() {
        int opcion;
        do {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|   ========== MENÚ PRINCIPAL ==========     |");
            System.out.println("=======================================");
            System.out.println("|1. Mecánica cuántica y orbitales                 |");
            System.out.println("|2. Bibliografía                |");
            System.out.println("|0. Salir                             |");
            System.out.println("---------------------------------------");
            System.out.println("| Elige una opción:             |");
            System.out.println("=======================================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("=======================================");
                    System.out.println("|   MECÁNICA CUÁNTICA Y ORBITALES   |");
                    System.out.println("=======================================");
                    System.out.println("|1. Principio de Incertidumbre de Heisenberg                     |");
                    System.out.println("|2. Soluciones de la ecuación de Schrödinger                |");
                    System.out.println("|3. Números cuánticos               |");
                    System.out.println("|4. Cuarto número cuántico (Spin)               |");
                    System.out.println("|5. Número cuántico principal n               |");
                    System.out.println("|6. Valores posibles de n               |");
                    System.out.println("|7. Número cuántico secundario l               |");
                    System.out.println("|8. Valores de l               |");
                    System.out.println("|9. Letras asignadas a l               |");
                    System.out.println("|10. Forma de los orbitales s y p                |");
                    System.out.println("|11. Número cuántico magnético m                |");
                    System.out.println("|12. Valores de m                |");
                    System.out.println("|13. Número cuántico spin ms                |");
                    System.out.println("|14. Valores de ms                |");
                    System.out.println("|15. ¿Qué es un orbital?                |");
                    System.out.println("|16. Diferencia entre nivel, subnivel y orbital                |");
                    System.out.println("|0. Regresar al menu principal                             |");
                    System.out.println("---------------------------------------");
                    System.out.println("| Elige una opción:             |");
                    System.out.println("=======================================");
                    int opcionesp= sc.nextInt();

                    switch(opcionesp){
                        case 1:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();

                            break;
                        case 2:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 3:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 4:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 5:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 6:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 7:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 8:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 9:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 10:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 11:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 12:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 13:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 14:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 15:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 16:
                            limpiarPantalla();
                            System.out.println("=======================================");
                            System.out.println("|    Principio de Incertidumbre de Heisenberg    |");
                            System.out.println("=======================================");
                            System.out.println("|No se puede conocer simultáneamente posición y momento del electrón.                |");
                            System.out.println("|             |");
                            System.out.println("|                         |");
                            System.out.println("=======================================");
                            esperarTecla();
                            break;
                        case 0:
                            break;
                        default:System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|          === Bibliografía ===          |");
                    System.out.println("=============================================");
                    System.out.println("| Chang, R. (Química General). McGraw-Hill, 2010.                                                               |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson, 2012.                                                          |");
                    System.out.println("| Atkins, P., & Jones, L. (Principios de Química). Oxford, 2010.                                                                       |");
                    System.out.println("| Tipler, P. A., & Mosca, G. (Física para Ciencias e Ingeniería).                                                                       |");
                    System.out.println("| Einstein, A. (Teoría de la Relatividad).                                                                       |");
                    System.out.println("=====================================================");
                    esperarTecla();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }  while(opcion != 0);
    }

    public static void TemaPrincipio_Aufbau() {
        int opcion;
        do {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|        |");
            System.out.println("=======================================");
            System.out.println("|1.                 |");
            System.out.println("|2.                |");
            System.out.println("|3.                         |");
            System.out.println("|4.                     |");
            System.out.println("|0.                            |");
            System.out.println("---------------------------------------");
            System.out.println("|              |");
            System.out.println("=======================================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
            }
        }  while(opcion != 0);
    }

    public static void TemaTabulacion_de_numeros_cuanticos() {
        int opcion;
        do {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|        |");
            System.out.println("=======================================");
            System.out.println("|1.                 |");
            System.out.println("|2.                |");
            System.out.println("|3.                         |");
            System.out.println("|4.                     |");
            System.out.println("|0.                            |");
            System.out.println("---------------------------------------");
            System.out.println("|              |");
            System.out.println("=======================================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
            }
        }  while(opcion != 0);
    }


    public static void esperarTecla() {
        System.out.println("\nPresiona ENTER para continuar...");
        try { System.in.read(); } catch (Exception e) {}
    }

    public static void limpiarPantalla() {
        // Solo estética
        for (int i = 0; i < 50; i++) System.out.println();
    }
}

