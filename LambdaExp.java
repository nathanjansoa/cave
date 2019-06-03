package cave.programing;

interface Executable{
	void execute();
}//Com retorno
interface Executable2{
	int execute();
}//Com parametro
interface Executable3{
	int execute(int i);
}// Multiplos parametros
interface Executable4{
	int execute(int a,int b);
}
class Runner{
	public void run(Executable e) {
		e.execute();
	}//Com retorno
	public void run2(Executable2 e) {
		int value = e.execute();
		System.out.println("O retorno é: "+value);
	}//Com parametro
	public void run3(Executable3 e) {
        int value = e.execute(2);
        System.out.println("O retorno é: " + value);
    }// Multiplos parametros
	public void run4(Executable4 e) {
		int value = e.execute(3, 4);
		System.out.println("O retorno é: " + value);
	}
}

public class LambdaExp {
	//Java 7 Lambda Expression, como passar bloco de codigo como parametro
	public static void lambExp() {
		Runner runner = new Runner();
		runner.run(new Executable() {
			public void execute() {
				System.out.println("Bloco de codigo java7");
			}
		});
		//Java 8 Lambda Expression,  passar com ()-> 
		runner.run(()->System.out.println("Bloco de codigo java8"));
		//Java 8 Lambda Expression multiplas linhas
		runner.run(()->{
			System.out.println("Bloco de codigo 1");
			System.out.println("Bloco de codigo 2");
		});
		// Com retorno
		runner = new Runner();
		runner.run2(new Executable2() {
	        public int execute() {
	            System.out.println("Bloco de codigo java7 return.");
	            return 7;
	        }
	    });
		runner.run2(() -> {
			System.out.println("Bloco de codigo java8 return.");
			return 8;
		});
		// Passando parametro
		// Anonymous class
        runner.run3(new Executable3() {
            public int execute(int a) {
                System.out.println("Anonymous class.");
                return 5 + a;
            }
        });
        // Lambda expression
        runner.run3(a-> {
            System.out.println("Lambda expression.");
            return 6 + a;
        });
        // Multiplos parametros
        runner.run4(new Executable4() {
			public int execute(int a, int b) {
				System.out.println("Anonymous class.");
				return a+b;
			}
		});
		runner.run4((a,b)->{
			System.out.println("Anonymous class.");
			return a+b+1;
		});
		 int c = 9;
         
         // Can use c in our anonymous class methods and lambda expressions
         // as long as we don't change its value after assigning.
         // We say it's "effectively final"
         runner = new Runner();
         // Anonymous class
         runner.run4(new Executable4() {
             public int execute(int a, int b) {
                 return a + b + c;
             }
         });
         // Lambda expression
         runner.run4( (a, b) -> {
             return a + b + c;
         });
	}
}