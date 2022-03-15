# Success in 0.05s

key = [4, 3, 2, 7, 6, 5, 4, 3, 2, 1]
cpr = input()
cpr = cpr[:6] + cpr[7:]
cpr = [int(x) for x in cpr]

sum = 0

for i in range(len(cpr)):
    sum += key[i] * cpr[i]

print(1 if sum % 11 == 0 else 0)
