import java.util.Arrays

fun rango(): Int {
    var valorFinal : Int
        do{
            val valor : Int = (6..10).random()
        valorFinal= valor}
    while(valorFinal%2!=0)
    return valorFinal
}

class Mapa (val filas : Int = rango(), val columnas : Int = rango()){
    var mapa:Array<Array<Items>> = Array(filas){Array(columnas)}
    fun crearMapa(){
        for(i in 0 until filas){
            for (j in 0 until columnas){
            }
            println("")
        }
    }

    fun rellenarMapa(mapa: Mapa, listaItems: ArrayList<Items>){
        for (i in 0 until filas){
            for (j in 0 until columnas){
            }
        }
    }

    }