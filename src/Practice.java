
public class Practice {
    
    /*
     * Declare a 2D array that can accommodate the grid values below:
     *          0, 1, 2
     *          3, 4, 5
     *          6, 7, 8
     */
    public Object[][] test1_2DInit_a() {
       
         Object[][] nums= new Object[3][3];
        
        return nums;
    }
    
    /*
     * Declare a 2D array that can accommodate the grid of values below:
     *          "a", "b", "c", "d",
     *          "e", "f", "g", "e"
     */
    public Object[][] test1_2DInit_b() {
    	
    	 String[][] strings = new String[2][4];
        //strings = new String["a"]["a"];
        return strings;
    }
    
    /*
     * Declare a 2D array that can accommodate the grid of values below:
     *          true, false,
     *          false, false,
     *          false, true,
     *          true, true,
     *          true, false
     */
    public Object[][] test1_2DInit_c() {
    	Object[][] booleans = new Object[5][2];
        return booleans;
    }
 
    /*
     * Draw the grid of values for the following 2D array of ints:
     * Assume all the elements in the 2D array are initialized to random ints
     * 
     * int[][] grid = new int[2][3];
     * 
     * 456
     * 312
     *

    /*
     * Draw the grid of values for the following 2D array of Robots
     * Assume all the elements in the 2D array are initialized.
     * 
     * Robot[][] robots = new Robot[4][2];
     * Robot Robot
     * Robot Robot
     * Robot Robot
     * Robot Robot
     * 
     */
    
    /* Given the array of Objects below, return the element that is not null
     *          null, null, null, null
     *          null, null, null, Object
     *          Object[1][3];
     */ 
    public Object test1_2DInit_d() {
        Object[][] objects = { {null, null, null, null}, {null, null, null, new Object()} }; 
        
        return objects[1][3];
    }
    
    /* Given the array of Objects below, return the element that is not null
     *          null, null, Object, null
     *          null, null, null, null
     *          Object[0][2];
     */
    public Object test1_2DInit_e() {
        Object[][] objects = { {null, null, new Object(), null}, {null, null, null, null} }; 
        
        return objects[0][2];
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * first row (row 0)
     */
    public Integer test1_2DInit_f() {
        int[][] nums = { {8, 7, 6}, {5, 4, 3}, {2, 1, 0}};
        int sum = 0;
		for (int i : nums[0]) {
			sum += i;
		}
        return sum;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * second column (column 1)
     */
    public Integer test1_2DInit_g() {
        int[][] nums = { {8, 7, 6}, {5, 4, 3}, {2, 1, 0}};
        int sum1 = nums[0][1];
        int sum2 = nums[1][1];
        int sum3 = nums[2][1];
		
        return sum1+sum2+sum3;
    }
}
