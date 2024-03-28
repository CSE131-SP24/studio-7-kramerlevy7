package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	
	public Rectangle(int newLength, int newWidth) {   //constructor
		this.length=newLength;
		this.width=newWidth;

}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int area() {
		return length*width;
	}
	public int perimter(){
		return length*2+width*2;
	}
	
	public boolean isSquare() {
		return length==width;
	}
	
	public boolean largerRectangle(Rectangle newRectangle) {
		return (newRectangle.getWidth()*newRectangle.getLength())>(this.getWidth()*this.getLength());       //this is for the object we are now using
		
	}
}
