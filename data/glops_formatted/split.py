import glob
from random import shuffle

TRAIN_PERCENT = 0.7

fs = glob.glob("csv/*.csv");


for f in fs:
    
    lines = open(f).readlines()
    trainN = int(len(lines) * TRAIN_PERCENT)
    shuffle(lines)
    
    train = lines[:trainN]
    test = lines[trainN:]
    
    open("train/" + f[4:], 'w').write("".join(train))
    open("test/" + f[4:], 'w').write("".join(test))
    
