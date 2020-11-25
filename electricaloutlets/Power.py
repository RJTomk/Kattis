# Success in 0.06s

N = int(input())

for i in range(N):
    values = input().split(' ')
    values = [(int(i)) for i in values][1:]

    outlets = 0
    for val in values:
        outlets += val - 1

    print(outlets + 1)
