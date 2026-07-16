# OIBSIP - Android Programming Internship Program

A comprehensive portfolio of Android applications developed as part of the **Oasis Infobyte Summer Internship Program (OIBSIP)**. This repository showcases three practical Android projects demonstrating core mobile development concepts, UI design, and Java programming practices.

## 📋 Repository Overview

This repository contains three independent Android applications built with Java, showcasing different aspects of Android development:

1. **Unit Converter** - Multi-category unit conversion application
2. **Calculator** - Scientific calculator with expression parsing
3. **Quiz Application** - Interactive quiz with real-time feedback

---

## 📁 Project Structure

```
OIBSIP/
├── Android-Task1-UnitConverter/     Unit conversion across 5 categories
├── Android-Task3-Calculator/        Scientific calculator with parser
├── Android-Task4-QuizApplication/   Interactive quiz application
└── README.md                        This file
```

---

## 🚀 Projects

### 1. **Android-Task1-UnitConverter**

A comprehensive unit converter application supporting multiple conversion categories.

**Features:**
- **Multiple Categories**: Length, Weight, Temperature, Volume, Area
- **Real-Time Conversion**: Instant results as you type
- **Conversion History**: View and manage recent conversions
- **Offline Support**: Works without internet connection
- **Responsive Design**: Optimized for various screen sizes

**Tech Stack:**
- Language: Java
- Architecture: MVC (Model-View-Controller)
- Android SDK: API 21+
- Build Tool: Gradle

**Quick Start:**
```bash
git clone https://github.com/MoshoodSO/OIBSIP.git
cd OIBSIP/Android-Task1-UnitConverter
# Open in Android Studio and Run (Shift+F10)
```

📖 [View Full Documentation](Android-Task1-UnitConverter/README.md)

---

### 2. **Android-Task3-Calculator**

A fully-featured calculator application with expression parsing and Material Design UI.

**Features:**
- **Arithmetic Operations**: +, −, ×, ÷
- **Decimal Support**: Full decimal number validation
- **Smart Operators**: Auto-replace consecutive operators
- **Expression Evaluation**: PEMDAS order of operations
- **Error Handling**: Division by zero and invalid input detection
- **Material Design**: Modern, clean UI with ConstraintLayout

**Tech Stack:**
- Language: Java
- Build System: Gradle (Kotlin DSL)
- Minimum SDK: API 24 (Android 7.0)
- Target SDK: API 36 (Android 15)

**Key Feature:** Recursive descent parser for mathematical expressions

**Quick Start:**
```bash
git clone https://github.com/MoshoodSO/OIBSIP.git
cd OIBSIP/Android-Task3-Calculator
# Open in Android Studio and Run (Shift+F10)
```

📖 [View Full Documentation](Android-Task3-Calculator/README.md)

---

### 3. **Android-Task4-QuizApplication**

An interactive quiz application with shuffled questions and real-time feedback.

**Features:**
- **Interactive Interface**: User-friendly multiple-choice questions
- **Dynamic Questions**: 10 pre-loaded questions covering various topics
- **Shuffled Questions**: Randomized order for variety
- **Real-Time Feedback**: Color-coded answers (Green=Correct, Red=Wrong)
- **Score Tracking**: Automatic score calculation and display
- **Results Screen**: Comprehensive performance summary

**Tech Stack:**
- Language: Java
- Platform: Android
- Minimum SDK: API 21+
- Architecture: Activity-based navigation

**Quick Start:**
```bash
git clone https://github.com/MoshoodSO/OIBSIP.git
cd OIBSIP/Android-Task4-QuizApplication
# Open in Android Studio and Run (Shift+F10)
```

📖 [View Full Documentation](Android-Task4-QuizApplication/README.md)

---

## 🛠 System Requirements

### For All Projects:
- **Android Studio** (latest version recommended)
- **JDK** 11 or higher
- **Android SDK** API Level 21 or higher (varies by project)
- **Gradle** 7.0 or higher

### Installation Steps (All Projects):

1. **Clone the Repository**
   ```bash
   git clone https://github.com/MoshoodSO/OIBSIP.git
   cd OIBSIP
   ```

2. **Navigate to Project**
   ```bash
   cd Android-Task1-UnitConverter    # or Task3-Calculator or Task4-QuizApplication
   ```

3. **Open in Android Studio**
   - Launch Android Studio
   - File → Open → Select the project folder
   - Wait for Gradle sync

4. **Build and Run**
   - Build → Make Project
   - Run → Run 'app' (or press Shift+F10)
   - Select target device/emulator

### Command Line Setup:
```bash
cd Android-Task1-UnitConverter  # or your desired project
./gradlew build                 # Build the project
./gradlew assembleDebug         # Create debug APK
./gradlew installDebug          # Install on device
```

