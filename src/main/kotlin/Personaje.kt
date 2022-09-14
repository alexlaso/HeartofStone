import java.time.LocalDateTime

class Personaje (val nombre: String, val id: Int, var vida: Int, var nivel: IntRange = 1..3, val date: LocalDateTime, var items: List<Items>){}

class Elfo constructor(var inmortalidad: Int = 10, var flechas: Int){
    fun lanzarFlecha(flechas: Int){
        println("Lanzar flecha")
        this.flechas -= 1
    }
}

class Humano constructor(var escudo: IntRange = 1..100, val poseeCaballo: Boolean){
    fun obtenerCaballo(){
        val rndm=(0..1).random()
        when (rndm) {
            0 -> println("No posee un caballo")
            1 -> println("Posee un caballo")
        }
    }
}

class Trasgo constructor(var maldad: Int = 15){

}