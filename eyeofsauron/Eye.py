# Success in 0.05s

line = input()

left, right = 0, 0
for i in range(len(line)):
    if line[i] == '|':
        left += 1
    else:
        right = len(line) - i - 2
        break

print('correct' if left == right else 'fix')
