# Success in 0.05s
word = input()
wordset = set(word)

print('1' if len(word) == len(wordset) else '0')