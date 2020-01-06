# Success in 0.05s
notes = 'A, A#, B, C, C#, D, D#, E, F, F#, G, G#'.split(', ')
interval = [2, 2, 1, 2, 2, 2, 1]


def makeScale(n):
    scale = [notes[n]]
    for i in interval:
        n += i
        n %= len(notes)
        scale.append(notes[n])
    return scale


input()  # Throwaway
song = set(input().split())

scales = []
for i in range(len(notes)):
    scale = set(makeScale(i))
    if song.issubset(scale):
        scales.append(notes[i])


if len(scales) == 0:
    print('none')
else:
    out = ''
    for i in scales:
        out += '{} '.format(i)
    print(out.strip())
