
class Pump(val heater: Heater) {

    fun pump() {
        if (!heater.isHot) {
            return
        }
        print("💨 💨 pumping")
    }

}