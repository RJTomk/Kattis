# Success in 0.05s

line = list(input())
n = 0

while n < len(line) - 1:
    if line[n] == line[n+1]:
        line.pop(n+1)
    else:
        n += 1

print("".join(line))