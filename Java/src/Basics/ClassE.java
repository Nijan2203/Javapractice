package Basics;

public class ClassE {

	public static void main(String[] args) {
		// Type conversion
				//Widening or Implicit conversion
						// byte -> short -> int/char -> long -> float -> double
						
						int x=100;
						long y=x;
						float z=y;
						
						System.out.println(x);
						System.out.println(y);
						System.out.println(z);

				//Narrowing or Explicit conversion
						
						double d=65.4;
						int i=(int)d;
						char c=(char)i;
						System.out.println(d);
						System.out.println(i);
						System.out.println(c);
				// converting integer to string	
						int  a=5;
							int b=4;
							
							String answer=String.valueOf(a)+String.valueOf(b);
							System.out.println(answer);
							
				// converting string to integer
							
							String str="5";
							int in=Integer.parseInt(str);
							System.out.println(in);
									
						
					}

				}
				/*

				coverting small to long - implicit conversion
				converting large value to small - explicit conversion

				*/
