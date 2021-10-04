package generic.readonlypropertyinterface

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class NameWithLog(param: String) {
    val name: String by LogReadOnlyProperties(param)
}

class LogReadOnlyProperties(val data: String) : ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        return data.uppercase()
    }
}

fun main() {
    val log = NameWithLog("alian")
    println(log.name)
}