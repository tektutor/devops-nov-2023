all: bin/main.o bin/hello.o
	mkdir -p bin
	g++ bin/main.o bin/hello.o -o bin/hello.exe

bin/main.o: source/main.cpp
	mkdir -p bin
	g++ -c source/main.cpp -o bin/main.o

bin/hello.o: source/hello.cpp
	mkdir -p bin
	g++ -c source/hello.cpp -o bin/hello.o


clean:
	rm -f bin/*.o bin/*.exe
