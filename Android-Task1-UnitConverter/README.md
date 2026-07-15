## Unit Converter Application

A comprehensive Android application developed using Java as part of the Oasis Infobyte Summer Internship Program (OIBSIP). This application provides users with an easy-to-use interface for converting between various units of measurement.

<!--## 📋 Table of Contents

- [Description](#description)
- [Features](#features)
- [Screenshots](#screenshots)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Installation & Setup](#installation--setup)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)
- [Acknowledgments](#acknowledgments)
- [Contact](#contact)
-->
## Description 

The Unit Converter Application is a user-friendly Android mobile application that allows users to convert measurements between different units across multiple categories. Whether you need to convert temperatures, distances, weights, volumes, or other units, this application provides quick and accurate conversions with an intuitive interface.

### Key Objectives:
- Provide fast and accurate unit conversions
- Offer a clean and intuitive user interface
- Support multiple unit conversion categories
- Real-time conversion results
- Offline functionality (no internet required)

## 📸 Screenshots

| *Page 1*                                                                        | *Page 2*                                                                                 | *Page 3*                                                                              |
| ---------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| ![page1](https://github.com/MoshoodSO/OIBSIP/blob/master/Android-Task1-UnitConverter/screenshot/UnitConverter1.jpg) | ![page2](https://github.com/MoshoodSO/OIBSIP/blob/master/Android-Task1-UnitConverter/screenshot/UnitConverter2.jpg) | ![page3](https://github.com/MoshoodSO/OIBSIP/blob/master/Android-Task1-UnitConverter/screenshot/UnitConverter3.jpg) |

## ✨ Features

- **Multiple Conversion Categories**
  - Length (meters, kilometers, miles, feet, inches, etc.)
  - Weight (kilograms, grams, pounds, ounces, etc.)
  - Temperature (Celsius, Fahrenheit, Kelvin)
  - Volume (liters, milliliters, gallons, cups, etc.)
  - Area (square meters, square kilometers, acres, etc.)

- **Real-Time Conversion**: Instant results as you type
- **User-Friendly Interface**: Clean and intuitive design
- **Multiple Input Methods**: Easy number entry with clear buttons
- **Conversion History**: View recent conversions
- **Offline Support**: Works without internet connection
- **Responsive Design**: Optimized for various screen sizes

## 📱 Technologies Used

- **Language**: Java
- **Platform**: Android
- **JDK Version**: 11 or higher
- **Android SDK**: API Level 21 (Android 5.0) and above
- **Build Tool**: Gradle
- **IDE**: Android Studio
- **Architecture**: Model-View-Controller (MVC)

## 📁 Project Structure

```
Android-Task1-UnitConverter/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── example/
│   │   │   │       └── unitconverter/
│   │   │   │           ├── MainActivity.java
│   │   │   │           ├── ConversionManager.java
│   │   │   │           ├── Unit.java
│   │   │   │           └── ConversionHistoryAdapter.java
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   ├── activity_main.xml
│   │   │   │   ├── activity_converter.xml
│   │   │   │   └── item_history.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   ├── colors.xml
│   │   │   │   └── dimens.xml
│   │   │   ├── drawable/
│   │   │   │   ├── ic_launcher.png
│   │   │   │   └── bg_button.xml
│   │   │   └── mipmap/
│   │   └── AndroidManifest.xml
│   └── test/
│       ├── java/
│       │   └── ConversionTest.java
│       └── resources/
├── build.gradle
├── README.md
├── LICENSE
└── .gitignore
```

## 🚀 Installation & Setup

### Prerequisites

- **Android Studio** (latest version recommended)
- **Android SDK** (API Level 21 or higher)
- **Java Development Kit (JDK)** 11 or higher
- **Gradle** 7.0 or higher

### Steps to Run

#### Option 1: Using Android Studio

1. **Clone the repository**
   ```bash
   git clone https://github.com/MoshoodSO/OIBSIP.git
   cd OIBSIP/Android-Task1-UnitConverter
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Click "Open an Existing Project"
   - Navigate to the cloned repository and select the project

3. **Sync Gradle Files**
   - Android Studio will prompt you to sync Gradle files
   - Click "Sync Now"

4. **Build the Project**
   - Go to Build > Make Project
   - Wait for the build to complete

5. **Run the Application**
   - Click the green "Run" button or press Shift + F10
   - Select your target device (emulator or physical device)

#### Option 2: Using Command Line

1. **Clone the repository**
   ```bash
   git clone https://github.com/MoshoodSO/OIBSIP.git
   cd OIBSIP/Android-Task1-UnitConverter
   ```

2. **Build using Gradle**
   ```bash
   ./gradlew build
   ```

3. **Create Debug APK**
   ```bash
   ./gradlew assembleDebug
   ```

4. **Install on Device/Emulator**
   ```bash
   ./gradlew installDebug
   ```

## 📖 Usage

### Basic Usage

1. **Launch the Application**
   - Open the Unit Converter app on your Android device

2. **Select a Category**
   - Choose the type of unit conversion you need (Length, Weight, Temperature, Volume, Area)

3. **Enter Value**
   - Input the value you want to convert in the "From" field

4. **Select Units**
   - Choose the source unit from the "From" dropdown
   - Choose the target unit from the "To" dropdown

5. **View Result**
   - The converted value appears automatically in the "To" field

6. **Check History**
   - Tap the "History" tab to view recent conversions
   - Long-press to copy or delete entries

### Example Conversions

**Length Conversion:**
- Input: 5 kilometers → Output: 3.107 miles

**Temperature Conversion:**
- Input: 25 Celsius → Output: 77 Fahrenheit

**Weight Conversion:**
- Input: 100 pounds → Output: 45.359 kilograms

## 💻 Code Structure

### Main Components

**MainActivity.java**
- Entry point of the application
- Manages the category selection and navigation
- Handles the user interface initialization

**ConversionManager.java**
- Core logic for all conversion calculations
- Handles conversion formulas for different unit types
- Returns accurate conversion results

**Unit.java**
- Data model class representing a unit
- Stores unit name, symbol, and conversion factor
- Implements the conversion logic

**ConversionHistoryAdapter.java**
- Adapter class for displaying conversion history in RecyclerView
- Manages the list of previous conversions
- Handles item click listeners

### Key Methods

```java
// Example conversion method
public double convert(double value, String fromUnit, String toUnit, String category) {
    double result = value * getConversionFactor(fromUnit, toUnit, category);
    return result;
}

// History management
public void addToHistory(Conversion conversion) {
    history.add(0, conversion);
    saveHistory();
}
```

## 🤝 Contributing

We welcome contributions to improve the Unit Converter Application! Here's how you can help:

### Steps to Contribute

1. **Fork the repository**
   ```bash
   Click the "Fork" button on GitHub
   ```

2. **Clone your fork**
   ```bash
   git clone https://github.com/YOUR-USERNAME/OIBSIP.git
   cd OIBSIP/Android-Task1-UnitConverter
   ```

3. **Create a feature branch**
   ```bash
   git checkout -b feature/YourFeatureName
   ```

4. **Make your changes**
   - Write clear and descriptive commit messages
   - Follow the existing code style
   - Add comments for complex logic

5. **Test your changes**
   ```bash
   ./gradlew test
   ```

6. **Commit and Push**
   ```bash
   git commit -m 'Add YourFeatureName: Brief description'
   git push origin feature/YourFeatureName
   ```

7. **Open a Pull Request**
   - Go to the original repository
   - Click "New Pull Request"
   - Provide a clear description of your changes
   - Reference any related issues

### Contribution Guidelines

- Follow Java naming conventions and Android best practices
- Write clean, readable code with proper indentation
- Add unit tests for new features
- Document complex logic with comments
- Test on multiple Android versions if possible

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Moshood Olanrewaju**
- GitHub: [@MoshoodSO](https://github.com/MoshoodSO)
- OIBSIP Participant

## 🙏 Acknowledgments

- **Oasis Infobyte** - For providing the internship opportunity and guidance
- **OIBSIP Team** - For mentorship and support throughout the project
- **Android Community** - For comprehensive documentation and resources
- All contributors and testers who provided valuable feedback

## 📞 Contact

- **GitHub**: [@MoshoodSO](https://github.com/MoshoodSO)
- **Repository**: [OIBSIP](https://github.com/MoshoodSO/OIBSIP)
- **Issues**: [Report an Issue](https://github.com/MoshoodSO/OIBSIP/issues)

---

## 📌 Additional Resources

- [Android Documentation](https://developer.android.com/docs)
- [Java Programming Guide](https://docs.oracle.com/javase/tutorial/)
- [Gradle User Guide](https://docs.gradle.org/current/userguide/userguide.html)

---

*Last updated: July 14, 2026*
*Version: 1.0.0*
