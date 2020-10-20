package pkgShape;

import java.util.ArrayList;

import java.util.Comparator;



public class Rectangle extends Shape {
		ArrayList<Integer>list=new ArrayList<>();
		private int iLength;
		private int iWidth;
		public Rectangle(int iLength,int iWidth) {
			
			this.iLength=iLength;
			this.iWidth=iWidth;
			
		}
	


	public double area() {
		
		return this.getiLength()*this.getiWidth();
		
	}


	public int compareTo(Object ob) {
		
		Rectangle other=(Rectangle)ob;
		if (ob instanceof Rectangle) {
			return (int)(this.area()-other.area());
			
			
		}
		else {
			return 0;
		}
		

		
	}
	
	
	
    
	public ArrayList<Integer> getList() {
		return list;
	}
	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	public class SortByArea implements Comparator<Rectangle> {

		@Override
		public int compare(Rectangle o1, Rectangle o2) {
			
			return (int)(o1.area()-o2.area()) ;
		}
			
	}
	
    public double area(int iLength, int iDepth) {
		
	return iLength*iWidth;
		
	}


	
    public double perimeter(int iLength, int iWidth) {
		
	return (iLength+iWidth)*2;
	}



    
    public double perimeter() {
	return (this.getiLength()+this.getiWidth())*2;
    }
	

		
}
