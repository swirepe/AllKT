import subprocess
from glob import glob
import os
import sys

vmsize = "-Xmx1070m"

settings = glob("glops/*.settings")

for setting in settings:
    

    print "[Python] Starting experiment", setting    
    subprocess.call(["java", vmsize, "-jar", "../jar/main.jar", setting])
