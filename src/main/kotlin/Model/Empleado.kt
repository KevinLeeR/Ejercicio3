package Model
import Model.Comercial
import Model.Repartidor

open class Empleado {
    var nombre: String = ""
    var edad: Int = 0
    var salario: Int = 0
    val PLUS: Int = 300

    constructor(nombre:String, edad:Int, salario:Int){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
    }

    constructor()

}