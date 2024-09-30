public class ClassRoom
{
  private String roomNr;    //consists building floor and room number
  private boolean computer; //are there computer in the rooms
  private int       size;  //number of seats
  private boolean beamer;
  private int windows;
  
  /*
   * Constructor
   * Parameters: Room number, computer, size
   * It creates a new Instance of the class ClassRoom
   */
      
  
  public ClassRoom(String newRoomNr, boolean newComputer, int newSize)
  {
      setRoomNr(newRoomNr);
      setComputer(newComputer);
      setSize(newSize);
  }
  
  
  
  //void means no answer, that's why we don't write "return"
   public void setRoomNr(String newRoomNr)
  {
      roomNr = newRoomNr;
  }
  
  public void setComputer(boolean newComputer)
  {
      computer = newComputer;
  }
  
  public void setSize(int newSize)
  {
      size = newSize;
  }
  
  
  //if we want an answer, then we have put the command "return"
  public String getRoomNr()
  {
      return roomNr;
  }
  //getmethods are public
  public boolean getComputer()
  {
      return computer;
  }
  
  public int getSize()
  {
      return size;
  }
  
  
 
  
  
  
  public void printClassoom()
  {
      System.out.println("Classroom " + roomNr + " - Computer: " + computer + " - " + size + "Students" );
  }
  
  
  
  
  
  
  
}




