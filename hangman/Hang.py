word = set(input())
guesses = input()

wrong_guess = 0
for letter in guesses:
    if letter in word:
        word.remove(letter)

        if len(word) == 0:
            print('WIN')
            break
    else:
        wrong_guess += 1
        if wrong_guess == 10:
            print('LOSE')
            break
