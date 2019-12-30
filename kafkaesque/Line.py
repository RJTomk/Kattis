# Success in 0.05
n = int(input())

times, last = 1, 0
for i in range(n):
    x = int(input())
    if last > x:
        times += 1
    last = x

print(times)
