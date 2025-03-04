package com.atomcamp.abbas

fun main() {

    val animal: Animal = Cat()
    val animal2: Animal = Dog()

    val listOfAnimals: List<Animal> = listOf(
        Cat(),
        Dog(),
    )

    sound(animal)
    sound(animal2)
}

fun sound(
    animal: Animal,
) {
    animal.whatSoundItMakes()
    animal.makeASound()
}

abstract class Animal(
    val name: String,
) {
    abstract fun makeASound()

    abstract fun whatSoundItMakes()
}

class Cat(

): Animal(
    name = "Cat",
) {
    override fun makeASound() {
        println("Meow")
    }

    override fun whatSoundItMakes() {
        println("A $name mewows")
    }
}

class Dog(
): Animal(
    name = "Dog"
) {

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