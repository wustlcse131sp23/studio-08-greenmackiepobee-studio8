package studio8;


public class Time {

	private int hour;
	private int minute;
	private boolean militaryTime; 

	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public String getTime()
	{
		if (militaryTime == true)
		{
			return (hour + ": " + minute);
		}
		else 
		{
			if (hour>12) {
				return ((hour-12) + ": " + minute);
			}
		}
		return " ";
	}

	public static void main(String[] args) {


	}

}