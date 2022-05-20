# Success in 0.05s

time = [int(i) for i in input()]

out = ''

for i in range(3, -1, -1):
    for j in range(len(time)):
        n = 2 ** i
        if time[j] / n >= 1.0:
            out += '*'
            time[j] -= n
        else:
            out += '.'
        if j == 0 or j == 2:
            out += ' '
        elif j == 1:
            out += '   '

    if i != 0:
        out += '\n'

print(out)
