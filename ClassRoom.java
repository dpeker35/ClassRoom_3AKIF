public class ClassRoom
{
    private String  roomNr;     // consists of building floor and room number
    private boolean computer;   // are there computers in the room
    private int     size;       // number of seats
    private University university;

    /*
     * Constructor
     * Parameters: Room number, computer, size
     * It is creating a new Insatance of the class ClassRoom
     */
    public ClassRoom(String roomNr, boolean computer, int size)
    {
        setRoomNr(roomNr);
        setComputer(computer);
        setSize(size);
    }
    
    public ClassRoom(String roomNr, boolean computer)
    {
        setRoomNr(roomNr);
        setComputer(computer);
        setSize(25);
    }
    
    public ClassRoom(String roomNr)
    {
        setRoomNr(roomNr);
        setComputer(false);
        setSize(25);
    }

    public ClassRoom()
    {
        setRoomNr("A.4.11");
        setComputer(false);
        setSize(25);
        
    }
  
    public void setRoomNr(String roomNr)
    {
        // set the property roomNr to the value of the parameter newRoomNr
        if(roomNr != null)
        {
           this.roomNr = roomNr; 
        }
        else
        {
            System.out.println("Error: no valid room number!");
            this.roomNr = "A.4.11";
        }
    }
        
    
    
    public void setComputer(boolean computer)
    {
        this.computer = computer;
    }
    
    public void setSize(int size)
    {
        if((size >=10) && (size <= 40))
        {
        this.size = size;
        }
        else
        {
            System.out.println("Erorr: wrong size. Should be between 10 and 40!");
            this.size = 25;
        }
    }
    
    public void setUniversity(University university)
    {
        this.university = university;
    }
    
    public String getRoomNr()
    {
        return roomNr;
    }
        
    
    
    public boolean getComputer()
    {
        return computer;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public University getUniversity()
    {
        return university;
    }
    
    public String getFloor()
    {
        //0123456789
        //A.5.20
        //Extra.2.22
        
      int pos1;
      int pos2;
      String floor;
      
      
        
        //1
        //5
        pos1 = roomNr.indexOf(".") + 1;
        pos2 = roomNr.indexOf(".", pos1);
        floor = roomNr.substring(pos1,pos2);
        
        return floor;
       
    }
    
    public void printClassRoom()
    {
        if (computer == true)
        {
            System.out.println("Classroom " + roomNr + " - Computer - " + " - " + size + " Students");
        }
        else
        {
            System.out.println("Classroom " + roomNr + " - no Computer - " + " - " + size + " Students");
        }
    }
}















