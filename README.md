![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Object_Oriented_Programming-FF6F00?style=for-the-badge&logo=java&logoColor=white)
![CLI](https://img.shields.io/badge/CLI-Console_Application-4EAA25?style=for-the-badge&logo=gnu-bash&logoColor=white)
---

# Coffee Machine Simulator

A simple Kotlin-based coffee machine simulator that allows the user to interact with the machine by buying coffee, filling the machine with resources, and checking the status of the available resources.

## Features

- **Buy Coffee**: Allows users to buy one of three types of coffee (espresso, latte, or cappuccino) based on available resources.
- **Fill Machine**: Allows users to fill the machine with water, milk, coffee beans, and disposable cups.
- **Take Money**: Allows users to take the accumulated money from the machine.
- **View Machine Status**: Displays the current amount of water, milk, coffee beans, cups, and money available in the machine.

## How to Use

1. **Run the program**: Simply run the Kotlin application to start interacting with the coffee machine.
2. **Input commands**:
   - **buy**: Buy a coffee. The machine will ask which type of coffee you want.
   - **fill**: Fill the machine with resources.
   - **take**: Take the accumulated money from the machine.
   - **remaining**: View the current resources available in the machine.
   - **exit**: Exit the program.

### Example Interaction:

```plaintext
Write action (buy, fill, take, remaining, exit):
buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
1
I have enough resources, making you a coffee!
Write action (buy, fill, take, remaining, exit):
remaining
The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money
```

## How It Works

The program uses a **CoffeeMachine** class to simulate the coffee machine's functionality. The machine's state is managed through several variables: water amount, milk amount, coffee beans, cups, and money. The user can interact with the machine by calling various methods based on the action they choose.

### Main Methods:

- **processInput(input: String)**: Processes the user's input and triggers the corresponding action.
- **buyFunction()**: Prompts the user to buy a coffee and checks if there are enough resources.
- **fillFunction()**: Fills the machine with the specified amounts of water, milk, coffee beans, and cups.
- **takeFunction()**: Allows the user to take the accumulated money from the machine.
- **statusMachine()**: Displays the current status of the machine's resources.
 
---
