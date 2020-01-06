# Success in 0.08s
n = int(input())
while n > 0:
    n -= 1
    line = input().split(' ')
    name = line[0]
    date_of_start = int(line[1].split('/')[0])
    dob = int(line[2].split('/')[0])
    courses = int(line[3])

    if date_of_start >= 2010:
        print('{} eligible'.format(name))
    elif dob >= 1991:
        print('{} eligible'.format(name))
    elif courses >= 41:
        print('{} ineligible'.format(name))
    else:
        print('{} coach petitions'.format(name))
