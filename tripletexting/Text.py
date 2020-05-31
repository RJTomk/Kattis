# Success in 0.05s

line = input()
n = int(len(line) / 3)
words = [line[i:i + n] for i in range(0, len(line), n)]

if words[0] == words[1] or words[0] == words[2]:
    print(words[0])
else:
    print(words[1])
