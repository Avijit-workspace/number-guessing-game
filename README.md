# 🎯 Number Guessing Game (Java)

An interactive console game built with Java where the computer picks a secret number between **1 and 100**, and the player must guess it within **5 attempts**.

This project is a clean beginner-friendly example of combining **user input**, **control flow**, and **random number generation** in a real mini application.

## ✨ Why This Project Matters

- Demonstrates practical use of Java fundamentals in a complete program.
- Encourages problem-solving with feedback-driven gameplay.
- Good portfolio piece for beginners learning console app development.

## 🚀 Core Features

- Random number generated each round using `Random`
- 5-attempt limit for balanced challenge
- Smart hints after wrong guesses:
  - Enter a lower number
  - Enter a higher number
- Attempts tracking with remaining chances display
- Clear win and lose messages
- Play-again flow for multiple rounds

## 🧠 Concepts Practiced

- Java basics and program structure
- Conditional logic (`if-else`)
- Looping with `do-while`
- User input handling with `Scanner`
- Randomization with `Random`
- Console UX messaging

## 🛠 Tech Stack

- Language: Java
- Core classes: `java.util.Scanner`, `java.util.Random`
- Execution: Command line / terminal

## 📂 Project Structure

```text
NumberGuessingGame.java
README.md
```

## ▶️ Run Locally

1. Open terminal in this folder.
2. Compile the source file:

```bash
javac NumberGuessingGame.java
```

3. Run the game:

```bash
java NumberGuessingGame
```

## 🧪 Example Gameplay

```text
----------------------------------
 Welcome to Number Guessing Game
----------------------------------
Choose a Number between 1 and 100.
Choose a Random number: 70
The Guess Number is Less than 70
Attempts Left : 4
```

## 📈 Potential Improvements

- Add difficulty levels (easy/medium/hard)
- Add input validation for non-numeric values
- Track high score (fewest attempts)
- Add score history across rounds
- Build a GUI version with Java Swing or JavaFX

## 👨‍💻 Author

**Avijit Kundu**