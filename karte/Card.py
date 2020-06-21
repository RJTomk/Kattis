# Success in 0.05s

P = [False for i in range(13)]
K = [False for i in range(13)]
H = [False for i in range(13)]
T = [False for i in range(13)]

line = input()
greska = False

for i in range(0, len(line), 3):
    suit = line[i]
    val = int(line[i+1:i+3])

    if suit == 'P':
        if P[val - 1]:
            greska = True
            break
        else:
            P[val - 1] = True
    elif suit == 'K':
        if K[val - 1]:
            greska = True
            break
        else:
            K[val - 1] = True
    elif suit == 'H':
        if H[val - 1]:
            greska = True
            break
        else:
            H[val - 1] = True
    elif suit == 'T':
        if T[val - 1]:
            greska = True
            break
        else:
            T[val - 1] = True

if greska:
    print("GRESKA")
else:
    nP = len([0 for i in P if i is False])
    nK = len([0 for i in K if i is False])
    nH = len([0 for i in H if i is False])
    nT = len([0 for i in T if i is False])

    print("{} {} {} {}".format(nP, nK, nH, nT))
