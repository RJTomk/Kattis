# Success in 0.07s

n = int(input())

count = 0

for i in range(n):
    word = input().lower()
    if 'pink' in word or 'rose' in word:
        count += 1

print("{}".format(count if count > 0 else "I must watch Star Wars with my daughter"))
