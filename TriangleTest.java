import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	   @Test
       public void testIsTriangle1(){
           Triangle t = new Triangle(-1,10,2);
           assertFalse(t.isTriangle(t));
       }
   
       @Test
       public void testIsTriangle2(){
           // according to the mutant, this test case should fail
           Triangle t = new Triangle(3,2,1);
           assertFalse(t.isTriangle(t));
       }
   
       @Test
       public void testIsTriangle3(){
           Triangle t = new Triangle(3,1,2);
           assertFalse(t.isTriangle(t));
       }
        @Test
        public void testlsTringle4(){
        	Triangle t=new Triangle(0,6,5);
        	assertEquals(t.getType(t),"Illegal");
        }
        @Test
        public void testlsTringle5(){
        	Triangle t=new Triangle(4,3,2);
        	assertEquals(t.getType(t),"Scalene");
        }
        @Test
        public void testlsTringle6(){
        	Triangle t=new Triangle(4,4,4);
        	assertEquals(t.getType(t),"Regular");
        }
        @Test
        public void testlsTringle7(){
        	Triangle t=new Triangle(-2,-2,-2);
        	assertEquals(t.getType(t),"Illegal");
        }
        @Test
        public void testlsTringle8(){
        	Triangle t=new Triangle(3,3,5);
        	assertEquals(t.getType(t),"Isoceles");
        }
       @Test
        public void testlsTringle9(){
        	Triangle t=new Triangle(-2,-2,-2);
        	assertEquals(t.getType(t),"Regular");
        }
        @Test
        public void testlsTringle10(){
        	Triangle t=new Triangle(3,3,6);
        	assertEquals(t.getType(t),"Isoceles");
        }
        @Test
        public void testlsTringle11(){
        	Triangle t=new Triangle(1,2,3);
        	assertEquals(t.getType(t),"Scalene");
        }
        
}
