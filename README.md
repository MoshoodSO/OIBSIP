# OIBSIP — Android Internship & Data Science Portfolio

[![Repository](https://img.shields.io/badge/repository-OIBSIP-blue)](https://github.com/MoshoodSO/OIBSIP)
[![Languages](https://img.shields.io/badge/languages-Jupyter%20Notebook%20%26%20Java-orange)](https://github.com/MoshoodSO/OIBSIP)
[![License](https://img.shields.io/badge/license-MIT-lightgrey)](./LICENSE)

A curated portfolio of Android applications and Jupyter notebooks created during the Oasis Infobyte Summer Internship Program (OIBSIP). This repository contains three Android Java projects (Task 1, 3, and 4) and numerous Jupyter Notebook files used for demos, analysis, and documentation.

---

## Table of Contents

- [About](#about)
- [Key Features](#key-features)
- [Projects](#projects)
- [Repository Structure](#repository-structure)
- [Quick Start](#quick-start)
- [Installation — Android Projects](#installation---android-projects)
- [Working with the Jupyter Notebooks](#working-with-the-jupyter-notebooks)
- [Usage Examples](#usage-examples)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)
- [Author & Contact](#author--contact)

---

## About

This repository demonstrates small-to-medium Android projects and supporting Jupyter notebooks that document approaches, results, screenshots, and short walkthroughs. The Android apps are implemented in Java and target a range of Android SDK levels; notebooks are used for data analysis and presentation.

---

## Key Features

- Three polished Android projects:
  - Unit converter (multiple categories, history, offline)
  - Calculator (expression parsing with operator precedence)
  - Quiz application (shuffled questions, scoring, feedback)
- Numerous Jupyter notebooks with explanations, outputs, and exported screenshots.
- Clear project READMEs inside each Android project folder with build/run instructions.
- Simple, reproducible Gradle-based builds and standard Android Studio compatibility.

---

## Projects

- Android-Task1-UnitConverter — Unit conversion app (Length, Weight, Temperature, Volume, Area)  
  Path: `Android-Task1-UnitConverter/` — See that folder's README for details.

- Android-Task3-Calculator — Expression-aware calculator (PEMDAS)  
  Path: `Android-Task3-Calculator/` — See that folder's README for details.

- Android-Task4-QuizApplication — Multiple-choice quiz app with score tracking  
  Path: `Android-Task4-QuizApplication/` — See that folder's README for details.

- Data science notebooks — Various `.ipynb` files used for demonstration and analysis. Look for folders named `DataScience-Task*` and `notebooks/`.

---

## Repository Structure (top level)

```
OIBSIP/
├── Android-Task1-UnitConverter/
├── Android-Task3-Calculator/
├── Android-Task4-QuizApplication/
├── DataScience-Task1_ IrisFlowerClassification/
├── DataScience-Task2_UnemploymentAnalysis/
├── DataScience-Task3_CarPricePrediction/
├── README.md                                         # <- this file
├── LICENSE
└── .gitignore
```

Each Android project includes its own `README.md`, source, resources, and build files.

---

## Quick Start

1. Clone the repository:
   ```bash
   git clone https://github.com/MoshoodSO/OIBSIP.git
   cd OIBSIP
   ```

2. Open an Android project in Android Studio (recommended) or build from the command line.

---

## Installation — Android Projects

Prerequisites
- Android Studio (latest recommended)
- JDK 11+
- Android SDK (API 21+; some projects target API 24+ — see each project's README)
- Gradle wrapper included in each Android project (no separate Gradle install required)

Open with Android Studio
1. In Android Studio: File → Open → select the project folder (e.g., `Android-Task1-UnitConverter`).
2. Wait for Gradle sync.
3. Build and run on an emulator or physical device.

Build and install from CLI (example for UnitConverter)
```bash
cd Android-Task1-UnitConverter
# Build debug APK
./gradlew assembleDebug

# Install on an attached device/emulator
./gradlew installDebug
```

If you need to configure the SDK path, set it in `local.properties`:
```
sdk.dir=/path/to/android/sdk
```

---

## Working with the Jupyter Notebooks

Notebooks are provided for demonstrations, outputs, and analysis.

Recommended environment:
- Python 3.8+
- pip or conda

Quick steps:
```bash
# Option A: using pip + JupyterLab
python -m venv .venv
source .venv/bin/activate            # Windows: .venv\Scripts\activate
pip install --upgrade pip
pip install jupyterlab

# Start JupyterLab in the repo root
jupyter lab
```

Open any `.ipynb` file in the browser or with VS Code (Jupyter extension).

If a notebook has external package requirements, create a small `requirements.txt` in that notebook folder or inspect the notebook cells for imports.

---

## Usage Examples

Build and run Unit Converter (Android CLI)
```bash
cd Android-Task1-UnitConverter
./gradlew clean assembleDebug
./gradlew installDebug   # installs to attached device/emulator
```

Run Calculator (Android Studio recommended)
- Open `Android-Task3-Calculator` in Android Studio and press Run.

Example Java snippet (conversion logic pattern used in Unit Converter)
```java
// ConversionManager.java (simplified)
public double convert(double value, String fromUnit, String toUnit, String category) {
    double factor = getConversionFactor(fromUnit, toUnit, category);
    return value * factor;
}
```

Example shell commands to open notebooks:
```bash
cd DataScience-Task3_CarPricePrediction
jupyter lab
# then open CarPricePrediction.ipynb in the browser
```

---

## Technologies Used

- Java (Android apps)
- Android SDK & AndroidX libraries
- Gradle (wrapper included)
- Jupyter Notebook / JupyterLab (Python notebooks)
- (Optional) Python data libraries depending on notebook: pandas, matplotlib, scikit-learn, seaborn

---

## Contributing

Contributions, improvements, and bug reports are welcome.

Suggested workflow:
1. Fork the repository.
2. Create a branch:
   ```bash
   git checkout -b feature/your-feature
   ```
3. Make changes, add tests if applicable.
4. Commit and push:
   ```bash
   git commit -m "feat: improve X"
   git push origin feature/your-feature
   ```
5. Open a Pull Request describing your changes.

Please follow conventional Java/Android coding styles for the Android projects and sensible notebook hygiene for `.ipynb` files (clear markdown cells and small, focused cells).

---

## License

This repository is provided under the MIT License. See the `LICENSE` file for full terms.

Short summary: you are free to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the software under the conditions described in the LICENSE file.

---

## Author & Contact

**Moshood Olanrewaju** — https://github.com/MoshoodSO

Repository: https://github.com/MoshoodSO/OIBSIP  
Issues & feedback: https://github.com/MoshoodSO/OIBSIP/issues

---

*Last updated: 2026-08-05*
