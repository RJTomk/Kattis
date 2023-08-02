# Success in 0.05s
line = input()

if ':)' in line and ':(' in line:
    print('double agent')
elif ':)' in line:
    print('alive')
elif ':(' in line:
    print('undead')
else:
    print('machine')