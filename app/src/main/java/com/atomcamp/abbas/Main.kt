package com.atomcamp.abbas

fun main() {

    val today: DaysOfWeek = DaysOfWeek.WEDNESDAY

    println("The day today is ${today.value}")
    println("The number of Day in the week ${today.dayInWeek()}.")
}

fun drive() {
    val listOfAnimals: List<Animal> = listOf(
        Cat(),
        Dog(),
    )

    listOfAnimals.forEach { animal ->
        animal.sound()
    }
}

fun Animal.sound() {
    whatSoundItMakes()
    makeASound()
}

interface Animal {
    val name: String

    fun makeASound()

    fun whatSoundItMakes()
}

class Cat(
): Animal {

    override val name: String = "Cat"

    override fun makeASound() {
        println("Meow")
    }

    override fun whatSoundItMakes() {
        println("A $name mewows")
    }
}

class Dog(
): Animal {
    override val name: String = "Dog"

    override fun makeASound() {
        println("Woof Woof")
    }

    override fun whatSoundItMakes() {
        println("A $name barks")
    }
}

public fun <T> listOf(vararg elements: T): List<T> {
    return if (elements.size > 0) {
        elements.asList()
    }
    else {
        emptyList()
    }
}