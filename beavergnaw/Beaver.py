# Success in 0.05s

from math import pi

while True:
    line = input().split(' ')
    D, V = int(line[0]), int(line[1])

    if D == 0 and V == 0:
        break

    print(((((-6) * V) / pi) + (D * D * D)) ** (1 / 3))
