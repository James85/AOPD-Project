JACKOUT = bin/
LIBS = lib/jack.jar:/research/ai/linpa/JACK/lib/jack.jar:lib/climacomms.jar:.:../RACT-GUI/bin/:JACK/:bin/:lib/gui.jar:/opt/Agent_Software/lib/jack.jar

TIMESTAMP = `date +%Y%M%d-%H%M`

clean:
	@echo "====================================================="
	@echo "Cleaning up..."
	@echo "====================================================="
	java -cp $(LIBS) aos.main.JackBuild -wd JACK -c -r -d ../$(JACKOUT)
	@echo "Done cleaning up..."

compile:
	@echo "====================================================="
	@echo "Compiling JACK CLIMA application..."
	@echo "====================================================="
	java -cp $(LIBS) aos.main.JackBuild src -x -r -d $(JACKOUT)  -DJAVACARGS="-target 1.5"
	@echo "Done compiling..."

zip:
	@echo "====================================================="
	@echo "Packing up into a ZIP file..." 
	@echo "====================================================="
	zip -r jacksystem-$(TIMESTAMP).zip climacode.pd JACK/

jar:	
	@echo "====================================================="
	@echo "Packing up jackagt.jar file...." 
	@echo "====================================================="
	jar cf lib/jackagt.jar -C bin rmit -C bin Main.class 

all:	clean	compile	jar
