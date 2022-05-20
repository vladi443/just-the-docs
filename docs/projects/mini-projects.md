---
layout: default
title: Mini Projects
nav_order: 3
parent: Projects
---

# Mini Projects

This tab is dedicated to any small projects I have worked on usually out of interest. The projects listed here can be edited, used and shared just like the other ones through their Github Repositories.

---

## Primal Bot

Primes is a C++ algorithm that finds all prime numbers between 10,000 - 99, 999 and scores their match probability for the web game _Primel_. Primes recieves a 5-digit input prime number followed by a 5-digit input number that indicates wheter the specific digit is present in the mystery prime number. Primes would use that information to score the remaining prime numbers accordingly and present the newly updates scores. Primes would continue this proccess until the user indicates the prime number has been found.

Similarly to Wordle Dictionary, Primes uses a 5-digit number to represent the pattern of the inputed prime number. Unlike Wordle Dictionary however, both input and output for Primes can be a single digit, without space separation between the individual charachters. Primes uses the same output scheme as Wordle Dictionary to represent the pattern of the inputted prime number, which is a 0 for the digit is not present in the mystery prime number, 1 for the digit is present in the mystery prime number but in a different location, and 2 to represent the digit is present at the corresponding location of the mystery prime number.

Primes has a BETA option that computes the best starting prime number, which is rated based on the most used digits in the list of prime numbers. Primes also scores prime numbers based on the uniqueness of their digits, meaning 19237 would be rated slightly higher than 10007.

Primes is registered under the GNU GPLv3 software license and its source-code is available on github.
