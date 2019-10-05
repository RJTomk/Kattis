# Success in 0.02s
def isVowelOtherThanE(c):
    return c in ['a', 'o', 'i', 'u']


inp = input().split()
name = inp[0]
last = inp[1]

if name[-1] == 'e':
    print("{}x{}".format(name, last))
elif isVowelOtherThanE(name[-1]):
    print("{}ex{}".format(name[:-1], last))
elif name[-2:] == 'ex':
    print(name+last)
else:
    print("{}ex{}".format(name, last))
