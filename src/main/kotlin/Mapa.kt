import java.util.Arrays

fun rango(): Int {
    var valorFinal : Int
        do{
            val valor : Int = (6..10).random()
        valorFinal= valor}
    while(valorFinal%2!=0)
    return valorFinal
}

class Mapa (val columas : Int = rango(), val filas : Int = rango()){

    fun crearMapa()
    {
        var mapa: Array<Array<Items>>

    }}