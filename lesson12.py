
import random

dishes_string = input('What would you like? ')

dishes = set(dishes_string.title().strip().split(' '))

def time():
    return random.randint(0, 1000)
    
for dishes_list in dishes:
        print(dishes_list.ljust(50,'.'), time(), 'min')
