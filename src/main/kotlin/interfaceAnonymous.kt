fun main () {

    var button = Button()
//    button.setMyListener(object: OnClickListener {
//        override fun onClick() {  (I CAN PASS THIS WAY)
//            println("This was clicked")
//        })

    button.clickListener = object: OnClickListener {
        override fun onClick() {
           println("This was clicked")
        }
    }
    button.click()
}

class MyListener: OnClickListener {
    override fun onClick() {
        println("Clicked")
    }
}

interface OnClickListener {
    fun onClick()
}

open abstract class View {
    lateinit var clickListener: OnClickListener

//    fun setMyListener(clickListener: OnClickListener){
//        this.clickListener = clickListener  (I CAN PASS THIS WAY)
//    }

    fun click() {
        clickListener.onClick()
    }
}

class Button: View()
class Image: View()
class Maps: View()