package main

import (
	"log"
	"os"

	"google.golang.org/protobuf/proto"
)

func main() {
	log.Println("ProtoTest")

	Message1 := &SimpleMessage{
		Name:          "Yash Chauhan",
		Email:         "iyashjayesh@gmail.com",
		Age:           30,
		IsAProgrammer: true,
	}

	log.Println("Message1 Name: ", Message1.Name)
	log.Println("Message1 Email: ", Message1.Email)
	log.Println("Message1 Age: ", Message1.Age)
	log.Println("Message1 IsAProgrammer: ", Message1.IsAProgrammer)

	data, err := proto.Marshal(Message1)

	var Message2 SimpleMessage
	err = proto.Unmarshal(data, &Message2)
	if err != nil {
		log.Println("Error: ", err)
	}

	log.Println("Message2 Name: ", Message2.Name)
	log.Println("Message2 Email: ", Message2.Email)
	log.Println("Message2 Age: ", Message2.Age)
	log.Println("Message2 IsAProgrammer: ", Message2.IsAProgrammer)

	//store the byteArray in the txt file
	file, err := os.Create("binary.txt")
	if err != nil {
		log.Fatalln(err)
	}
	defer file.Close()

	//write data to file
	_, err = file.Write(data)
	if err != nil {
		log.Fatalln(err)
	}
}

// used to generate the go code for the proto file
// protoc --go_out=. *proto
