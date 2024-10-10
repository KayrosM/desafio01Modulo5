package com.inforcap.main

data class Autor(
    val nombres: String,
    val apellidos: String,
    val obrasDestacadas: List<String>,
    val anioNacimiento: Int,
    val anioMuerte: Int? = null,
    val comentario: String
) {

    fun calcularEdad(): Int {
        val anioActual = 2024
        return if (anioMuerte == null) {
            anioActual - anioNacimiento
        } else {
            anioMuerte - anioNacimiento
        }
    }


    fun imprimirDetallesAutor() {
        println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
        println("+ Nombre del autor: $nombres $apellidos +")
        println("+ Obras destacadas: ${obrasDestacadas.joinToString(", ")} +")
        println("+ Año de nacimiento: $anioNacimiento +")
        anioMuerte?.let {
            println("+ Año de muerte: $anioMuerte, murió a los ${calcularEdad()} años de edad +")
        }
        println("+ Comentario: $comentario +")
        println("++++++++++++++++++++++++++++++++++++++++++++++++++++")
    }
}


fun calcularDiferenciaAnios(anioInicio: Int, anioFin: Int): Int {
    return anioFin - anioInicio
}

fun main() {

    val autor = Autor(
        nombres = "Howard Phillips",
        apellidos = "Lovecraft",
        obrasDestacadas = listOf("El Llamado de Cthulhu", "En las Montañas de la Locura"),
        anioNacimiento = 1890,
        anioMuerte = 1937,
        comentario = "Uno de los más influyentes escritores de horror cósmico."
    )


    autor.imprimirDetallesAutor()
}