# Success in 0.02s
values = [int(i) for i in input().split(' ')]
questions = values[:-1]
n = values[-1]

print('YES' if (0 not in questions) and (sum(questions) >= n) and (n >= 3) else 'NO')
