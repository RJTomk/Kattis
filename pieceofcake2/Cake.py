# Success in 0.02s
def max(a, b):
    return a if a > b else b


line = input().split(' ')
side = int(line[0])
h = int(line[1])
v = int(line[2])

print(max(side - h, h) * max(side - v, v) * 4)
