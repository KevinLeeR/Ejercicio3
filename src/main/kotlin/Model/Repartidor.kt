package Model

class Repartidor {
    var nombre: String = ""
    var edad: Int = 0
    var salario: Int = 0
    val PLUS: Int = 300
    var zona: String = ""

    constructor(nombre:String, edad:Int, salario:Int, zona:String){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
        this.zona = zona
    }

    constructor(repartidor: Repartidor){
        var repartidor = Repartidor()
    }

    constructor()

    fun plusRepartidor():Boolean{
        var repartidor = Repartidor()
        if(repartidor.edad < 25 && repartidor.zona == "zona 3" ){
            repartidor.salario + PLUS
            return true
        }
        return false
    }
}