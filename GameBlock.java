
public class GameBlock {

	
	public static final int WOOD = 1;
	public static final int STEEL = 2;
	public static final int STONE = 3;
	public static final int WALL = 9;
	public static final int OPEN_SPACE = 0;
	//IMPORTANT 
	public static final int USER_LOC = 7;
	
	public int type = -1;
	
	public GameBlock(int useType){
		this.type = useType;
		
	}
	
	public int getType(){
		return this.type;
	}
	public String getTypeString(){
		switch(this.type){
		case WOOD: return "WOOD";
		case STEEL: return "STEEL";
		case STONE: return "STONE";
		case WALL: return "USER_LOC";
		default: return "WALL";
		
		}
	}
	
	public void changeType(int newType){
		if(newType!=this.type && (newType == WOOD || newType == STEEL || newType == STONE || newType == WALL || newType == USER_LOC || newType==OPEN_SPACE) )
		this.type = newType;
		
	}
}
