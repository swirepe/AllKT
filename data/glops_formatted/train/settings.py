from glob import glob
fs = glob('*.csv')
for f in fs:
	if "csv" in f:
		out = open("../../../experiment/glops/" + f + ".settings", 'w')
		out.write("threads=32\n")
		out.write("train=../data/glops_formatted/train/" + f + "\n")
		out.write("test=../data/glops_formatted/test/" + f + "\n")
		out.write("traincompressed=false\n")
		out.write("testcompressed=false\n")
		out.write("model=KTStorageless\n")
		out.write("collection=PagingKTCollection\n")
		out.write("predictminus1=true")
		out.close()