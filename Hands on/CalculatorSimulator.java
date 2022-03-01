public class CalculatorSimulator{
     String empname;
	double empsalary;
	double calcualateTax(String empname,boolean isIndian,double empsalary)
	{
         this.empname = empname;
         this.empsalary=empsalary;
         try
         {
        	 if(! isIndian) {
        		 throw new Exception("Country not valid");
        	 }}
        	 catch(Exception Exception)
        	 {
        		 System.out.println("The employee should be an Indian citizen for calculating Tax");
        	 }
        	 try {
        		 if(empname==null) {
        			 throw new Exception("Employee name invalid");
        		 }}
        		 catch(Exception Exception2)
        		 {
        			 System.out.println("The employee name cannot be empty");
        			 try {
        				 if((empsalary>100000)& (isIndian)) {
        					 double taxamount = empsalary*8/100;
        							 System.out.println("Tax Amount" +taxamount);
        					 return taxamount;}
        					 else if(((empsalary<50000) && (empsalary>100000) && (isIndian)))
        					 {
        		 				 double taxamount = empsalary*6/100;
    							 System.out.println("Tax Amount" +taxamount);
    					 return taxamount;
        					 }
        					 else if(((empsalary<50000) && (empsalary>30000) && (isIndian)))
        					 {
        						 double taxamount = empsalary*5/100;
    							 System.out.println("Tax Amount" +taxamount);
    					 return taxamount;
        					 }
        					 else if(((empsalary<30000) && (empsalary>10000) && (isIndian)))
        					 {
        						 double taxamount = empsalary*4/100;
    							 System.out.println("Tax Amount" +taxamount);
    					 return taxamount;
        					 }
        					 else 
        					 {
        						 System.out.println("Taxnoteligible");
        					 }}
        				 catch(Exception Exception3)
        				 {
        					System.out.println("The employee does not need to pay tax") ;
        				 }
        			 return empsalary;
        		 }
			return empsalary;
         }
  
	public static void main(String[] args) {
		CalculatorSimulator t = new CalculatorSimulator();
		t.calcualateTax(null,true,60000d);
	}

	}
