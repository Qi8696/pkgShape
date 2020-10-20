package pkgShape;


import java.util.Comparator;


public class Cuboid extends Rectangle{
	private int iLength;
	private int	iWidth;
	private int iDepth;
	
	public Cuboid (int iWidth, int iLength, int iDepth) {
		super(iLength, iWidth);
		this.iWidth=iWidth;
		this.iLength=iLength;
		this.iDepth=iDepth;
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

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double area(int iLength,int iDepth,int iWidth) {
		// TODO Auto-generated method stub
		double c=(iWidth*iDepth)*2+(iLength*iWidth)*2+(iDepth*iLength)*2;
	    System.out.println(c);
	    return c;
		
	}
	
	public double volume(int iLength,int iDepth,int iWidth)throws UnsupportedOperationException {
	
		
		return this.getiLength()*this.getiDepth()*this.getiWidth();
	    
	    
	 
	}
	public double perimeter() {
		return (this.getiDepth()+this.getiLength()+this.getiWidth())*4;
	}
		 
		 
		
	public int compareTo(Object obj)throws UnsupportedOperationException {
		
		Cuboid other=(Cuboid)obj;;
		if (obj instanceof Rectangle) {
			return (int)(this.volume(iLength,iDepth,iWidth)-other.volume(iLength,iDepth,iWidth));
				
			}else {
				return 0;
			
		}
		
	  
	}
	public class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid o1,Cuboid o2) {
			return (int) (o1.volume(iDepth, iLength, iWidth)-o2.volume(iDepth,iLength,iWidth));
			
		}
		
	}
    public double compareTo2(int iLength,int iDepth,int iWidth)throws UnsupportedOperationException {
		
		// TODO Auto-generated method stub
	double c= (iWidth*iDepth)*2+(iLength*iWidth)*2+(iWidth*iLength)*2;
	System.out.println(c);
	return c;
	}




	
}
