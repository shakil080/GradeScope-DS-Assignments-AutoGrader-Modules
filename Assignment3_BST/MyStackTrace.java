package assignment;

public class MyStackTrace {
	public static void printTrace(String methodname) {
		StackTraceElement [] trace =Thread.currentThread().getStackTrace(); 
		for(int i=2; i<trace.length-26; i++) {
			int stopIndex = trace[i].toString().indexOf('(');
			String currentTrace = trace[i].toString().substring(0, stopIndex);
			//System.out.println(currentTrace);

			if(currentTrace.contains(methodname)){
				System.out.println(methodname + " called in recursive way");
			}
		}
	}

}
