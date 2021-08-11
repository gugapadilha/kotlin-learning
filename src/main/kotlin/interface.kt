fun main () {

    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()

    //Interface can contains both Normal Methods and Abstract Methods
    //but they contains only abstract properties
    //You cannot create instance of an Interface similar to an Abstract Class
    //Interface are not class
}

interface MyInternFaceListener { //you cannot create instance of interface

    var name: String //Propertis in interface are abstract by default

     abstract fun onTouch() //Methods in interface are abstract by default

    fun onClick() { //Normal methods are public and open by default
        println("onClick Interface Code: Button Clicked")

    }
}

class MyButton: MyInternFaceListener {

    override var name:String = "guga"

    override fun onTouch() {
        println("Button was touched")
    }

    override fun onClick() { //Optional to override
        super.onClick()
        println("Button was clicked")
    }
}