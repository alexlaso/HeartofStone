import java.time.LocalDateTime
open class Items(val id: Int?, val fecha: LocalDateTime = LocalDateTime.now(), var nivel: Int = (1..3).random(), val tipoItem: String){

    override fun toString(): String {
        return "Items(id=$id, fecha=$fecha, nivel=$nivel, tipoItem=$tipoItem)"
    }
}

    class Comida constructor(id : Int?, fecha : LocalDateTime = LocalDateTime.now(), tipoItem: String) : Items(id, fecha, tipoItem = tipoItem){
    }

    class Hechizo constructor(id : Int?, fecha : LocalDateTime = LocalDateTime.now(),val valor: Int = 7, tipoItem: String) : Items(id, fecha, tipoItem = tipoItem){}

    class Material constructor(id : Int?, fecha : LocalDateTime = LocalDateTime.now(),val valor: Int = 5, tipoItem: String) : Items(id, fecha, tipoItem = tipoItem){}

    class Pocion constructor(id : Int?, fecha : LocalDateTime = LocalDateTime.now(),val valor: Int = 2, tipoItem: String) : Items(id, fecha, tipoItem = tipoItem){}


fun crearItem(id: Int): Items{
    val tipoRand : Int = (1..4).random()
    when (tipoRand){
        1 -> return Comida(id = id, tipoItem = "Comida")
        2 -> return Hechizo(id = id, tipoItem = "Hechizo")
        3 -> return Material(id = id, tipoItem = "Material")
        else -> return Pocion(id = id, tipoItem = "Pocion")
    }
}