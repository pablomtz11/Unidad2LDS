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
            System.out.println("|Selecciona una opcion                   |");
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
                    System.out.println("|                                                  FENÓMENOS FÍSICOS                                                |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("|Un fenómeno físico es aquel en el que no cambia la composición de la materia, solo su forma, estado o apariencia.  |");
                    System.out.println("|Ejemplos:                                                                                                          |");
                    System.out.println("|1. Derretimiento del hielo                                                                                         |");
                    System.out.println("|2. Evaporación del agua al hervir                                                                                  |");
                    System.out.println("|3. Romper un vaso                                                                                                  |");
                    System.out.println("|4. Cortar papel                                                                                                    |");
                    System.out.println("|5. Inflar un globo                                                                                                 |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================");
                    System.out.println("|                                                  FENÓMENOS QUÍMICOS                                               |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("|Un fenómeno químico es aquel en el que una o más sustancias se transforman en otras diferentes.                    |");
                    System.out.println("|Ejemplos:                                                                                                          |");
                    System.out.println("|1. La oxidación de un clavo                                                                                        |");
                    System.out.println("|2. La cocción de los alimentos                                                                                     |");
                    System.out.println("|3. La combustión de la madera                                                                                      |");
                    System.out.println("|4. La fermentación del pan o del vino                                                                              |");
                    System.out.println("|5. El deterioro o descomposición de frutas                                                                         |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("============================================================================================================================");
                    System.out.println("|                                                        EJEMPLOS                                                          |");
                    System.out.println("============================================================================================================================");
                    System.out.println("|FENÓMENOS FÍSICOS:                                                                                                        |");
                    System.out.println("|1. Derretimiento del hielo 2. Evaporación del agua 3. Romper un vaso 4. Cortar papel 5. Inflar un globo                   |");
                    System.out.println("|FENÓMENOS QUÍMICOS:                                                                                                       |");
                    System.out.println("|1. Oxidación de un clavo 2. Cocción de alimentos 3. Combustión de la madera 4. Fermentación 5. Deterioro de frutas        |");
                    System.out.println("============================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================");
                    System.out.println("|                                                       BIBLIOGRAFÍAS                                                  |");
                    System.out.println("========================================================================================================================");
                    System.out.println("|1. Chang, Raymond. Química. McGraw-Hill Education, 2010.                                                              |");
                    System.out.println("|2. Brown, Theodore L., LeMay, H. Eugene, y Bursten, Bruce E. Química: La Ciencia Central. Pearson Educación, 2012.    |");
                    System.out.println("|3. Enciclopedia Britannica. Artículo: Physical and Chemical Changes.                                                  |");
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
            System.out.println("|             ElEMENTO, COMPUESTO Y MEZCLA             |");
            System.out.println("========================================================");
            System.out.println("|1. Clasificación de sustancias puras                  |");
            System.out.println("|2. Concepto de elemento químico                       |");
            System.out.println("|3. Concepto de compuesto                              |");
            System.out.println("|4. Diferencias entre elemento y compuesto             |");
            System.out.println("|5. Qué es una mezcla                                  |");
            System.out.println("|6. Qué es una mezcla homogénea                        |");
            System.out.println("|7. Qué es una mezcla heterogénea                      |");
            System.out.println("|8. Bibliografía                                       |");
            System.out.println("|0. Salir                                              |");
            System.out.println("--------------------------------------------------------");
            System.out.println("|Elige el número de la pregunta que deseas consultar:  |");
            System.out.println("========================================================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("\n");
                    System.out.println("Las sustancias puras se clasifican en elementos y compuestos.");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("\n");
                    System.out.println("Un elemento químico es una sustancia formada por átomos del mismo tipo");
                    System.out.println("que no pueden descomponerse por métodos químicos comunes.");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("\n");
                    System.out.println("Un compuesto es una sustancia formada por la unión química");
                    System.out.println("de dos o más elementos en proporciones definidas.");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("\n");
                    System.out.println("Diferencias entre elemento y compuesto:");
                    System.out.println("- El elemento está formado por un solo tipo de átomo, el compuesto por varios.  ");
                    System.out.println("- El elemento no se puede descomponer químicamente, el compuesto sí.");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("\n");
                    System.out.println("Una mezcla es la combinación física de dos o más sustancias");
                    System.out.println("que conservan sus propiedades originales.");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("\n");
                    System.out.println("Una mezcla homogénea es aquella en la que sus componentes no se distinguen");
                    System.out.println("a simple vista y forman una sola fase, como el agua con sal.");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("\n");
                    System.out.println("Una mezcla heterogénea es aquella en la que se pueden observar sus componentes");
                    System.out.println("a simple vista, como agua con aceite o granito.");
                    esperarTecla();
                    break;
                case 8:
                    limpiarPantalla();
                    System.out.println("\n");
                    System.out.println("8. Bibliografía");
                    System.out.println("1.Zumdahl, Steven S., Zumdahl, Susan A. Chemistry: An Atoms First Approach. 3ra edición. Cengage Learning, 2016.");
                    System.out.println("\n");
                    System.out.println("2.Brown, Theodore L., LeMay, H. Eugene, Bursten, Bruce E., Murphy, Catherine. Química: La Ciencia Central. 14ª edición. Pearson Educación, 2018.");
                    System.out.println("\n");
                    System.out.println("3.Petrucci, Ralph H., Herring, F. Geoffrey, Madura, Jeffry D., Bissonnette, Carey. Química General: Principios y Aplicaciones Modernas. 11ª edición. Pearson, 2017.");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    break;
                default:
            }
        }  while(opcion != 0);

    }

    public static void TemaNumerosCuanticos() {
        int opcion;
        do {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|        |");
            System.out.println("=======================================");
            System.out.println("|1.                 |");
            System.out.println("|2.                |");
            System.out.println("|3.                         |");
            System.out.println("|4.                       |");
            System.out.println("|0.                             |");
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

