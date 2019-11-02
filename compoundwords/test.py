correctValues = [line.rstrip('\n') for line in open("comp1.out", 'r')]
pyValues = [line.rstrip('\n') for line in open("out.out", 'r')]

print([i for i in correctValues if i not in pyValues])
