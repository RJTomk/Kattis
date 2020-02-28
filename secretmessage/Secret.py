# Success in 0.12s

from math import sqrt, ceil

n = int(input())

while n > 0:
    n -= 1

    line = input()
    length = len(line)
    square_size = ceil(sqrt(length))

    line += '*' * (square_size ** 2 - length)

    grid = []

    i = 0
    for x in range(square_size):
        grid.append(line[i:i + square_size])
        i += square_size

    res = ''
    for x in range(square_size):
        for y in range(square_size - 1, -1, -1):
            c = grid[y][x]
            res += c if c != '*' else ''

    print(res)
