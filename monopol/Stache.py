# Success in 0.05s
probs = [1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1]

hotels = int(input())
spaces = set([int(i) for i in input().split()])

chance = 0
for i in spaces:
    chance += probs[i-2]

print(chance/36)