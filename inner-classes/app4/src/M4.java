interface A
{
	void test(int i);
}
class M4
{
	public static void main(String[] args) 
	{
		A a2 = (x) -> {
						System.out.println("from test:" + x);
						System.out.println("from test");
						System.out.println("from test");
					 };
		a2.test(20);
	}
}
