from itertools import product
"""
This module generates strings of responses to be fed to KT for
rainbow table generation.  Since these files can be big, 
they are gzip compressed by default.
"""

import gzip

COMPRESS = True
COMPRESS_LEVEL = 9

def generateUpToT(t=20):
    """Generates boolean response strings of length 1...t"""
    
    x = [",".join(map(str,a)) for i in range(1,t) for a in product((0,1), repeat=i)]
    x = "\n".join(x)
    
    if COMPRESS:
        fname = "responseTo" + str(t) + ".gz"
    else:
        fname = "responseTo" + str(t) + ".txt"
    
    
    out = gzip.open(fname, 'wb')
    out.write(x)
    out.close()



def generateOnlyT(t=20):
    """Generates boolean response strings of length t
    If you are using the *memo methods of KT, use this"""
    
    x = [",".join(map(str,a)) for a in product((0,1), repeat=t)]
    x = "\n".join(x)
    
    if COMPRESS:
        fname = "responseAt" + str(t) + ".gz"
    else:
        fname = "responseAt" + str(t) + ".txt"
    

    out = gzip.open(fname, 'wb')
    out.write(x) 
    out.close()    
    
    
if __name__ == "__main__":
    generateOnlyT()