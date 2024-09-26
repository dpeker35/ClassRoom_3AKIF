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
  
  
 
  
  
  
  
  
  
  
  
  
}
