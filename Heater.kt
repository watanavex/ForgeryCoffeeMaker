
class Heater {

    var isHot: Boolean = false; private set

    fun on() {
        this.isHot = true
        print("🔥 heating 🔥")
    }

    fun off() {
        this.isHot = false
    }

}