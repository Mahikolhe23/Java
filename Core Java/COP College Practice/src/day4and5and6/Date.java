package day4and5and6;
//Q3
public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public Date()
	{
	 dd=31;
	 mm=12;
	 yy=96;
	}
	
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void display()
	{
		System.out.println("Day="+dd +" Month ="+mm+" year= 19"+yy);
	}
	 
	public void setter(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public int getDay()
	{
		return dd;
	}
	public int getMonth()
	{
		return mm;
	}
	
	public int getYear()
	{
		return yy;
	}
}
