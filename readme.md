# Hangman Game in Java

Welcome to my Hangman game implemented with Java! This classic word-guessing game will test your knowledge and vocabulary. Follow the instructions below to play, learn the rules, or quit the game.

## Table of Contents
- [Getting Started](#getting-started)
- [How to Play](#how-to-play)
- [Rules](#rules)
- [Quit](#quit)

## Getting Started

To run the Hangman game, you'll need Java installed on your computer. Follow these steps:

1. Clone or download this repository to your local machine.

2. Open your terminal or command prompt.

3. Navigate to the directory where you have saved the game files.

4. Compile the Java code:
   ```bash
   javac hangmangame.java
   ```

5. Run the game:
   ```bash
   java HangmanGame
   ```

## How to Play

1. Start the game by selecting option 1 - Play a game of HangMan.

2. The game will randomly select a word from a predefined list.

3. You'll see a row of underscores, representing each letter in the word, separated by spaces. Your task is to guess the letters and fill in the blanks.

4. You have a limited number of attempts (lives) to guess the word. If you guess incorrectly and the letter is not in the word, you lose a life.

5. The game will keep track of the letters you've guessed and display them to you.

6. If you guess a letter that you've already guessed before, the game will inform you (you don't lose a life).

7. If you successfully guess a letter that is in the word, the corresponding blank spaces will be filled with that letter.

8. After each guess, the current state of the word (with blanks and correctly guessed letters) will be displayed.

9. Continue guessing letters until you either:
    - Successfully guess the entire word, in which case you win the game!
    - Run out of lives, resulting in a loss.

10. After the game ends (either win or loss), you'll be prompted with the same start options:
- 1 - Play a game of HangMan.
- 2 - Read me the rules.
- 3 - Quit.

11. You can choose to play again, view the rules for a quick reminder, or quit the game.

## Rules

Here are some important rules and guidelines for playing Hangman:

- Guess one letter at a time. No multiple letter or word guesses are allowed.

- Only alphabetic characters are valid guesses (no numbers, symbols, or special characters).

- The game is not case-sensitive. All guesses are converted to uppercase.

## Quit

If you decide to quit the game, simply select the "quit" option from the main menu. This will exit the game.

Enjoy playing Hangman and challenge your word-guessing skills! If you have any questions or feedback, feel free to contact me.

Have fun!