package features;

public interface TestInterface {
void product(String name);
public static void main(String[] args) {
		TestInterface t=new TestInterface() {
			
			@Override
			public void product(String name) {
				System.out.println("Product name is..."+name);
				
			}
		};
		t.product("OnePlus");
}
}
