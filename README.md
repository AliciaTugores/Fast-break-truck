# Fast-break-truck

Esta kata es un simulacro de examen en java propuesto por David Gelpi (https://github.com/dfleta)
El enunciado es el siguiente:
 
Mick & Rorty TM quedan atrapados en el planeta Wabalabadu sin recarga para la pistola de dimensiones de Rick y out of cash (sin parné), pues en ese planeta se paga con EnZinIums y los dólares americanos no sirven para nada.

En vez de hacerse repartidores de Jlobo le quitan el trabajo a dos robococineros en una fast-break truck que prepara desayunos a las crías de los alienígenas antes de entrar en la escuela de educación wabalabadaria.
     
El desayuno
El desayuno consta de:
     
 Una caja de cereales de uno de los dos tipos: eyeholes o smiggles
 Una bebida: fleeb juice o turbulent juice

Diagrama de clases UML:

Construye la aplicación según la arquitectura que se representa en el diagrama de clases UML de la figura que se proporciona. Al final del examen tendrás que añadir nuevos componentes al diagrama. Pon tu nombre y devuélvemela al finalizar el examen.

Respeta los nombres de todos los componentes, métodos y propiedades que se indican.
   
Codigo:
SOLID
Garantiza que tu solución satisfaga los 5 principios SOLID.

FastBreakTruck
Prepara dos tipos desayuno:

Eyeholes + Turbulent Juice

y

Smiggles + Fleeb Juice

Para ello, crea un Desayuno con un Item del tipo Eyeholes y otro del tipo TurbulentJuice; luego crea un Desayuno con Smiggles y FleebJuice

Desayuno
mostratItems() recorre los items y los muestra en pantalla.
getCoste() calcula el precio total del desayuno.

Item
Los métodos de este componente devuelven el nombre, el empaquetado y el precio de cada Item

FleebJuice - TurbulentJuice - Smiggles - Eyeholes
Estas clases crean un Item u objeto de ese tipo e inicializan sus propiedades nombre, empaquetado y precio (pvp).

Caja - Tubo
envoltorio() devuelve el nombre del empaquetado: caja o tubo.

El juguete
Una vez que hayas terminado de implementar la app según la arquitectura indicada en el diagrama de clases UML, añade al desayuno la posibilidad de incluir un juguete, un plumbus en el caso del Desayuno de tipo Eyeholes. Su precio es de 100 y viene en una caja.

Comprueba que tu código es OCP de modo que no necesites modificar el código que ya has escrito de la clase Eyeholes para añadir esta nueva funcionalidad. Si has de modificarlo... code smell.

Prepara un desayuno de tipo Eyeholes que incluya un plumbus.

Chequea que el plumbus aparece en la salida del tercer caso test en el script principal de la app.

Añade al diagrama de clases los componentes necesarios para reflejar la extensión que has hecho a la arquitectura del programa y entrégame la hoja.   



#Experiencia personal:

El kata ha estado divertido e interesante de implementar ya que contiene muchos conceptos a la vez. Para realizar el kata me he guiado por el patrón de diseño 'Builder pattern' ya que creo que es el mejor se adapta al proyecto.

Ha sido interesante ya que además hemos implementado cosas nuevas como las clases abstractas y la clase StringBuilder y Formatter para dar diseño a la salida en consola.

También hemos implementado herencia entre clases e interfaces.
