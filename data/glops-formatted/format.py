import glob

def process(line):
    line = line.split(" ")
    numResponses = int(line[3])
    
    out = [str(int(i)-1) for i in line[4:4+numResponses]]
    assert(len(out) == numResponses)
    
    return ",".join(out) + "\n"    


fs = glob.glob("*.txt")

for f in fs:
    inf = open(f)
    
    outfilename = f.split(".")[0] + ".csv"
    out = open("csv/" + outfilename, 'w')
    for line in inf.readlines():
        out.write(process(line))
        
    out.close()