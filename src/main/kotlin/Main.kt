import Model.Repartidor
import Model.Comercial
import Model.Empleado


fun main(args: Array<String>) {

    var empleado1 = Comercial(nombre = "Kevin", edad = 25, salario = 500000, comision = 300.0)
    var empleado11 = Comercial(nombre = "Enrique", edad = 20, salario = 300000, comision = 100.0)
    var empleado2 = Repartidor(nombre = "Will", edad = 50, salario = 100000, zona = "zona 3")
    var empleado22 = Repartidor(nombre = "Smith", edad = 20, salario = 200000, zona = "zona 6")

    println(empleado1.plusComercial(edad = 35, comision = 300.0))
    println(empleado11.plusComercial(edad = 20, comision = 100.0))
    println(empleado2.plusRepartidor())
    println(empleado22.plusRepartidor())
    println("FIN")
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}