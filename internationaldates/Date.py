# Success in 0.05s
date = [int(i) for i in input().split('/')]

if date[0] <= 12 and date[1] <= 12:
    print('either')
elif date[1] <= 12:
    print('EU')
elif date[0] <= 12:
    print('US')