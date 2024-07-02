<h1>Conversor de Moneda</h1>

<p>Este proyecto de Java implementa un conversor de moneda que utiliza una API externa para obtener tasas de cambio actualizadas y permite realizar conversiones entre diferentes tipos de moneda.</p>

<h2>Funciones del Proyecto</h2>

<h3>Clases Principales</h3>

<ol>
        <li>
            <h4>Calculos.java</h4>
            <p>Esta clase maneja la lógica relacionada con las conversiones de moneda.</p>
            <p>Métodos principales:</p>
            <ul>
                <li><code>almacenarValores(String monedaBase, String monedaObjetivo)</code>: Permite al usuario ingresar las monedas de origen y destino, así como la cantidad a convertir.</li>
                <li><code>almacenarValoresPersonalizados()</code>: Proporciona una lista detallada de opciones de moneda para elegir y realiza la conversión basada en la entrada del usuario.</li>
                <li><code>obtenerMensajeRespuesta()</code>: Utiliza la instancia de <code>ConsultaConversion</code> para buscar la conversión y devuelve un mensaje formateado con el resultado.</li>
            </ul>
        </li>
        <li>
            <h4>ConsultaConversion.java</h4>
            <p>Esta clase realiza las consultas a una API externa para obtener las tasas de cambio entre diferentes monedas.</p>
            <p>Métodos principales:</p>
            <ul>
                <li><code>buscaConversion(String monedaBase, String monedaObjetivo, double cantidad)</code>: Realiza una solicitud HTTP a la API de ExchangeRate-API para obtener la tasa de conversión entre <code>monedaBase</code> y <code>monedaObjetivo</code>.</li>
            </ul>
        </li>
        <li>
            <h4>GeneradorDeArchivos.java</h4>
            <p>Esta clase gestiona la escritura de resultados y registros en archivos de texto.</p>
            <p>Métodos principales:</p>
            <ul>
                <li><code>guardarConversion(String conversion)</code>: Guarda la conversión actual en un archivo de texto especificado.</li>
                <li><code>guardarHistorial(List<String> historial)</code>: Guarda un historial de consultas en un archivo de texto especificado.</li>
            </ul>
        </li>
        <li>
            <h4>Principal.java</h4>
            <p>Clase principal que maneja la interacción con el usuario a través de la consola.</p>
            <p>Funcionalidades principales:</p>
            <ul>
                <li>Presenta un menú interactivo para seleccionar conversiones predefinidas o personalizadas.</li>
                <li>Utiliza instancias de <code>Calculos</code>, <code>ConsultaConversion</code> y <code>GeneradorDeArchivos</code> para realizar y registrar las conversiones de moneda.</li>
            </ul>
        </li>
    </ol>

<h2>Instalación y Uso</h2>

<h3>Instalación</h3>

<ol>
        <li>Clona el repositorio desde GitHub:</li>
    </ol>

<pre><code>git clone https://github.com/AlonzzoGz/Conversor-de-Moneda.git</code></pre>

<ol start="2">
        <li>Abre el proyecto en tu IDE preferido, como IntelliJ IDEA.</li>
        <li>Configura la API de tasas de cambio. Necesitarás obtener una clave API de <a href="https://www.exchangerate-api.com/">ExchangeRate-API</a> y actualizar el archivo <code>ConsultaConversion.java</code> con tu clave API en la URL de la API.</li>
        <li>Compila y ejecuta el proyecto.</li>
    </ol>

<h3>Uso</h3>

<p>Una vez configurado y ejecutado el proyecto, podrás realizar conversiones de moneda seleccionando las opciones disponibles en el menú.</p>

<h2>Ejemplos</h2>

<ul>
        <li>Conversión de Peso Mexicano a Dólar Estadounidense.</li>
        <li>Conversión de Dólar Estadounidense a Peso Mexicano.</li>
        <li>Conversión personalizada utilizando un menú detallado de opciones de moneda.</li>
    </ul>

<h2>Contribución</h2>

<p>Las contribuciones son bienvenidas. Si deseas mejorar este proyecto, por favor:</p>

<ol>
        <li>Haz un fork del proyecto.</li>
        <li>Crea una nueva rama (<code>git checkout -b mejoras-feature</code>).</li>
        <li>Realiza tus cambios.</li>
        <li>Haz commit de tus cambios (<code>git commit -am 'Agrega nuevas funciones'</code>).</li>
        <li>Haz push a la rama (<code>git push origin mejoras-feature</code>).</li>
        <li>Crea un nuevo Pull Request.</li>
    </ol>

<h2>Licencia</h2>

<p>Este proyecto está bajo la licencia MIT. Para más detalles, lee el archivo LICENSE.</p>

<hr>

<p>Este README proporciona una visión general de las clases principales del proyecto, sus funciones y cómo instalar y utilizar el conversor de moneda. Asegúrate de personalizarlo con detalles específicos de tu implementación y cualquier otra información relevante.</p>
