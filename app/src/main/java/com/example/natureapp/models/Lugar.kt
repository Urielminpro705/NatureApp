package com.example.natureapp.models

data class Lugar(
    val nombre : String,
    val descripcion : String,
    val descripcionImagen: String,
    val imagen : String
){
    companion object{
        val lugares = listOf(
            Lugar(
                nombre = "Cañon del sumidero",
                descripcion = "El cañón consiste en un imponente acantilado que se eleva sobre el cauce del río Grijalva. Sus muros, que alcanzan los más de 1000 metros de altura, se han convertido en uno de los paisajes más " +
                        "impresionantes de México, nominado desde hace tiempo para ser una de las Siete Nuevas Maravillas Naturales.",
                imagen = "https://www.gob.mx/cms/uploads/article/main_image/64813/17504476_1398845653492275_4976373153928193777_o.jpg",
                descripcionImagen = "Foto del cañon del sumidero"
            ),
            Lugar(
                nombre = "Los Cabos",
                descripcion = "Sin duda, el arco de Los Cabos en el estado de Baja California Sur es uno de los paisajes naturales de México que " +
                        "debes visitar. La formación rocosa te invita a pasar por su abertura. También, podrás hacer un paseo a camello o contemplar a los leones marinos.",
                imagen = "https://krystalgrandcabos.com/assets/img/blog/37/cover.jpg",
                descripcionImagen = "El arco de Los Cabos"
            ),
            Lugar(
                nombre="Selva lacandona",
                descripcion = "En Chiapas se encuentra la Selva Lacandona la cual tiene casi un millón de hectáreas de jungla. Por lo tanto, si quieres visitar uno de los paisajes naturales de México, " +
                        "te contamos que llueve mucho y verás animales en su entorno, pero vivir la aventura vale la pena.",
                imagen = "https://i0.wp.com/blog.vivaaerobus.com/wp-content/uploads/2020/04/paisaje-selva-lacandona.jpg?w=650&ssl=1",
                descripcionImagen = "Imagen de la selva lacandona en Chiapas"
            ),
            Lugar(
                nombre = "Arrecife veracruzano",
                descripcion = "Sin duda, este es otro de los paisajes de México que tienes que visitar, porque el Arrecife Veracruzano está formado por 2 grandes cuerpos separados por unos 20 kilómetros. " +
                        "De manera similar. podrás nadar y ver el paisaje natural marino desde cerca.",
                imagen = "https://i0.wp.com/blog.vivaaerobus.com/wp-content/uploads/2020/04/paisajes-bonitos-de-mexico.jpg?w=650&ssl=1",
                descripcionImagen = "Imagen del Arrecife veracruzano"
            ),
            Lugar(
                nombre = "Cascada Cola de Caballo",
                descripcion = "Por otro lado, Nuevo León esconde la Cascada de Cola de Caballo más bonita de nuestro país. Recibe este nombre porque el agua, al caer y golpear con rocas, adopta la forma " +
                        "de un rabo de un equino blanco. Se localiza a una hora de Monterrey en auto y hora y media en transporte público y funciona como un parque para realizar actividades al aire libre. ",
                imagen = "https://i0.wp.com/blog.vivaaerobus.com/wp-content/uploads/2020/04/paisaje-cascada-cola-de-caballo.jpg?w=650&ssl=1",
                descripcionImagen = "Imagen de la Cascada Cola de Caballo"
            )
        )
    }
}
