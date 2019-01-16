class BoxDemo{
	public static void main(String[] args)
	 {
	 	double width,height,depth;
		Box b=new Box();
		Box b1 = new Box(width=2,height=2,depth=2);
		

		Box b2 = new Box(width=2, depth=2);
		Box b3 = new Box();	

		b.setDim();
		b.volume();
		b2.volume();
		b3.volume();
	}
}