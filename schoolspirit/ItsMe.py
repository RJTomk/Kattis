# Success in 0.06s

def score_calc(scores):
    n = len(scores)
    sum = 0
    for i in range(n):
        sum += scores[i] * ((4/5) ** i)

    return (1/5) * sum


n = int(input())
scores = [int(input()) for i in range(n)]
sum = score_calc(scores)

print(sum)

avg = 0
for i in range(n):
    small = scores.copy()
    del small[i]
    avg += score_calc(small)

print(avg / n)
