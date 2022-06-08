# Success in 0.06s

n, step = tuple([int(i) for i in input().split()])
line = [int(i) for i in input().split()]

print(' '.join(map(str, line[step - 1::step])))