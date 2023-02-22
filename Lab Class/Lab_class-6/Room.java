public class Room {
    int roomNo;
    String roomType;
    float roomArea;
    boolean ACmatchine;
    public Room(){
        System.out.println("Hello,an object of Room class is created.");
    }
    public Room (int roomNo,String roomType,float roomArea,boolean ACmatchine){
        this.roomNo=roomNo;
        this.roomType=roomType;
        this.roomArea=roomArea;
        this.ACmatchine=ACmatchine;
    }
    void displayData(){
        System.out.println(roomNo);
        System.out.println(roomType);
        System.out.println(roomArea);
        System.out.println(ACmatchine);
    }
    public static void main(String[] args){
      Room obj= new Room();
      Room obj2= new Room(814,"Lab",10.25f,false);
      obj2.displayData();
    }
}
