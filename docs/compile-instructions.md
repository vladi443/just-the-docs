---
layout: default
title: Compile Code
nav_order: 3
---

# Compile Instructions

---

This tab includes information on how to compile the projects and use them as executable programs. As not every project is using the same programming language, separate instructions will be listed below on how to compile and run each individual code. 

As a student I am still learning and exploring these concepts, so any feedbacks or recomendations are welcome and can be submitted under the Ziggurat Systems Github Repository.

## What is Compiling

Compiling code takes the *Source Code* (human readable) and transforms it into *Machine Code* (computer executable). Compiling code is done through a program called a *Compiler*, which takes the human written source code and converts it into a new language (*Machine Language*) which is understood by the computer. Compiling code is necessary as *Machine Language* code is extremely difficult for people to understand, and therefore the compiler acts as a "translator" from *High Level Language* to the *Machine Langauge* that computers understand.

Compilers have additional jobs such as ensuring your code is **TYPE** and **SYNTACTICALLY** correct. A compiler does not however check if your code is **LOGICALLY** correct.

##### ***Source: https://www.cs.utah.edu/~germain/PPS/Topics/C_Language/compiling_C_programs.html***

## Compile C++ code

### Linux / MacOS

1. Install a GNU C / C++ Compiler
   - First update your libraries by typing `$ sudo apt-get update`.
   - Then install a C / C++ Compiler by typing `$ sudo apt-get install build-essential manpages-dev`.
      - *Note:* If you are using MacOS, a C / C++ Compiler might already be installed, so steps *1* and *2* can be skipped.
2. Verify the installation was successfull
   - To verify the compiler was installed successfully, type `$ gcc --version`.
3. Compile the C++ source code
   - Download the source code and assets for the project you've selected from their Github Repository.
   - Navigate to the folder where you have downloaded the files by typing `$ cd /path/to/file`.
   - In the folder, you can type `$ ls` to verify all of the files are located there.
   - To compile the C++ source code, type `$ gcc source-code.cpp -o executable-file-name`.
     - *Note:* `executable-file-name` can be anything you want. `source-code.cpp` should match the C++ source code's name as you have saved it.
4. Run the compiled code
   - To run the code, make sure you are in the same folder as the program and type `$ ./executable-file-name`.

### Windows

1. Install a GNU C / C++ Compiler
   - Download (MSYS2)[https://www.msys2.org/] from their official website.
      - *Note:* These instructions use MSYS2 to compile C++ code.
      - *Note:* Other compilers will work as well, but beware setup steps may differ.
   - Once downloaded, run the *MSYS2* installer and input desired installation folder.
   - When the installation is complete, run *MSYS2* application which should open a console-like window.
      - *Note:* *MSYS2* offers 32bit and 64bit applications. Make sure you run the appropriate one before continuing.
   - Update *MSYS2* base packages by typing `$ pacman -Syu` in the *MSYS2* console window.
   - If application closes, relaunch it and update additional packages by typing `$ pacman -Syu`.
   - Through the *MSYS2* console, download compiling tools by typing `$ pacman -S --needed base-devel mingw-w64-x86_64-toolchain`.
2. Configure Environmental Variables
   - From *Start* menu, type `Environmental Variables` and open *Edit the Environmental Variables* application.
   - In that window, click on *Environmental Variables* located on the bottom right.
   - From there, locate the bottom variable box named *System Variables* and click on *Path* and then *Edit*.
   - Open a separate *Windows Explorer* window and navigate to the folder where *MSYS2* has been installed.
   - In that folder, open the subfolder *mingw64* and then open the subfolder *bin*. Copy the exact pathway to the *bin* folder.
      - *Example:* C:\example\msys2\mingw64\bin
   - Close the *Window Explorer* window and return to the *Edit Environmental Variables* window.
   - In there, click the *Add* button located on the right side and paste the exact address to the *bin* folder.
   - Once completed, close all *Edit Environmental Variables* windows by either clicking *Ok* or *Apply*.
3. Compile the C++ Source Code
   - Download the source code and assets for the project you've selected from their Github Repository.
   - Open *PowerShell* and navigate to the folder containing the downloaded files by typing `cd C:\path\to\file`.
      - *Note:* You can navigate to the desired folder using *Windows Explorer* and copy the address of the folder from there.
   - Once in the folder, type `ls` to ensure all of the files are present.
   - From that folder, compile the source code by typing `g++ source-code.cpp -o executable-file-name.exe`.
      - *Note:* `executable-file-name` can be anything you want. `source-code.cpp` should match the C++ source code's name as you have saved it.
4. Run the Compiled Code
   - To run the compiled code, either open *PowerShell* and navigate to the folder containing the executable file and type `./executable-file-name.exe`.
   - Or navigate to the folder containing the executable file through *Windows Explorer* and double click on the executable file.
   

