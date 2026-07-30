# OIBSIP - Android Internship Portfolio

[![Repository](https://img.shields.io/badge/repository-OIBSIP-blue)](https://github.com/MoshoodSO/OIBSIP)
[![Language](https://img.shields.io/badge/language-Java%20%26%20Notebooks-orange)](https://github.com/MoshoodSO/OIBSIP)

A concise portfolio of three Android applications developed as part of the Oasis Infobyte Summer Internship Program (OIBSIP). Each project is self-contained and includes its own README and documentation inside the repository.

## Table of Contents

- [Overview](#overview)
- [Projects](#projects)
- [Quick Start](#quick-start)
- [System Requirements](#system-requirements)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

---

## Overview

This repository contains three Android applications built with Java. The top-level README gives a short summary and links to each project's detailed README.

Projects included:

- Android-Task1-UnitConverter — Unit conversion app (Length, Weight, Temperature, Volume, Area)
- Android-Task3-Calculator — Scientific-style calculator with expression parsing
- Android-Task4-QuizApplication — Interactive multiple-choice quiz app

Each project folder contains a dedicated README with installation and usage instructions.

---

## Projects

### Android-Task1-UnitConverter
A user-friendly unit converter supporting multiple categories and real-time conversion. See: Android-Task1-UnitConverter/README.md

### Android-Task3-Calculator
A calculator app that uses a recursive descent parser to evaluate expressions and honors operator precedence. See: Android-Task3-Calculator/README.md

### Android-Task4-QuizApplication
An interactive quiz app with shuffled questions, real-time feedback, and score tracking. See: Android-Task4-QuizApplication/README.md

---

## Quick Start

Clone the repository and open the project you want in Android Studio:

```bash
git clone https://github.com/MoshoodSO/OIBSIP.git
# Example: open the Unit Converter
cd OIBSIP/Android-Task1-UnitConverter
# Open the folder in Android Studio and run the app
```

To build from the command line (example):

```bash
cd Android-Task1-UnitConverter
./gradlew assembleDebug
```

---

## System Requirements

- Android Studio (latest recommended)
- JDK 11 or higher
- Android SDK (API 21+; some projects target API 24+)
- Gradle 7+ (project-specific requirements in each module)

---

## Contributing

Contributions are welcome. Suggested workflow:

1. Fork the repository
2. Create a branch: `git checkout -b feature/YourFeature`
3. Make changes and add tests where appropriate
4. Commit and push: `git commit -m "feat: ..." && git push origin feature/YourFeature`
5. Open a Pull Request describing your changes

Please follow Java naming conventions and document non-trivial logic.

---

## License

See the LICENSE file in the repository for license details (MIT suggested per project).

---

## Author

**Moshood Olanrewaju** — https://github.com/MoshoodSO

---

*Last updated: July 30, 2026*
*Version: 1.0.1*
