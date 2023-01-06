package features;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("call method");
		return "BHAVYA HARIKA";
	}
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService ec=Executors.newSingleThreadExecutor();
	Future<String> fut1=ec.submit(new CallableTest());
	Future<String> fut2=ec.submit(new CallableTest());
	Future<String> fut3=ec.submit(new CallableTest());
	
	String val=fut1.get();
	System.out.println(val);
	ec.shutdown();
	
}
	
}
