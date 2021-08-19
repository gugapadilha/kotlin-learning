fun main () {
    //Implement Interface
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