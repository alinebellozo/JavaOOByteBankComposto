
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaMarina = new Conta();
		System.out.println(contaDaMarina.getSaldo());
		
		contaDaMarina.titular = new Cliente();
		System.out.println(contaDaMarina.titular);
		
		contaDaMarina.titular.nome = "Marina";
		System.out.println(contaDaMarina.titular.nome);
		
	}
}
