package features;
@FunctionalInterface
public interface Test2Lamda {

	 void product(String name);
	 
	 public static void main(String[] args) {
		TestInterface t=name->System.out.println("product is..."+name);
				
		t.product("jeans");	
	}
	 
	 
}

