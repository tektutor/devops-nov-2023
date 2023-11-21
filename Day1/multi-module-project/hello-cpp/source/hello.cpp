#include "hello.h"

Hello::Hello() {
	std::cout << "Hello constructor ..." << std::endl;
}

Hello::~Hello() {
	std::cout << "Hello destructor ..." << std::endl;
}

std::string Hello::sayHello() {
	return "Hello World!";
}
