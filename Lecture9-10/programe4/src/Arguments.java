class Arguments
{
	public static void main(String[] args) {
		try{
			int a,count=0,sum=0;
			for(int i=0; i<args.length; i++){
				a=Integer.parseInt(args[i]);
				count=count+1;
				sum=sum+a;
			}
			if(count<5)
			{
				throw new CheckArgumentsException("Arguments are less than 5");
			}
			else
			{
				System.out.print(sum);
			}
		}
			catch(CheckArgumentsException e){
				System.out.print("Caught the exception");
			}
			finally{
				System.out.print("i am always executed");
			}
		}
	}