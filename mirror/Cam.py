# Success in 0.08s

nruns = int(input())

for i in range(nruns):
    nrows = int(input().split()[0])
    lines = []
    for j in range(nrows):
        lines.append(input()[::-1])

    print(f"Test {i + 1}")
    for j in range(nrows - 1, -1, -1):
        print(lines[j])