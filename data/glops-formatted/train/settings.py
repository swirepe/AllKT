from glob import glob
fs = glob('*.csv')
for f in fs:
	if "csv" in f:
		out = open(f + ".settings", 'w')
		out.write("threads=32\n")
		out.write("train=glops-formatted/train/" + f + "\n")
		out.write("test=glops-formatted/test/" + f + "\n")
		out.write("traincompressed=false\n")
		out.write("testcompressed=false\n")
		out.close()