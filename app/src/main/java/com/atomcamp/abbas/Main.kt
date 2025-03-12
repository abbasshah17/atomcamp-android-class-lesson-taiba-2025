package com.atomcamp.abbas

fun main() {

    val charArray: CharArray = CharArray(5) { index ->
        if (index == 0) {
            'a'
        } else {
            'b'
        }
    }
    val text1: String = String(charArray)

    val text2 = text1.plus("ajndksj")

    /*for () {
        text1 + text2
    }*/

    println("${text1 === text2}")
}

fun dataExample() {
    val abbas = Owner(
        name = "Abbas Anwer",
        address = "Islamabad, Pakistan",
    )

    var rehan = abbas

    val result: Boolean = rehan === abbas

    println("Result = ${result}")
}

fun enumExample() {
    val today: DaysOfWeek = DaysOfWeek.WEDNESDAY

    println("The day today is ${today.value}")
    println("The number of Day in the week ${today.dayInWeek()}.")
}

fun animals() {
    val listOfAnimals: List<Animal> = listOf(
        Cat(
            petName = "Mr. Miyagi",
        ),
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

    private var petName: String = ""

    override val name: String = "Cat"

    constructor(
        petName: String,
    ): this() {
        this.petName = petName
    }

    init {
        println("Second Block.")
    }

    init {
        println("First Block.")
    }

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

    init {
        println("$name object has been created.")
    }

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