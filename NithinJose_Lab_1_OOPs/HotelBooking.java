package GreatLearningAssignments.NithinJose_Lab_1_OOPs;

import java.util.Scanner;

enum Occupancy {
    Single,
    Double,
    Triple
}

class Hotel {
    String name;
    String address;

    Hotel(String name, String address){
        this.name = name;
        this.address = address;
    }
}

class Floor {
    String floorNo;
    Hotel hotel;

    Floor(String floorNo, Hotel hotel){
        this.floorNo = floorNo;
        this.hotel = hotel;
    }

    public String toString(){
        return this.floorNo + " floor";
    }
}

class Room {
    int roomNo;
    Occupancy occupancy;
    Floor floor;
    Hotel hotel;
    boolean AC;
    boolean booked;

    Room(int roomNo, Occupancy occupancy, Floor floor, Hotel hotel, boolean ac) {
        this.roomNo = roomNo;
        this.occupancy = occupancy;
        this.floor = floor;
        this.hotel = hotel;
        this.AC = ac;
        this.booked = false;
    }

    public int getPrice(){
        int price = 0;
        switch(this.occupancy){
            case Single:
                price = 2000;
                break;
            case Double:
                price = 3000;
                break;
            case Triple:
                price = 4000;
                break;
        }

        if( this.AC ){
            price += 1000;
        }

        return price;
    }

    public void book(){
        this.booked = true;
    }

    public void vacate(){
        this.booked = false;
    }

    public String toString(){
        String _ac = "non-air conditioned";
        if ( this.AC ){
            _ac = "air conditioned";
        }
        return "Room number: " + this.roomNo + ", " + this.floor + ", " + _ac +
            ", " + this.occupancy + " occupancy";
    }
}


class HotelBooking {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Rosebud Motel", " ");
        Floor fl1 = new Floor("First", hotel1);
        Floor fl2 = new Floor("Second", hotel1);
        
        Room[] rooms = new Room[7];
    
        rooms[0] = new Room(101, Occupancy.Single, fl1, hotel1, true);
        rooms[1] = new Room(102, Occupancy.Double, fl1, hotel1, true);
        rooms[2] = new Room(103, Occupancy.Double, fl1, hotel1, false);
        rooms[3] = new Room(201, Occupancy.Single, fl2, hotel1, true);
        rooms[4] = new Room(202, Occupancy.Single, fl2, hotel1, false);
        rooms[5] = new Room(203, Occupancy.Double, fl2, hotel1, true);
        rooms[6] = new Room(204, Occupancy.Triple, fl2, hotel1, true);

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Boolean ch = true;
        while(ch){
            System.out.println("\n1.Book Rooms\n2.Exit\n");
            int choice = in2.nextInt();
            if (choice == 1){
                ch = true;
            } else {
                ch = false;
            }
            if(ch){
                System.out.println("Enter Room Details: ");
                String input = in.nextLine();
                handleBooking(input, rooms);
            }
        }
        in.close();
        in2.close();
    }

    static void handleBooking(String input, Room[] rooms){
        String[] words = input.split("[\\s']");
        String occupancy = words[0];
        String ac = words[2];
        Boolean ac1 = false;
        if(ac.equalsIgnoreCase("AC")){
            ac1 = true;
        }
        String floor = "";
        if (words.length > 3){
            floor = words[3];
        }
        Boolean foundRoom = false;
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].occupancy.name().equalsIgnoreCase(occupancy)
                 && rooms[i].AC == ac1 
                 && !rooms[i].booked){
                    if(floor != ""){
                        if(rooms[i].floor.floorNo.equalsIgnoreCase(floor)){
                            foundRoom = true;
                        }
                    } else {
                        foundRoom = true;
                    }
                    if(foundRoom){
                        rooms[i].book();
                        System.out.println(
                            rooms[i] + ", Estimated: Rs " + rooms[i].getPrice() + "/ day");
                        break;
                    }
                }
        }
        if(!foundRoom){
            System.out.println(occupancy + " occupancy " + ac + " room not available");
        }

    }

}