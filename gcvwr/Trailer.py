# Success in 0.05s

l = [int(x) for x in input().split()]
w = (l[0] - l[1]) * 0.9

w -= sum([int(x) for x in input().split()])
print(int(w))
