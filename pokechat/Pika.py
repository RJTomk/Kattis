# Success in 0.04s

key = input()
code = input()
code = [int(code[i:i+3]) - 1 for i in range(0, len(code), 3)]

phrase = ''
for c in code:
    phrase += key[c]

print(phrase)