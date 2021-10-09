class task6 {

    public int result(int ... args){                                // variable arguements
        System.out.println("argument length:" + args.length);       //method returns the sum of parameters passed to it
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args ) {
		
	     System.out.println(args);                                  // address printed to console
         task6 at = new task6();
        int sum2 = at.result(1, 2);                                 // Two arguements passed
        System.out.println("sum=" + sum2);                    

        int sum3 = at.result(1, 2, 3);                              // Three arguements passed
        System.out.println("sum= " + sum3);

        int sum4 = at.result(1,2,3,4);                              // Four arguements passed
        System.out.println("sum= " + sum4);
    }
}
