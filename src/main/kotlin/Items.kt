import java.time.LocalDateTime

enum class tipoItem{
    comida, hechizo, material, pocion
}

class Items (val id:Int, val fecha: LocalDateTime, var nivel: IntRange = 1..3, val tipoItem: tipoItem){
}