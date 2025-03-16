interface Drawble
{
	void draw();
}
class Rectangle implements Drawble
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class Circle implements Drawble
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}
class Interface2
{
	public static void main(String args[])
	{
		Drawble d = new Rectangle();
		d.draw();
		Drawble d1 = new Circle();
		d1.draw();
	}
}
