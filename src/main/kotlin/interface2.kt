fun main () {
    //Implement Interface

    val discontos = DigitalProduct() //implementing the class thats is above de discountable
    discontos.foo()
    discontos.discountPercent()
}

interface Discountable {
    fun discountPercent(): Double
    fun foo()
}

class DigitalProduct: Discountable {
    override fun discountPercent(): Double {
        TODO("Not yet implemented")
    }

    override fun foo() {
        TODO("Not yet implemented")
    }

}

class GenericToy: Discountable {
    override fun foo() {
        TODO("Not yet implemented")
    }

    override fun discountPercent(): Double {
        TODO("Not yet implemented")
    }
}