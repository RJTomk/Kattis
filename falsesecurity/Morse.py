morse_dict = {
    'A': '.-',
    'B': '-...',
    'C': '-.-.',
    'D': '-..',
    'E': '.',
    'F': '..-.',
    'G': '--.',
    'H': '....',
    'I': '..',
    'J': '.---',
    'K': '-.-',
    'L': '.-..',
    'M': '--',
    'N': '-.',
    'O': '---',
    'P': '.--.',
    'Q': '--.-',
    'R': '.-.',
    'S': '...',
    'T': '-',
    'U': '..-',
    'V': '..-',
    'W': '.--',
    'X': '-..-',
    'Y': '-.--',
    'Z': '--..',
    '_': '..--',
    ',': '.-.-',
    '.': '---.',
    '?': '----'
}


def searchmorse(s):
    for let, mor in morse_dict.items():
        if mor is s:
            return let


def swapstring(s):
    ret = ''
    for i in range(len(s) - 1, 0, -1):
        ret += s[i]
    return ret


# To morse
line = input()
morse_line = ''
num_string = ''

for c in line:
    morse = morse_dict[c]
    num_string += str(len(morse))
    morse_line += morse

# Swap!
morse_line = swapstring(morse_line)
num_string = swapstring(num_string)

# Back to reality
i = 0
line = ''
for n_val in num_string:
    n = int(n_val)
    slice = morse_line[i:i+n]
    line += searchmorse(slice)
    i += n
print(line)
