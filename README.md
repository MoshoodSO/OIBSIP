# OIBSIP - Android Internship Portfolio

[![Repository](https://img.shields.io/badge/repository-OIBSIP-blue)](https://github.com/MoshoodSO/OIBSIP)
[![Languages](https://img.shields.io/badge/languages-Jupyter%20Notebook%20%26%20Java-orange)](https://github.com/MoshoodSO/OIBSIP)

A concise portfolio containing Android applications developed during the Oasis Infobyte Summer Internship Program (OIBSIP) plus supporting Jupyter Notebooks used for notes, demonstrations, and exported outputs. This top-level README summarizes the repository contents, recent modifications, and the current file/directory structure.

## Table of Contents

- [Overview](#overview)
- [What's changed (high level)](#whats-changed-high-level)
- [Projects](#projects)
- [Repository structure](#repository-structure)
- [Quick start](#quick-start)
- [Working with the Jupyter Notebooks](#working-with-the-jupyter-notebooks)
- [System requirements](#system-requirements)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

---

## Overview

This repository contains three self-contained Android projects (written in Java) and a large collection of Jupyter Notebook files used to document, demonstrate, or capture outputs related to the projects. The repository language breakdown shows Jupyter Notebooks as the primary file type by size/percentage and Java for the Android modules.

Projects included:

- Android-Task1-UnitConverter — Unit conversion app (Length, Weight, Temperature, Volume, Area)
- Android-Task3-Calculator — Scientific-style calculator with expression parsing
- Android-Task4-QuizApplication — Interactive multiple-choice quiz app

Each Android project folder contains its own README with installation and usage instructions. Notebook files (\*.ipynb) are used for notes, screenshots, step-by-step demonstrations, or exported markdown/html artifacts.

---

## What's changed (high level)

- Documented the repository's current composition (Jupyter notebooks are the majority of files by language stats).
- Consolidated and clarified the top-level README to point to each project's README and to explain how to open/run the Jupyter notebooks.
- Updated system requirements and quick-start steps for both Android projects and notebooks.
- Bumped documentation version and last-updated timestamp.

---

## Projects

### Android-Task1-UnitConverter
See: Android-Task1-UnitConverter/README.md — a user-friendly unit converter supporting multiple categories and real-time conversion.

### Android-Task3-Calculator
See: Android-Task3-Calculator/README.md — a calculator app that evaluates full expressions and respects operator precedence.

### Android-Task4-QuizApplication
See: Android-Task4-QuizApplication/README.md — a multiple-choice quiz application with shuffled questions, feedback, and score tracking.

---

## Repository structure (top level)

This is a simplified view of the top-level layout. Each project contains its own internal structure and README.

```
OIBSIP/
├── Android-Task1-UnitConverter/      # Java Android project + README
├── Android-Task3-Calculator/         # Java Android project + README
├── Android-Task4-QuizApplication/    # Java Android project + README
├── notebooks/                         # Jupyter Notebooks: demos, notes, exported outputs (may be top-level or inside task folders)
├── README.md                          # This file
├── LICENSE
└── .gitignore
```

Note: if your repository places notebooks inside each task folder instead of a single `notebooks/` directory, browse the tree with `git ls-tree` or on GitHub to find the exact locations.

---

## Quick start

Clone the repository and open the project or notebook you want to run.

```bash
git clone https://github.com/MoshoodSO/OIBSIP.git
cd OIBSIP
# To work on an Android project, change into that folder, e.g.:
cd Android-Task1-UnitConverter
# Open the folder in Android Studio and run the app
```

To build an Android app from the command line (example):

```bash
cd Android-Task1-UnitConverter
./gradlew assembleDebug
```

---

## Working with the Jupyter Notebooks

The repository includes Jupyter Notebook files (\*.ipynb). To open them:

- Option 1: Use Jupyter Lab / Notebook
  - Install Jupyter: `pip install jupyterlab` or use Anaconda
  - Start: `jupyter lab` or `jupyter notebook` and navigate to the repository folder

- Option 2: Use VS Code
  - Install the Python and Jupyter extensions
  - Open the `.ipynb` file directly in the editor

Notebooks typically include demonstrations, screenshots, step-by-step notes, or exported results that accompany each Android task.

---

## System requirements

- Android Studio (recommended) for Android projects
- JDK 11 or higher
- Android SDK (API 21+; some projects target API 24+)
- Gradle 7+ (project-specific requirements in each module)
- Python 3.8+ and Jupyter for opening notebooks (if you want to run or edit them)

---

## Contributing

Contributions are welcome. Suggested workflow:

1. Fork the repository
2. Create a branch: `git checkout -b feature/YourFeature`
3. Make changes and add tests where appropriate
4. Commit and push: `git commit -m "feat: ..." && git push origin feature/YourFeature`
5. Open a Pull Request describing your changes

Please follow Java naming conventions for Android code and PEP8 / notebook best practices for Python/Jupyter content.

---

## License

See the LICENSE file in the repository for license details.

---

## Author

**Moshood Olanrewaju** — https://github.com/MoshoodSO

---

*Last updated: August 04, 2026*
*Version: 1.0.2*
