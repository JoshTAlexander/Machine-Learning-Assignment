import java.util.ArrayList;

public class solution1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	//Training data
	 ArrayList<Integer> data = new ArrayList<>(20); 
	 data.add(-100);
	 data.add(9901);
	 data.add(-10);
	 data.add(91);
	 data.add(-3);
	 data.add(7);
	 data.add(0);
	 data.add(1);
	 data.add(1);
	 data.add(3);
	 data.add(2);
	 data.add(7);
	 data.add(3);
	 data.add(13);
	 data.add(4);
	 data.add(21);
	 data.add(10);
	 data.add(111);
	 data.add(100);
	 data.add(10101);
	 
	 
	//initial values
	 final int epochs = 100000;  
     double w2 = 0;
	 double w1 = 0;
     double w0 = 0;
     double alpha = 0.00000001;
     
    for(int i = 0; i < epochs; i++) {

         double cost = 0;

         for(int j = 0; j < data.size()/2; j++) {
        	 
             //getting the data points 
             double x_j = data.get(2*j);
             double y_j = data.get(2*j+1);

             //prediction hypothesis
             double prediction = w0 + (w1 * x_j) +(w2 * x_j * x_j);

             //cost function
             cost += (y_j - prediction) * (y_j - prediction);
             
             //update values 
             w2 += alpha * (y_j - prediction) * x_j *x_j;
             w1 += alpha * (y_j - prediction) * x_j;
             w0 += alpha * (y_j - prediction);

         }
    }
    
    System.out.println(w0);
    System.out.println(w1);
    System.out.println(w2);



}
     
}
