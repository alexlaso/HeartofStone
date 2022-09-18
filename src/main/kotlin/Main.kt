import java.time.LocalDateTime

fun main() {
    var listaItems= arrayListOf<Items>()
    fun generarListaItems(){
        for (i in 1..200){
            val item: Items = crearItem(i)
            listaItems.add(item)
        }
    }
    generarListaItems()

    for (element in listaItems){
        println(element)
    }
}
