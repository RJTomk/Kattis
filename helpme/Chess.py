# Success in 0.05s
pieces = {'K': [], 'Q': [], 'R': [], 'B': [], 'N': [], 'P': [], 'k': [], 'q': [], 'r': [], 'b': [], 'n': [], 'p':[]}
cols = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']

for i in range(8):
    input()
    line = input().split('|')[1:-1]
    for j in range(8):
        char = line[j][1]
        if char.isalpha():
            pieces[char].append('{}{}{}'.format(char.upper() if char.upper() != 'P' else '', cols[j], 8-i))
        
for piece, spot in pieces.items():
    if piece.isupper():
        spot.sort(key=lambda x: (int(x[-1]), x[-2]))
    else:
        spot.sort(key=lambda x: (-int(x[-1]), x[-2]))

print('White: {}'.format(','.join(pieces['K'] + pieces['Q'] + pieces['R'] + pieces['B'] + pieces['N'] + pieces['P'])))
print('Black: {}'.format(','.join(pieces['k'] + pieces['q'] + pieces['r'] + pieces['b'] + pieces['n'] + pieces['p'])))
