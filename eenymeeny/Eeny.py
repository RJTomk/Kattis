# Success in 0.02s
interval = len(input().split()) - 1
n = int(input())

teamA = []
teamB = []
names = []

for i in range(n):
    names.append(input())

prevIndex = 0
iLim = n
for i in range(iLim):
    index = (interval + prevIndex) % n
    # print(names[index])
    if (i % 2 == 0):
        teamA.append(names.pop(index))
    else:
        teamB.append(names.pop(index))

    n -= 1
    prevIndex = index

# Print A
l = len(teamA)
print(l)
for i in range(l):
    print(teamA[i])

# Print B
l = len(teamB)
print(l)
for i in range(l):
    print(teamB[i])
