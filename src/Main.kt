//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random

fun main() {
    // Computer picks a random number between 1 and 100
    val numberToGuess = Random.nextInt(1, 101) // 101 because upper bound is exclusive
    println("I'm thinking of a number between 1 and 100. Start guessing!")

    // Loop until the user guesses correctly
    while (true) {
        println("Enter your guess:")
        val guess = readlnOrNull()?.toIntOrNull()

        // Check for invalid input
        if (guess == null) {
            println("Please enter a valid number!")
            continue
        }

        // Compare the guess to the target number
        if (guess < numberToGuess) {
            println("Too low!")
        } else if (guess > numberToGuess) {
            println("Too high!")
        } else {
            println("You got it! The number was $numberToGuess.")
            break
        }
    }
}