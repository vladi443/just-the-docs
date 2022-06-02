---
layout: default
title: Wordle Bot
nav_order: 1
parent: Projects
---

# Wordle Bot 

### *C++ Wordle Solving Algorithm*

---

Wordle Bot is a C++ algorithm that scores words based on their match probability for the popular web game *Wordle*. Wordle Bot recieves a 5-letter input word followed by a 5-digit input number that indicates if the specific character is present in the mystery word. After scoring each word Wordle Bot displayes the top 20 words that match the given pattern. The user can choose one of these words and input it again, followed by a new 5-digit number to represent the pattern of the newly entered word.

Wordle Bot uses a 5-digit number to represent the pattern of the inputed word. 0 indicates that the character at the corresponding location in the word is not present, 1 indicates the character is present but in different location, and 2 indicates the character is present in that exact location. Wordle Bot stores the characters not present in the mystery word to better score and sort words based on their matching probability.

Wordle Bot outputs matching words together with their definition when available, which allows the user to select the most optimal word from the list provided.

Wordle Bot also has an **experimental** option to compute the best starting word. This function calculates the frequency each alphabetical letter is present in the list of words, and constructs new words with the most common letters. This method allows for the starting word to have the highest probability of containing a matching letter.

Wordle Bot provides a debug-mode that allows the user to track a certain word’s score throughout the algorithm, allowing for any scoring bugs/misputs to be traced. Debug-mode can be enabled at the beginning of the program.

Wordle Bot is registered under the GNU GPLv3 software license and its source-code is avaiable on github.

[Wordle Bot Download](../../../executables/WordleBot.exe){: .btn .btn-blue .mr-2}
[Wordle Bot on Github](https://github.com/vladi443/wordle-dictionary-solver/blob/main/README.md){: .btn .mr-2}
[NYTimes Wordle Game](https://www.nytimes.com/games/wordle/index.html){: .btn }

