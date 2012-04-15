from itertools import product
out = open("allresponse.txt", 'w')
x = [a for i in range(1,21) for a in product((0,1), repeat=i)]

for i in x:
    out.write(",".join(map(str, i)) + "\n")
    
out.close()