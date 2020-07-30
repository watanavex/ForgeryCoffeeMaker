
class CoffeeMaker(
    val header: Heater, 
    val pump: Pump
    ) {

    fun brew() {
        header.on()
        pump.pump()
        print("☕️")
        header.off()
    }

}