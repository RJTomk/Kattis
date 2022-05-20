# Passed in 0.05s

n = int(input())

vol = 7

for i in range(n):
    order = input()
    if order == "Skru op!" and vol < 10:
        vol += 1
    elif order == 'Skru ned!' and vol > 0:
        vol -= 1

print(vol)