---

## 🏗 Technology Stack

### Common Stack Across All Projects:
- **Language**: Java
- **Platform**: Android (Multiple API levels)
- **Build System**: Gradle
- **IDE**: Android Studio

### Key Libraries:
- **AndroidX**
  - `androidx.appcompat:appcompat` - Backward compatibility
  - `androidx.constraintlayout:constraintlayout` - Flexible layouts
  - `androidx.activity:activity-ktx` - Activity extensions
  - `androidx.core:core` - Core functionality

- **Material Design**: Google Material Components
- **UI Components**: ConstraintLayout, RecyclerView, Views

---

## 📊 Comparison Table

| Feature | Unit Converter | Calculator | Quiz App |
|---------|---|---|---|
| **Target SDK** | API 21+ | API 24-36 | API 21+ |
| **Main Activity** | Category Selection | Single Screen | Multi-Screen |
| **Data Persistence** | History (Local) | Calculation State | Question Set |
| **Key Algorithm** | Conversion Factor | Recursive Parser | Random Shuffling |
| **UI Pattern** | MVC | Single Activity | Activity Stack |

---

## 🎯 Learning Outcomes

By exploring these projects, you'll understand:

1. **Unit Converter**
   - Category-based state management
   - Real-time UI updates
   - Data persistence with history tracking
   - RecyclerView implementation

2. **Calculator**
   - Recursive descent parsing
   - Operator precedence handling
   - Mathematical expression evaluation
   - Error handling and validation

3. **Quiz Application**
   - Activity lifecycle management
   - Data passing between activities
   - List shuffling and randomization
   - Real-time UI feedback

---

## 📚 Project Documentation

Each project includes comprehensive documentation:

- **Unit Converter**: [Full README](Android-Task1-UnitConverter/README.md)
- **Calculator**: [Full README](Android-Task3-Calculator/README.md)
- **Quiz Application**: [Full README](Android-Task4-QuizApplication/README.md)

---

## 🤝 Contributing

Contributions are welcome! Here's how to contribute:

1. **Fork the repository**
   ```bash
   Click the "Fork" button on GitHub
   ```

2. **Clone your fork**
   ```bash
   git clone https://github.com/YOUR-USERNAME/OIBSIP.git
   cd OIBSIP
   ```

3. **Create a feature branch**
   ```bash
   git checkout -b feature/YourFeatureName
   ```

4. **Make your improvements**
   - Write clean, readable code
   - Follow Java naming conventions
   - Add meaningful comments
   - Test on multiple Android versions

5. **Commit and push**
   ```bash
   git commit -m 'Add YourFeatureName: Brief description'
   git push origin feature/YourFeatureName
   ```

6. **Create a Pull Request**
   - Go to the original repository
   - Click "New Pull Request"
   - Provide a clear description

### Contribution Guidelines:
- Follow Java naming conventions and Android best practices
- Write clean, readable code with proper indentation
- Add unit tests for new features
- Document complex logic with comments
- Test on multiple Android versions if possible

---

## 📄 License

These projects are licensed under the MIT License - see individual [LICENSE](LICENSE) files for details.

---

## 👤 Author

**Moshood Olanrewaju**
- GitHub: [@MoshoodSO](https://github.com/MoshoodSO)
- Repository: [OIBSIP](https://github.com/MoshoodSO/OIBSIP)

---

## 🙏 Acknowledgments

- **Oasis Infobyte** - For providing the internship opportunity and guidance
- **OIBSIP Team** - For mentorship and support throughout the projects
- **Android Community** - For comprehensive documentation and resources
- All contributors and testers who provided valuable feedback

---

## 📞 Contact & Support

- **GitHub Issues**: [Report Issues](https://github.com/MoshoodSO/OIBSIP/issues)
- **GitHub Profile**: [@MoshoodSO](https://github.com/MoshoodSO)
- **Repository**: [OIBSIP](https://github.com/MoshoodSO/OIBSIP)

---

## 📌 Additional Resources

- [Android Documentation](https://developer.android.com/docs)
- [Java Programming Guide](https://docs.oracle.com/javase/tutorial/)
- [Gradle User Guide](https://docs.gradle.org/current/userguide/userguide.html)
- [Material Design Guidelines](https://material.io/design)
- [Kotlin Coroutines Guide](https://kotlinlang.org/docs/coroutines-overview.html)

---

## 🔄 Project Status

| Project | Status | Last Updated |
|---------|--------|--------------|
| Unit Converter | ✅ Complete | July 2026 |
| Calculator | ✅ Complete | July 2026 |
| Quiz Application | ✅ Complete | July 2026 |

---

**Created as part of the Oasis Infobyte Summer Internship Program (OIBSIP)**

*Last updated: July 16, 2026*  
*Version: 1.0.0*
