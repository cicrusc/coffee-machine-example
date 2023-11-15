class CoffeeMachine {
    private var waterAmount = 400
    private var milkAmount = 540
    private var coffeeAmount = 120
    private var cupsAmount = 9
    private var moneyAmount = 550

    fun processInput(input: String) {
        when (input) {
            "buy" -> buyFunction()
            "fill" -> fillFunction()
            "take" -> takeFunction()
            "remaining" -> statusMachine()
            "exit" -> return
        }
    }

    private fun statusMachine() {
        println("The coffee machine has:")
        println("$waterAmount ml of water")
        println("$milkAmount ml of milk")
        println("$coffeeAmount g of coffee beans")
        println("$cupsAmount disposable cups")
        println("$$moneyAmount of money")
    }

    private fun buyFunction() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        when (readln()) {
            "1" -> buyCoffee(250, 0, 16, 4)
            "2" -> buyCoffee(350, 75, 20, 7)
            "3" -> buyCoffee(200, 100, 12, 6)
            "back" -> return
        }
    }

    private fun buyCoffee(waterNeeded: Int, milkNeeded: Int, coffeeBeansNeeded: Int, cost: Int) {
        if (canMakeCoffee(waterNeeded, milkNeeded, coffeeBeansNeeded)) {
            updateMachine(waterAmount - waterNeeded, milkAmount - milkNeeded, coffeeAmount - coffeeBeansNeeded, cupsAmount - 1, moneyAmount + cost)
            println("I have enough resources, making you a coffee!")
        } else {
            println("Sorry, not enough resources!")
        }
    }

    private fun canMakeCoffee(waterNeeded: Int, milkNeeded: Int, coffeeBeansNeeded: Int): Boolean {
        return waterAmount >= waterNeeded && milkAmount >= milkNeeded && coffeeAmount >= coffeeBeansNeeded && cupsAmount >= 1
    }

    private fun fillFunction() {
        println("Write how many ml of water you want to add: ")
        val waterFilled = readln().toInt()
        println("Write how many ml of milk you want to add: ")
        val milkFilled = readln().toInt()
        println("Write how many grams of coffee beans you want to add: ")
        val coffeeFilled = readln().toInt()
        println("Write how many disposable cups you want to add: ")
        val cupsFilled = readln().toInt()
        updateMachine(waterAmount + waterFilled, milkAmount + milkFilled, coffeeAmount + coffeeFilled, cupsAmount + cupsFilled, moneyAmount)
    }

    private fun takeFunction() {
        println("I gave you $$moneyAmount")
        updateMachine(waterAmount, milkAmount, coffeeAmount, cupsAmount, 0)
    }

    private fun updateMachine(water: Int, milk: Int, coffeeBeans: Int, cups: Int, money: Int) {
        waterAmount = water
        milkAmount = milk
        coffeeAmount = coffeeBeans
        cupsAmount = cups
        moneyAmount = money
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine()
    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readln()
        coffeeMachine.processInput(action)
    } while (action != "exit")
}