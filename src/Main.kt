//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random

fun main() {
    // Computer picks a random number between 1 and 100
    val numberToGuess = Random.nextInt(1, 101) // 101 because upper bound is exclusive
    println("I'm thinking of a number between 1 and 100. Start guessing!")

    // Set the maximum number of guesses
    val maxGuesses = 12
    var guessCount= 0

    // Loop until the user guesses correctly or runs out of guesses
    while (guessCount < maxGuesses) {
        println("Guess #${guessCount + 1}: Enter your guess:")
        val guess = readlnOrNull()?.toIntOrNull()

        // Check for invalid input
        if (guess == null) {
            println("Please enter a valid number!")
            continue
        }

        // Increment guess count after valid input
        guessCount++

        // Compare the guess to the target number
        if (guess < numberToGuess) {
            println("Too low!")
        } else if (guess > numberToGuess) {
            println("Too high!")
        } else {
            println("You got it! The number was $numberToGuess. It took you $guessCount guesses.")
            return // Exit the program
        }
    }

    // If we exit the loop, they ran out of guesses
    println("Game over! You ran out of guesses. The number was $numberToGuess.")
}
