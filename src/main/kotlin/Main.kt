import java.time.LocalDateTime

fun main() {
    var listaItems= arrayListOf<Any>()
    fun generarListaItems(){
        for (i in 1..200){
            val item:Any = Items(id = i, fecha = LocalDateTime.now()).crearItem()
            listaItems.add(item)
        }
    }
    generarListaItems()

    println(listaItems)
}
