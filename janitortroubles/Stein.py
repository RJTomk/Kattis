# Success in 0.06s
a, b, c, d = [int(i) for i in input().split()]

s = (a + b + c + d) / 2
k = (s - a) * (s - b) * (s - c) * (s - d)
area = k ** (1/2)

print(area)