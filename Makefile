compile:
	cd src && javac App.java

run:
	cd src && java App

app:
	make compile && make run 