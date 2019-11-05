# Success in 0.04s

line = input().split(' ')
np = int(line[0])
nd = int(line[1])

a_votes = [0 for i in range(nd)]
b_votes = [0 for i in range(nd)]

for i in range(np):
    line = input().split(' ')
    d = int(line[0]) - 1
    a_votes[d] += int(line[1])
    b_votes[d] += int(line[2])

a_waste_tot, b_waste_tot = 0, 0
for i in range(nd):
    median = ((a_votes[i] + b_votes[i]) // 2) + 1
    a_waste, b_waste =0, 0

    if a_votes[i] > b_votes[i]:
        a_waste = a_votes[i] - median
        b_waste = b_votes[i]
    else:
        a_waste = a_votes[i]
        b_waste = b_votes[i] - median

    a_waste_tot += a_waste
    b_waste_tot += b_waste

    print("{} {} {}".format('A' if a_votes[i] > b_votes[i] else 'B', a_waste, b_waste))
print(abs(a_waste_tot - b_waste_tot) / (sum(a_votes) + sum(b_votes)))
