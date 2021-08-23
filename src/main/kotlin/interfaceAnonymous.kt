fun main () {

    var button = Button()
    button.clickListener = MyListener()
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

    fun click() {
        clickListener.onClick()
    }
}

class Button: View()
class Image: View()
class Map: View()