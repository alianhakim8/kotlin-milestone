package generic.observablepropertyclass

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(data: T) : ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("ater change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
    var owner: String by Delegates.notNull<String>()
}

fun main() {
    val car = Car("Toyota", 2019)
    car.brand = "subaru"
    println(car.brand)
    car.year = 2020
    println(car.year)
    car.owner = "Alian"
    println(car.owner)
}