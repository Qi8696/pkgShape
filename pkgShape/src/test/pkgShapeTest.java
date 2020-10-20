package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;





import pkgShape.Cuboid;

import pkgShape.Rectangle;



public class pkgShapeTest {

	@Test
	public void ConstructionTest() {
		Cuboid cub =new Cuboid(10,20,30);
		assertEquals(cub.getiDepth(), 30);
		assertEquals(cub.getiLength(), 20);
		assertEquals(cub.getiWidth(), 10);
		
	}
	@Test
	public void gettersetterTest() {
		Cuboid cub =new Cuboid(1,2,3);
		cub.setiDepth(5);
		cub.setiLength(6);
		cub.setiWidth(7);
		
		assertEquals(cub.getiDepth(), 5);
		assertEquals(cub.getiLength(), 6);
		assertEquals(cub.getiWidth(), 7);
		
	}
	
	@Test
	public void areaTest() {
		Cuboid cub =new Cuboid(1,3,6);
		assertEquals(cub.area(1, 3, 6), 54);
		
	}
	

	@Test
	public void volumeTest() {
		Cuboid cub =new Cuboid(1,3,6);
		assertEquals(cub.volume(1, 3, 6), 18);
	}
	@Test
	public void compareToTest() {
		Cuboid cob1 = new Cuboid(1,2,3);
		Cuboid cob2 = new Cuboid(2,4,5);
		Cuboid cob3 = new Cuboid(1,10,4);
		Cuboid cob4 = new Cuboid(7,8,9);
		
		assertTrue(cob1.compareTo(cob2)<0);
		assertTrue(cob4.compareTo(cob2)>0);
		assertTrue(cob2.compareTo(cob3)==0);
		
	}

	
	@Test
	public static void SortByVolumeTest() {
		Cuboid cub1 = new Cuboid(2,3,4);
		Cuboid cub2 = new Cuboid(5,6,7);
		
		List<Cuboid> list = new ArrayList<Cuboid>();
		list.add(cub1);
		list.add(cub2);
		Collections.sort(list, cub1.new SortByVolume());
		assertEquals(list.get(0), cub2);
			
	}
	@Test
	public void Construction_Test() {
		Rectangle rec =new Rectangle(10,20);
		
		assertEquals(rec.getiLength(), 10);
		assertEquals(rec.getiWidth(), 20);
	}
	@Test
	public void gettersetter_Test() {
		Rectangle rec =new Rectangle(8,9);
		
		rec.setiLength(5);
		rec.setiWidth(6);
		
		
		assertEquals(rec.getiLength(), 5);
		assertEquals(rec.getiWidth(), 6);
		
	}
	@Test
	public void area_Test() {
		Rectangle rec =new Rectangle(1,3);
		assertEquals(rec.area(), 3);
		
	}
	@Test
	public void perimeter_Test() {
		Rectangle rec= new Rectangle (7,5);
		assertEquals(rec.perimeter(), 24);

	}
	@Test
	public void perimeterTest() {
		Cuboid cub= new Cuboid (1,3,5);
		assertEquals(cub.perimeter(), 36);
			
	}
	@Test
	public void compareTo_Test() {
		Rectangle rec1 = new Rectangle(1,2);
		Rectangle rec2 = new Rectangle(3,4);
		Rectangle rec3 = new Rectangle(2,6);
		Rectangle rec4 = new Rectangle(7,8);
		
		assertTrue(rec1.compareTo(rec2)<0);
		assertTrue(rec4.compareTo(rec2)>0);
		assertTrue(rec2.compareTo(rec3)==0);
		
	}
	@Test
	public static void SortByAreaTest() {
		Rectangle rec1 = new Rectangle(2,3);
		Rectangle rec2 = new Rectangle(5,6);
		
		List<Rectangle> list = new ArrayList<Rectangle>();
		list.add(rec1);
		list.add(rec2);
		Collections.sort(list, rec1.new SortByArea());
		assertEquals(list.get(0), rec2);
			
	}

	
}

