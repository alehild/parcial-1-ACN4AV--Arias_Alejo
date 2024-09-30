Informe parcial 1 Alejo Arias 
1. Introducción
En este informe describe el diseño y las funcionalidades de la pantalla de creación de recetas de una aplicación Android. La pantalla permite al usuario ingresar el nombre de la receta, el tiempo de preparación, los ingredientes y seleccionar una imagen representativa de la receta. Además, los usuarios pueden agregar ingredientes de manera dinámica. Esta pantalla fue diseñada utilizando ConstraintLayout y LinearLayout para asegurar una interfaz adaptable y ordenada.

En este informe voy a describir el diseño y las funcionalidades de la pantalla que elegí de mi aplicacion android . la pantalla permite al usuario guardar o publicar una receta de cocina . permitiendo ingresar el nombre de la receta  - el tiempo de preparacion , los ingredientes y subir una imagen de la misma . y los ingredientes agregados de mostrararn en una lista.

2. Descripción General de la Pantalla
La pantalla está dividida en varias secciones clave que permiten al usuario introducir información relacionada con una receta.estas secciones incluyen campos de entrada para el nombre de la receta, el tiempo de preparación, un campo para agregar ingredientes, y un botón para seleccionar una imagen de la receta.

Estructura Visual
La pantalla está construida principalmente con un ConstraintLayout como contenedor principal, que asegura que los elementos se ajusten correctamente en diferentes tamaños de pantalla. dentro de este, hay varios elementos como botones,EditText, y vistas de imagen.

Color y Diseño
todavia no tenia muy en claro los colores que va a tener mi  aplicacion asi que le puse una imagen de fondo a la activity . y un fondo blanco a los campos de texto para que almenos no este todo desarreglado 


3. Elementos de la Interfaz
3.1. Botones
Botón Guardar: Este botón aparece en la parte superior de la pantalla y permite al usuario guardar una receta.
Botón Cancelar : Junto al botón Guardar, permite cancelar la acción actual.
Botón Seleccionar Imagen : Permite al usuario seleccionar una imagen para la receta.
Botón Agregar Ingrediente: Permite al usuario agregar un ingrediente a la lista de ingredientes.
3.2. Campos de Texto
Campo Nombre de la Receta : Un campo de entrada donde el usuario ingresa el nombre de la receta.
Campo Tiempo de Preparación : Un campo de entrada que permite al usuario indicar el tiempo requerido en minutos  para preparar la receta .
Campo Ingredientes: Un campo donde el usuario puede introducir un ingrediente a la vez, que luego será añadido a la lista de ingredientes mediante un botón.


3.3. Imágenes
Imagen de la Receta: Se muestra una imagen de la receta o un marcador de posición hasta que el usuario seleccione una imagen específica.

4. Funcionalidades
4.1. Interactividad
La pantalla incluye varios eventos de interacción:

Botón Agregar Ingrediente: Al presionar este botón, el ingrediente ingresado en el campo de texto es añadido dinámicamente a la lista de ingredientes. Si el campo está vacío, se muestra un mensaje de error pidiendo que se introduzca un ingrediente.
Botón Guardar: Permite almacenar la información ingresada por el usuario para la receta.
Selección de Imagen: Se implementa un botón para que el usuario seleccione una imagen de su galería

4.2. Comportamiento Dinámico
El método addIngredientToList en la clase MainActivity se encarga de agregar un nuevo TextView con el nombre del ingrediente al contenedor LinearLayout. esto proporciona la funcionalidad de agregar múltiples ingredientes de manera dinámica sin necesidad de recargar la pantalla o modificar el diseño de manera estática.

4.3. Manejo de Errores
Se utiliza un Toast para mostrar mensajes de error al usuario si intenta agregar un ingrediente sin haber ingresado texto en el campo correspondiente. Este comportamiento mejora la usabilidad de la aplicación al guiar al usuario en sus interacciones.
para mas adelante el toast va a estar en el boton de guardar o publicar. para que notifiqe si falta agregar un campo 

5. Conclusión
La pantalla de creación de recetas está diseñada para ser intuitiva y fácil de usar, permitiendo al usuario introducir todos los detalles necesarios para crear una nueva receta de manera dinámica. El uso de ConstraintLayout y LinearLayout asegura un diseño adaptable, mientras que la funcionalidad de agregar ingredientes dinámicamente mejora la flexibilidad de la aplicación.


