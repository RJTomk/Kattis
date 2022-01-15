# Success in 0.05s
white = input().split()[-1].split(',')
black = input().split()[-1].split(',')
board = [['' for j in range(8)] for i in range(8)]

if ':' in white[0]:
    white = []
if ':' in black[0]:
    black = []

for i in range(0, 8, 2):
    for j in range(8):
        board[i][j] = '...' if j % 2 == 1 else ':::'
        board[i+1][j] = '...' if j % 2 == 0 else ':::'

for i in range(len(white)):
    piece, col, row = white[i][0] if len(white[i]) == 3 else 'P', ord(white[i][-2])-97, int(white[i][-1]) - 1
    spot_colour = board[row][col][0]
    board[row][col] = '{}{}{}'.format(spot_colour, piece, spot_colour)

for i in range(len(black)):
    piece, col, row = black[i][0].lower() if len(black[i]) == 3 else 'p', ord(black[i][-2])-97, int(black[i][-1]) - 1
    spot_colour = board[row][col][0]
    board[row][col] = '{}{}{}'.format(spot_colour, piece, spot_colour)

board.reverse()
print('+---+---+---+---+---+---+---+---+')

for row in board:
    print('|{}|'.format('|'.join(row)))
    print('+---+---+---+---+---+---+---+---+')
