CC= g++
CFLAGS= -c -Wall
LDFLAGS= -lsfml-graphics -lsfml-window -lsfml-system

all: sfml-app

sfml-app: main.o
	$(CC) $< -o $@ $(LDFLAGS)

main.o: main.cpp
	$(CC) $(CFLAGS) $<

clean:
	rm -rf *.o sfml-app
