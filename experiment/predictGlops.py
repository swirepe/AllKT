import subprocess
from glob import glob
import os
import sys

vmsize = "-Xmx1911m"

settings = glob("glops/*.settings")

for setting in settings:
    

    print "[Python] Starting experiment", setting    
    subprocess.call(["java", vmsize, "-jar", "../jar/main.jar", setting])
