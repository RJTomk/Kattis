notes = 'A, A#, B, C, C#, D, D#, E, F, F#, G, G#'.split(', ')
interval = [2, 2, 1, 2, 2, 2, 1]


def getScale(n):
    scale = [notes[n]]
    for jump in interval:
        n += jump
        n %= len(notes)
        scale.append(notes[n])

    return set(scale)


input()  # throwaway
song = set([i for i in input().split(' ')])
scales = []
for i in range(len(notes)):
    scale = getScale(i)
    if song.issubset(scale):
        scales.append(notes[i])

if len(scales) == 0:
    print('none')
else:
    output = ''
    for i in scales:
        output += "{} ".format(i)
    print(output.strip())
