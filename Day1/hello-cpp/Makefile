all: bin/main.o bin/hello.o
	g++ bin/main.o bin/hello.o -o bin/hello.exe

bin/main.o: source/main.cpp
	g++ -c source/main.cpp -o bin/main.o

bin/hello.o: source/hello.cpp
	g++ -c source/hello.cpp -o bin/hello.o


clean:
	rm -f bin/*.o bin/*.exe
