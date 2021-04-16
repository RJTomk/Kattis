# Success in 0.06s

opts = input().split(';')

tot = 0
for v in opts:
    if '-' in v:
        vals = [int(x) for x in v.split('-')]
        tot += vals[1] - vals[0] + 1
    else:
        tot += 1

print(tot)
