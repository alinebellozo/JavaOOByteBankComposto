
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente aline = new Cliente();
		aline.nome = "Aline Bellozo";
		aline.cpf = "111.111.111-11";
		aline.profissao = "desenvolvedora";
		
		Conta contaDaAline = new Conta();
		contaDaAline.deposita(100);
		
		// associa a cliente Aline à conta contaDaAline
		contaDaAline.titular = aline;
		System.out.println(contaDaAline.titular.nome);
		System.out.println(contaDaAline.titular);
		
	}
}
