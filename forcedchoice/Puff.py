# Success in 0.06s

guess, N = tuple([int(x) for x in input().split()][1:])

for i in range(N):
    vals = [int(x) for x in input().split()][1:]

    if guess in vals:
        print('KEEP')
    else:
        print('REMOVE')
