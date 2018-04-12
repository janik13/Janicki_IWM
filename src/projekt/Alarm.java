package projekt;

public class Alarm extends Packet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7045404081555149395L;
	protected int channelNr;
	protected double threshold;
	protected int direction;
	
	public Alarm()
	{
		super();
		channelNr = 0;
		threshold = 1;
		direction = 0;
	}
	
	public Alarm( String devN, String desc, long dt, int chanNr, double thres, int dir )
	{
		super(devN,desc,dt);
		channelNr = chanNr;
		threshold = thres;
		direction = dir;
		
	}
	public String toString()
	{
		return super.toString() + " Channel: " + channelNr + " Threshold: " + threshold + " Direction: " + direction;
	}

}
