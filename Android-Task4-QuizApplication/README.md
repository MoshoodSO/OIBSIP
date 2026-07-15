# Quiz Application

A dynamic and interactive Android quiz application built as part of the Oasis Infobyte Summer Internship Program (OIBSIP).

## 📋 Project Overview

This is a mobile quiz application that provides users with an engaging way to test their knowledge on various topics. The app features multiple-choice questions with real-time feedback, score tracking, and comprehensive result analysis.

## ✨ Features

- **Interactive Quiz Interface**: User-friendly UI for answering multiple-choice questions
- **Dynamic Question Loading**: 10 pre-loaded questions covering geography, literature, science, and history
- **Shuffled Questions**: Questions are randomly shuffled to ensure variety on each quiz attempt
- **Real-time Feedback**: Visual feedback with color-coded answers (Green for correct, Red for incorrect)
- **Score Tracking**: Automatic score calculation and tracking throughout the quiz
- **Results Screen**: Comprehensive results page displaying final score and performance
- **Navigation Control**: Next button to proceed through questions seamlessly
- **Option Validation**: Prevents multiple answers to the same question

## 🏗️ Project Structure

```
Android-Task4-QuizApplication/
├── app/
│   └── src/
│       ├── main/
│       │   ├── java/com/example/quizapplication/
│       │   │   ├── MainActivity.java          # Entry point of the application
│       │   │   ├── QuizActivity.java          # Main quiz screen logic
│       │   │   ├── Question.java              # Question model class
│       │   │   └── ResultActivity.java        # Results display screen
│       │   └── res/
│       │       └── layout/
│       │           ├── activity_main.xml      # Welcome screen layout
│       │           ├── activity_quiz.xml      # Quiz screen layout
│       │           └── activity_result.xml    # Results screen layout
│       └── ...
├── gradle/
├── README.md
├── build.gradle
├── settings.gradle.kts
└── local.properties
```

## 🔧 Technical Details

### Architecture
- **Language**: Java
- **Platform**: Android
- **Minimum SDK**: Android API Level 21+
- **Build Tool**: Gradle

### Core Classes

#### **MainActivity.java**
- Entry point of the application
- Displays the welcome screen with a start button
- Navigates to the quiz activity on button click

#### **QuizActivity.java** (Main Logic)
- Manages the quiz flow and question display
- Handles user selections and answer validation
- Implements color-coded feedback system
  - Green: Correct answer
  - Red: Wrong answer selected
- Tracks score in real-time
- Controls navigation between questions
- Transitions to ResultActivity on quiz completion

**Key Methods:**
- `loadQuestions()`: Initializes 10 pre-loaded questions
- `displayQuestion()`: Shows current question and options
- `checkAnswer()`: Validates user selection
- `finishQuiz()`: Transitions to result screen

#### **Question.java** (Data Model)
- POJO class representing a quiz question
- Properties:
  - `questionText`: The question statement
  - `options`: Array of 4 answer options
  - `correctOptionIndex`: Index of the correct answer (0-3)

#### **ResultActivity.java**
- Displays the final score and quiz results
- Shows score ratio (e.g., "8 out of 10")
- Allows user to retake the quiz or exit

### Sample Questions

The application includes 10 diverse questions covering:
1. Geography (France's capital, Red Planet, largest ocean, Australia)
2. Literature (Hamlet author)
3. Science (Gold's chemical symbol, Square root of 64, Prime numbers, Hydrogen)
4. History (World War II end date)

## 🚀 Getting Started

### Prerequisites
- Android Studio (Canary or latest stable version)
- Android SDK (API level 21 or higher)
- Java Development Kit (JDK 11+)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/MoshoodSO/OIBSIP.git
   cd Android-Task4-QuizApplication
   ```

2. Open the project in Android Studio:
   - File → Open → Select the project folder

3. Build the project:
   - Build → Build Bundle/APK → Build APK

4. Run on emulator or physical device:
   - Run → Run 'app' (or press Shift+F10)

## 📱 Application Flow

```
Welcome Screen (MainActivity)
    ↓
Start Button
    ↓
Quiz Screen (QuizActivity)
    ├─ Display Question & Options
    ├─ User Selects Option
    ├─ Show Feedback (Color-coded)
    ├─ Next Button
    └─ Repeat until last question
    ↓
Results Screen (ResultActivity)
    ├─ Display Final Score
    ├─ Retake Quiz or Exit
    └─ End
```

## 🎨 UI Components

- **TextView**: For displaying questions and scores
- **Button**: For answer options and navigation
- **ConstraintLayout**: For responsive UI layout

## 💾 Data Persistence

Questions are stored as Java objects initialized in the `loadQuestions()` method. For future enhancements, consider implementing:
- SQLite database for question storage
- Shared Preferences for user preferences
- Remote server integration for dynamic questions

## 🔄 User Flow

1. User launches the app and sees the welcome screen
2. Clicks "Start Quiz" button
3. Answers 10 randomly shuffled questions
4. Receives immediate visual feedback on selections
5. Navigates through all questions using the "Next" button
6. Views final score and performance on the results screen

## 🎯 Potential Enhancements

- Add difficulty levels (Easy, Medium, Hard)
- Implement timer/time limit per question
- Add question categories and filtering
- Leaderboard for high scores
- Timed mode with countdown timer
- Question statistics and performance analysis
- Support for multiple languages
- Cloud synchronization for multi-device access

## 📄 License

This project is part of the Oasis Infobyte Summer Internship Program.

## 👨‍💻 Author

**MoshoodSO**

## 📞 Contact & Support

For questions or support, please open an issue in the repository.

---

**Built with ❤️ during the Oasis Infobyte Summer Internship Program**
