class Pila<T>(){

    var pila = mutableListOf<T>()

    fun Tope() = if(pila.isEmpty()){null} else pila.get(pila.size)

    fun Push(obj:T){pila.add(pila.size,obj)}

    fun Pop(){pila.removeAt(pila.size)}

    fun Vacia():Boolean{return pila.size== 0||Tope()==null}

}

fun <T> Reverse(pila: MutableList<T>){
    var pilaReversa = Pila<T>()
    while (pila.size>0){
        val listIterator = pila.listIterator()
        for (t in listIterator) {
            if (!listIterator.hasNext()) {
                pilaReversa.Push(t)
                pila.remove(t)
            }
        }
    }
}