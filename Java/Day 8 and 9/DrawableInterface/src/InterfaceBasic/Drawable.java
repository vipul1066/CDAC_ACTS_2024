package InterfaceBasic;
public interface Drawable
{
	 void draw();
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing a Circle");
	}
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing a Rectangle");
	}
}