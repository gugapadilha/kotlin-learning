fun main () {

    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()
}

interface MyInternFaceListener { //you cannot create instance of interface

    var name: String //Propertis in interface are abstract by default

     abstract fun onTouch() //Methods in interface are abstract by default

    fun onClick() { //Normal methods are public and open by default

    }
}

class MyButton: MyInternFaceListener {

    override var name:String = "guga"

    override fun onTouch() {
        println("Button was touched")
    }

    override fun onClick() { //Optional to override
        println("Button was clicked")
    }
}