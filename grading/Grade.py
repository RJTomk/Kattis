# Success in 0.05s
letters = ['A', 'B', 'C', 'D', 'E']

separators = [int(i) for i in input().split()]
n = int(input())
val = 'F'

for i in range(len(separators)):
    if n >= separators[i]:
        val = letters[i]
        break

print(val)