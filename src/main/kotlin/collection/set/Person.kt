package collection.set

class Person(val name: String) {
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean = when (other) {
        is Person -> name == other.name
        else -> false
    }

    fun showPersonName() {
        println(name)
    }

    override fun toString(): String {
        return "person with name $name"
    }
}