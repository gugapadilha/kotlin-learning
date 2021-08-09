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

    open fun eat() { //abri a funcao, poderei mudar o que sera escrito tanto pro dog, quanto pro cat
        println("Eat") //pois mesmo herdando a mesma propriedade, quero que escreva coisas diferentes
    }
}

class Dog: Animal() { //depois de abrir a classe, preciso colocar o construtor () no final do nome da classe

    var breed: String = ""

    fun bark() {
        println("Bark")
    }

    override fun eat(){ //agora posso definir especificamente o que quero mudar dessa fun que foi definidade pelo pai.
        super <Animal>.eat() //previne que o compilador leia o que foi passado corretamente
        println("Dog is eating")
    }
}

class Cat: Animal() {

    var age: Int = -1

    fun meow() {
        println("Meow")
    }

    override fun eat(){ //agora posso definir especificamente o que quero mudar dessa fun que foi definidade pelo pai.
        println("Cat is eating")
    }
}

