fun main () {

    var dog = Dog()
    dog.breed = "labrador"
    dog.color = "black"
    dog.eat()
    dog.bark()

    var cat = Cat()
    cat.age = 4
    cat.color = "white"
    cat.eat()
    cat.meow()

    var animal = Animal()
    animal.color = "brown"
    animal.eat()
}
//Por padrão, classes sao 'public' e 'final', então temos que abrir essas classes
open class Animal { //classe pai que disponibiliza pros filhos suas var e fun que ambos irão usar.
    var color: String = ""

    fun eat() {
        println("Eat")
    }
}

class Dog: Animal() { //depois de abrir a classe, preciso colocar o construtor () no final do nome da classe

    var breed: String = ""

    fun bark() {
        println("Bark")
    }
}

class Cat: Animal() {

    var age: Int = -1

    fun meow() {
        println("Meow")
    }
}

