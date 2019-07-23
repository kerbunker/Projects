# -*- coding: utf-8 -*-
"""
Created on Tue Jul 23 13:54:23 2019

@author: Katelyn
"""
from random import seed
from random import randint

def roll_dice(num):
    value = randint(1, num)
    print (value)
    
seed()
descision = False
while (descision == False):
    num = input("What number sided die do you want to roll?(4, 6, 8, 12, 20, 100) ")
    if num.isdigit():
        num = int(num)
        if num == 4 or num == 6 or num == 8 or num == 12 or num == 20 or num == 100:
            roll_dice(num)
            
        else:
            print ("That is not a valid dice number")
        
    else:
        print ("You need to enter a number")
    
    answered = False
    while answered == False:
        ans = input("Do you want to roll again?(yes/y or no/n) ")
        ans = ans.lower()
        if ans == "no" or ans == "n":
            descision = True
            answered = True
        elif ans == "yes" or ans == "y":
            descision = False
            answered = True
        else:
            print ("That is not a valid answer. Please answer yes or no.")
        
    

