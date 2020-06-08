#!/usr/bin/env python
from mfrc522 import SimpleMFRC522
import RPi.GPIO as GPIO
import signal
import time
GPIO.setwarnings(False)

reader = SimpleMFRC522()
try:
	id, text = reader.read()
	print(id)
	dosya = open("/home/pi/Documents/RFID/IcecekAlmaSistemi/rfid.txt","w")
	dosya.write(str(id))
finally:
	GPIO.cleanup()

GPIO.setmode(GPIO.BCM)
GPIO.setup(4,GPIO.OUT)
GPIO.output(4,1)
time.sleep(0.25)
GPIO.output(4,0)
GPIO.cleanup()
