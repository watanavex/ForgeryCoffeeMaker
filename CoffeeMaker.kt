
class CoffeeMaker(
    val header: Heater, 
    ) {

    fun brew() {
        header.on()
        header.off()
    }

}