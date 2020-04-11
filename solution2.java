import java.util.ArrayList;

public class solution2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//traing data
		 ArrayList<Double> data = new ArrayList<>(45);
		 data.add((double) 1);
		 data.add((double) 1);
		 data.add((double) 0);
		 data.add((double) 2);
		 data.add((double) 2);
		 data.add((double) 0);
		 data.add(0.3);
		 data.add(1.2);
		 data.add((double) 0);
		 data.add(0.6);
		 data.add(0.8);
		 data.add((double) 0);
		 data.add(1.2);
		 data.add((double) 1);
		 data.add((double) 0);
		 data.add(1.3);
		 data.add((double) 1);
		 data.add((double) 0);
		 data.add(1.8);
		 data.add((double) 2);
		 data.add((double) 0);
		 data.add(1.5);
		 data.add(1.4);
		 data.add((double) 0);
		 data.add((double) 3);
		 data.add((double) 3);
		 data.add((double) 1);
		 data.add((double) 4);
		 data.add((double) 4);
		 data.add((double) 1);
		 data.add(3.1);
		 data.add(3.3);
		 data.add((double) 1);
		 data.add(3.6);
		 data.add(3.8);
		 data.add((double) 1);
		 data.add(3.8);
		 data.add(2.1);
		 data.add((double) 1);
		 data.add(3.5);
		 data.add(2.2);
		 data.add((double) 1);
		 data.add(3.25);
		 data.add(2.8);
		 data.add((double) 1);
		 
		 //initial values
		 final int epochs = 1000000;  
	     double w2 = 0;
		 double w1 = 0;
	     double w0 = 0;
	     double alpha = 0.00001;
	     
	    for(int i = 0; i < epochs; i++) {

	         double cost = 0;

	         for(int j = 0; j < data.size()/3; j++) {

	        	 //getting the data points
	             double x1_j = data.get(3*j);
	             double x2_j = data.get(3*j+1);
	             double y_j = data.get(3*j+2);
	             
	            //hypothesis with the sigmoid function
	             double prediction = 1 / (1 + Math.exp(-(w0 + (w1 * x1_j) +(w2 * x2_j))));
	             
                 //cost function
	             cost += ((y_j * Math.log((y_j - prediction) * (y_j - prediction))) + ((1-y_j)*(Math.log(1- ((y_j - prediction) * (y_j - prediction) )))));
	             
	             //update values
	             w2 += alpha * (y_j - prediction) * x2_j;
	             w1 += alpha * (y_j - prediction) * x1_j;
	             w0 += alpha * (y_j - prediction);

	         }
	    }
	    
	    System.out.println(w0);
	    System.out.println(w1);
	    System.out.println(w2);



	}

}
