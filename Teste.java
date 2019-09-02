class Teste {

	static int i = 0;

	public Teste() {
		System.out.println(i++);
		new Teste();
	}

	public static void main (String[] args) {
		new Teste();
	}
}
