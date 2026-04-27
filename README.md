# Evaluation of LLM-Based Java Code and Test Generation (HumanEval)

## Overview
This repository contains the Phase 1 results for the **BLG 475E Software Quality and Testing** project for the Spring 2025-2026 semester. The study evaluates and compares the performance of **ChatGPT GPT-5.4** and **Gemini 3.1 Pro Preview** in generating Java code and unit tests.

The project moves beyond simple pass/fail metrics by incorporating rigorous software testing methodologies, including branch coverage analysis, test smell detection, and manual black-box testing.

## The Team
* **Cemalcan Sağlam**: Focused on LLM interaction, generating Java solutions, and organizing model output logs.
* **Ayham Alhasan**: Responsible for running JUnit tests, checking branch coverage with Maven/JaCoCo, and reviewing test smells.
* **Najib Attar**: Focused on manual testing, including equivalence class partitioning and boundary value analysis.

## Tech Stack
* **Language**: Java 17.
* **Build Tool**: Maven.
* **Testing**: JUnit 5.
* **Analysis**: JaCoCo for Branch Coverage.
* **Environment**: Visual Studio Code with the Extension Pack for Java.

## Project Structure
The project is organized to allow for a fair and systematic comparison:
* **Model Folders**: Separate directories for ChatGPT and Gemini outputs.
* **Difficulty Tiers**: Tasks are categorized into `easy`, `moderate`, and `hard` folders based on logic complexity.
* **Components**: Each task folder contains the Java solution and its related JUnit test file.
* **Logs**: All interactions with the LLMs are recorded in log files stored within the repository.

## Methodology
1.  **Selection**: 30 prompts were chosen from the Java HumanEval dataset, covering tasks like string handling, numerical operations, and list processing.
2.  **Generation**: A semi-agentic workflow was followed where prompts were manually managed by the group to maintain control and logging.
3.  **Base Testing**: Initial solutions were tested using the dataset's base tests to establish a baseline success rate.
4.  **Test Improvement**:
    * **Branch Coverage**: JaCoCo was used to identify untested decision paths, such as unexecuted sides of an `if` statement.
    * **Manual Assessment**: Equivalence Class Partitioning and Boundary Value Analysis were applied to target edge cases like empty strings, zero values, and threshold boundaries.
    * **Refactoring**: Failed solutions were corrected by providing the LLM with specific feedback, including error logs and uncovered branches.

## Key Results
The following results represent the performance before and after the iterative feedback process:

| Metric | ChatGPT GPT-5.4 | Gemini 3.1 Pro |
| :--- | :--- | :--- |
| **Initial Pass Rate** | 93.33% (28/30) | 83.33% (25/30) |
| **Final Pass Rate** | 100% (30/30) | 100% (30/30) |
| **Initial Branch Coverage** | 80.6% | ~77% |
| **Final Branch Coverage** | 100% | ~99% |

**Key Takeaway**: While ChatGPT GPT-5.4 showed higher initial correctness, both models reached full success once guided by specific testing feedback. This highlights that passing base tests does not guarantee full reliability, and coverage-guided refinement is essential.
