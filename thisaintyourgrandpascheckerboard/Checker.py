# WILL NOT WORK: KATTIS DOES NOT TAKE NUMPY

from numpy import array


def count(v, l):
    n = 0
    for i in l:
        if i == v:
            n += 1
    return n

def threeInRow(l):
    last_val = 'a'
    n = 1
    for v in l:
        if v == last_val:
            n += 1
            if n >= 3:
                return True
        else:
            last_val = v
            n = 1

    return False


n = int(input())

board = []
for i in range(n):
    board.append(list(input()))

isBoard = True
board = array(board)

# print(board[0, :])
# print(board[:, 0])

for i in range(n):
    if threeInRow(board[i, :]) or threeInRow(board[:, i]) or (count('W', board[i, :]) != count('B', board[i, :])) or (count('W', board[:, i]) != count('B', board[:, i])):
        isBoard = False
        break

print(1 if isBoard else 0)
