package Model
import  Model.Empleado
class Comercial{
    var nombre: String = ""
    var edad: Int = 0
    var salario: Int = 0
    val PLUS: Int = 300
    var comision:Double = 0.0

    constructor(nombre:String, edad:Int, salario:Int, comision:Double){
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
        this.comision = comision
    }

    constructor(comercial: Comercial){
        var comercial = Comercial()
    }

    constructor()

    fun plusComercial(edad: Int, comision: Double):Boolean{
        var comercial = Comercial()
        if(comercial.edad > 30)
            return true
        if(comercial.comision > 200.0)
            return true
        else
            return false
    }
}