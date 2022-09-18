import java.time.LocalDateTime
class Items(val id: Int?, val fecha: LocalDateTime,var nivel: IntRange = 1..3, val tipoItem: String? =null){

    class Comida(val alimento: String = "", tipoItem: String){
    }

    class Hechizo(val valor: Int = 7, tipoItem: String){}

    class Material(val valor: Int = 5, tipoItem: String){}

    class Pocion(val valor: Int = 2, tipoItem: String){}

    fun crearItem(){
        val tipoRand : Int = (1..4).random()
        when (tipoRand){
            1 -> Comida(tipoItem = "Comida")
            2 -> Hechizo(tipoItem = "Hechizo")
            3 -> Material(tipoItem = "Material")
            4 -> Pocion(tipoItem = "Pocion")
        }
    }
}