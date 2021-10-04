package generic.genericconstraint

open class Employee

interface CanSayHello {
    fun sayHello(name: String) {
        println("Hello $name")
    }
}

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        super.sayHello(name)
    }
}

//class Company<T : Employee>(val employee: T)

class Company<T>(val employee: T) where T : generic.genericconstraint.Employee, T : generic.genericconstraint.CanSayHello


fun main() {
    //    val data1 = Company(Employee())
    //    val data2 = Company(Manager())
    //    val data4 = Company("test") // error
    val data3 = Company(VicePresident())
    data3.employee.sayHello("Alian")
}