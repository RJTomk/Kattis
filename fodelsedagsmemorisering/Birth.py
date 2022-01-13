# Success in 0.09s
n = int(input())

pdict = {}
ndict = {}

for i in range(n):
    line = input().split()
    name = line[0]
    point = int(line[1])
    date = line[2]

    if date in pdict:
        if pdict[date] < point:
            pdict[date] = point
            ndict[date] = name
    else:
        pdict[date] = point
        ndict[date] = name

names = sorted(ndict.values())
print(len(names))
for name in names:
    print(name)
