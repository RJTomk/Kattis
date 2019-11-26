# Success in 0.02s
aScore = 0
bScore = 0
tie = False

line = input()
for i in range(0, len(line), 2):
    if (line[i] == 'A'):
        aScore += int(line[i + 1])
    else:
        bScore += int(line[i + 1])

    if aScore == bScore and aScore == 10:
        tie = True

    if tie == True:
        if aScore >= bScore + 2:
            print('A')
            break
        elif bScore >= aScore + 2:
            print('B')
            break
    else:
        if aScore >= 11:
            print('A')
            break
        elif bScore >= 11:
            print('B')
            break
