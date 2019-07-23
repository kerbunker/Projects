# -*- coding: utf-8 -*-
"""
Created on Tue Jul 23 16:23:11 2019

@author: Katelyn
"""

from random import seed
from random import randint

rock = 1
paper = 2
scissors = 3
valid = True

user_move = input("What is your move(rock/r, paper/p, or scissors/s)? ")
user_move = user_move.lower()
if user_move == "rock" or user_move == "r":
    user_move = rock
elif user_move == "paper" or user_move == "p":
    user_move = paper
elif user_move == "scissors" or user_move == "s":
    user_move = scissors
else:
    valid = False
    print ("That is not a valid response.")
seed()
comp_move = randint(1, 3)

if valid and comp_move == rock:
    if user_move == rock:
        print ("Tie! You both picked rock!")
    elif user_move == scissors:
        print("You Lose! Rock beats scissors.")
    else:
        print ("You win! Paper beats rock!")
elif valid and comp_move == paper:
    if user_move == paper:
        print ("Tie! You both picked paper!")
    elif user_move == rock:
        print("You Lose! Paper beats rock.")
    else:
        print ("You win! Scissors beats paper!")
elif valid:
    if user_move == scissors:
        print ("Tie! You both picked scissors!")
    elif user_move == paper:
        print("You Lose! Scissors beats paper.")
    else:
        print ("You win! Rock beats scissors!")
        