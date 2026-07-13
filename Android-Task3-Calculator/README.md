# Android Calculator App

A fully-featured calculator application built with Android Studio using Java and Material Design components. This project demonstrates core Android development concepts including UI design with ConstraintLayout, event handling, and mathematical expression evaluation.

## 📋 Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Technical Specifications](#technical-specifications)
- [Installation & Setup](#installation--setup)
- [Usage](#usage)
- [Architecture & Implementation](#architecture--implementation)
- [Key Components](#key-components)
- [Mathematical Expression Evaluation](#mathematical-expression-evaluation)
- [Screenshots](#screenshots)
- [Requirements](#requirements)
- [Contributing](#contributing)

## ✨ Features

- **Basic Arithmetic Operations**: Addition (+), Subtraction (-), Multiplication (*), and Division (/)
- **Decimal Support**: Full support for decimal numbers with validation to prevent multiple decimal points
- **Clear & Backspace**: 
  - Clear (C) button to reset all calculations
  - Backspace button to delete the last entered character
- **Error Handling**: Graceful handling of invalid expressions and division by zero
- **Smart Operator Handling**: Automatically replaces consecutive operators
- **Expression Evaluation**: Evaluates complete mathematical expressions following the order of operations (PEMDAS)
- **Intuitive UI**: Clean, responsive layout with Material Design principles
- **Edge-to-Edge Display**: Modern full-screen support with system bar padding

## 📁 Project Structure

```
Android-Task3-Calculator/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/calculator/
│   │   │   │   └── MainActivity.java          # Main calculator logic and UI controller
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml      # UI layout definition
│   │   │   │   ├── values/
│   │   │   │   │   └── strings.xml            # String resources
│   │   │   │   └── colors.xml                 # Color definitions
│   │   │   └── AndroidManifest.xml
│   │   └── test/                              # Unit tests
│   ├── build.gradle.kts                       # App-level build configuration
│   └── .gitignore
├── gradle/                                    # Gradle wrapper and configuration
├── settings.gradle.kts                        # Project-level settings
├── build.gradle.kts                           # Project-level build configuration
├── gradle.properties                          # Gradle properties
├── gradlew & gradlew.bat                      # Gradle wrapper scripts
├── local.properties                           # Local SDK path configuration
└── README.md                                  # This file
```

## 🛠 Technical Specifications

### Development Environment
- **Language**: Java
- **Build System**: Gradle (Kotlin DSL)
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 36 (Android 15)
- **Java Version**: Java 11

### Dependencies
- **AndroidX**:
  - `androidx.appcompat:appcompat` - Backward compatibility support
  - `androidx.constraintlayout:constraintlayout` - Flexible layout system
  - `androidx.activity:activity-ktx` - Activity extensions
  - `androidx.core:core` - Core library support
- **Material Design**: Google Material Components

### Key Libraries
- **ConstraintLayout**: Modern, flexible layout system for responsive UI design
- **EdgeToEdge**: Full-screen UI support with system bar padding

## 💻 Installation & Setup

### Prerequisites
- Android Studio (latest version recommended)
- JDK 11 or higher
- Android SDK (API 24 minimum)
- Gradle 8.0+

### Steps to Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/MoshoodSO/OIBSIP.git
   cd OIBSIP/Android-Task3-Calculator
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Click "File" → "Open" and select the `Android-Task3-Calculator` folder
   - Wait for Gradle sync to complete

3. **Configure Local SDK**
   - Update `local.properties` with your Android SDK path:
     ```
     sdk.dir=/path/to/your/android/sdk
     ```

4. **Build & Run**
   - Connect an Android device or start an emulator (API 24+)
   - Click "Run" (Shift + F10) or use the green play button
   - Select your device/emulator and click "OK"

## 📱 Usage

### Basic Operations

1. **Enter Numbers**: Tap number buttons (0-9) to input numbers
2. **Decimal Points**: Tap the dot (.) button to add decimal places
   - Only one decimal point allowed per number
3. **Perform Calculations**: Tap an operator (+, −, ×, ÷) to add operations
4. **Get Results**: Tap the equals (=) button to calculate the result
5. **Clear Display**: Tap "C" to reset and start a new calculation
6. **Delete Last Entry**: Tap "←" (backspace) to remove the last character

### Example Calculations
- `5 + 3 = 8`
- `100 / 4 = 25`
- `12.5 * 2 = 25`
- `50 - 20 = 30`

### Error Handling
- **Division by Zero**: Displays "Error" when attempting to divide by zero
- **Invalid Input**: Shows "Error" for malformed expressions
- **Consecutive Operators**: Automatically replaces with the most recently entered operator

## 🏗 Architecture & Implementation

### Main Activity (`MainActivity.java`)

The application follows a single-Activity pattern with the calculator logic implemented directly in `MainActivity.java`. The architecture is organized into the following key methods:

#### Lifecycle & Initialization
- **`onCreate(Bundle)`**: Initializes UI components, sets up click listeners, and configures edge-to-edge display

#### Event Handling
- **`setNumericOnClickListener()`**: Handles numeric input (0-9) and decimal point entry
- **`setOperatorOnClickListener()`**: Manages operator (+, −, ×, ÷) input
- **Clear Button Listener**: Resets the calculator to initial state
- **Backspace Button Listener**: Removes the last character from input
- **Equals Button Listener**: Evaluates the complete expression

#### Validation & Logic
- **`canAddDot()`**: Validates that only one decimal point exists per number
- **`isOperator(char)`**: Checks if a character is a mathematical operator
- **`evaluate(String)`**: Wrapper method for expression evaluation with error handling

#### Expression Parsing & Evaluation
- **`eval(String)`**: Recursive descent parser that evaluates mathematical expressions
  - Respects operator precedence (multiplication/division before addition/subtraction)
  - Supports parentheses for grouping
  - Throws exceptions for invalid input

## 🔧 Key Components

### 1. **UI Layout** (`activity_main.xml`)

The layout uses ConstraintLayout with Flow helpers for a responsive, grid-based button arrangement:

- **Display TextView**: Large, right-aligned text field showing current input and results
- **Number Buttons**: 3×4 grid of number buttons (0-9) arranged using Flow layout
- **Operator Buttons**: Vertical column of operation buttons (+, −, ×, ÷, =)
- **Function Buttons**: Clear (C) and Backspace (←) buttons
- **Responsive Design**: Adapts to different screen sizes using constraint-based layout

### 2. **Input Handling**

```
User Input → Event Listener → StringBuilder → Display Update
```

- Uses `StringBuilder` for efficient string manipulation
- Updates display in real-time as user enters input
- Prevents invalid character combinations

### 3. **Expression Evaluation Engine**

The calculator uses a **recursive descent parser** that respects operator precedence:

```
parse() → parseExpression() → parseTerm() → parseFactor()
```

- **parseExpression()**: Handles addition and subtraction (lowest precedence)
- **parseTerm()**: Handles multiplication and division (higher precedence)
- **parseFactor()**: Handles numbers, decimal points, and parentheses (highest precedence)

## 🧮 Mathematical Expression Evaluation

### Parser Strategy
The calculator implements a recursive descent parser with the following operator precedence:

1. **Parentheses** `( )`
2. **Multiplication/Division** `* /` (left-to-right)
3. **Addition/Subtraction** `+ -` (left-to-right)

### Example Parse Tree
For expression `2 + 3 * 4`:
```
        +
       / \
      2   *
         / \
        3   4
Result: 2 + (3 * 4) = 14
```

### Error Handling
- Division by zero detection
- Invalid number format detection
- Unexpected character detection
- Unmatched parentheses detection

## 📸 Screenshots

The calculator displays:
- **Top Section**: Large result/input display area
- **Middle Section**: 3×4 grid of number buttons with clear and backspace
- **Right Section**: Vertical operator buttons for +, −, ×, ÷, =

## 📋 Requirements

### Android Requirements
- **Minimum SDK Level**: 24 (Android 7.0)
- **Target SDK Level**: 36 (Android 15)
- **Java Version**: 11+

### Gradle Requirements
- **Gradle Version**: 8.0 or higher
- **Kotlin DSL**: For build configuration

## 🤝 Contributing

Contributions are welcome! If you'd like to improve this calculator:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Potential Enhancements
- Add calculation history
- Implement scientific calculator functions
- Add unit conversion utilities
- Support for keyboard input
- Dark mode theme
- Landscape orientation support
- Gesture-based operations

## 📄 License

This project is part of the OIBSIP (Oasis Infobyte Summer Internship Program) coursework.

## 🔗 Related Projects

This is Task 3 of the Android development track. Check out other tasks in the parent repository: [OIBSIP](https://github.com/MoshoodSO/OIBSIP)

---

**Created by**: MoshoodSO  
**Last Updated**: 2024  
**Status**: Complete
