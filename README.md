# COBOL to Java Translator (ANTLR‑Based)

![banner](https://dummyimage.com/1200x250/000/fff\&text=COBOL+→+Java+Modernization+with+ANTLR)

---

## 🔥 Overview

This project demonstrates how a **COBOL program** can be modernized into **Java** using an ANTLR-driven parsing pipeline.

I have worked earlier on **enterprise-scale modernization tools** like **BlueAge**, **Heirloom**, and others. However, I wanted to experience the inner mechanics of modernization by **hand‑crafting the journey using ANTLR** — at least for a small COBOL program — and successfully generate Java code.

This repository contains:

* A simplified yet functional **COBOL grammar (ANTLR)**
* A **Lexer + Parser** generated using ANTLR
* A **Visitor-based Java code generator**
* A working **COBOL → Java translation workflow**

---

## 🛡️ Badges

![ANTLR](https://img.shields.io/badge/ANTLR-4.13.1-blue)
![Java](https://img.shields.io/badge/Java-17-orange)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen)
![License](https://img.shields.io/badge/License-MIT-green)
![GitHub Repo Size](https://img.shields.io/github/repo-size/sakthiks6708/cobol-to-java-translator)
![GitHub Stars](https://img.shields.io/github/stars/sakthiks6708/cobol-to-java-translator?style=social)

---

## 📁 Repository Structure

```
COB-JAVA-NEW/
 ├── CobolFull_fixed.g4                # ANTLR Grammar
 ├── CobolFull_fixedLexer.java         # Generated Lexer
 ├── CobolFull_fixedParser.java        # Generated Parser
 ├── CobolFull_fixedBaseVisitor.java   # Visitor base
 ├── CobolToJavaVisitor.java           # Custom translator logic
 ├── CobolToJavaDriver.java            # Main entry point
 ├── input.cbl                          # COBOL sample program
 └── OutputProgram.java (generated)     # Java output
```

---

## 🧠 High-Level Architecture

```mermaid
flowchart LR
    A[COBOL Source File] --> B[ANTLR Lexer]
    B --> C[ANTLR Parser]
    C --> D[Parse Tree]
    D --> E[Custom Visitor]
    E --> F[Java Code Generator]
    F --> G[OutputProgram.java]
```

---

## 🔁 Translator Pipeline Flow

```mermaid
sequenceDiagram
    participant U as User
    participant G as Grammar (CobolFull_fixed.g4)
    participant L as Lexer
    participant P as Parser
    participant V as Visitor
    participant J as Java Output

    U->>G: Define grammar
    U->>L: Generate lexer via ANTLR
    U->>P: Generate parser via ANTLR
    U->>V: Implement visitor logic
    U->>P: Parse input.cbl
    P->>V: Walk parse tree
    V->>J: Generate OutputProgram.java
```

---

## 🏗️ Steps to Build and Run

### **1. Install ANTLR JAR**

Place `antlr-4.13.1-complete.jar` in your project folder.

### **2. Generate Lexer + Parser**

```
java -jar antlr-4.13.1-complete.jar -visitor CobolFull_fixed.g4
```

### **3. Compile All Java Files**

```
javac -cp .;antlr-4.13.1-complete.jar *.java
```

> On Linux/Mac use `:` instead of `;`

### **4. Run Translator**

```
java -cp .;antlr-4.13.1-complete.jar CobolToJavaDriver
```

This produces:

```
OutputProgram.java
```

---

## 📸 Screenshots 

<img width="1919" height="702" alt="Grammar" src="https://github.com/user-attachments/assets/1b351eba-788c-4ca3-b640-19991799a323" />
<img width="1919" height="1037" alt="INPUT CBL" src="https://github.com/user-attachments/assets/daa633ce-abb0-4931-9cc2-8853a918abc1" />
<img width="1919" height="1029" alt="OutputProgram java" src="https://github.com/user-attachments/assets/a0c4918d-9fa6-4e1f-bc6a-5131ab2f9acb" />
<img width="1919" height="983" alt="github" src="https://github.com/user-attachments/assets/de711958-56f0-4aa8-9c4a-2f7410979d9c" />

<img width="954" height="845" alt="File Structure in Local" src="https://github.com/user-attachments/assets/b98d476a-e208-493d-a59d-3adb6eafa7d4" />

```

Example sections:

* ANTLR generation output
* Successful Java generation
* IDE view of files
* GitHub repository layout

---

## 🧩 Sample COBOL Program

```cobol
       IDENTIFICATION DIVISION.
       PROGRAM-ID. DEMO.

       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  A  PIC X.
       01  B  PIC X.

       PROCEDURE DIVISION.
           DISPLAY 'H'.
           ADD A TO B.
           STOP RUN.
```

---

## 🛠️ Generated Java Output (Sample)

```java
public class OutputProgram {
    public static void main(String[] args) {
        System.out.println("H");
        B = B + A;
    }
}
```

---

## 🤝 Contributing

Pull requests are welcome.

You can:

* Add more COBOL verbs
* Improve grammar
* Add more Java translation cases
* Extend support to files/IO/conditions

---

## 📜 License

This project is licensed under the **MIT License**.

---

## ⭐ Support

If this helped you understand ANTLR or COBOL modernization:
**Star the repository! ⭐**

---

## 🙌 Acknowledgements

* ANTLR by Terence Parr
* COBOL community & modernization experts

---

Happy Modernizing 🚀
