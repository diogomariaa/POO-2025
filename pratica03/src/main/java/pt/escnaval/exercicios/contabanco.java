package main.java.pt.escnaval.exercicios;

public class contabanco {
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		for (int i = 0; i < 10; i++) {
			int j = i + 1;
			Cliente c = new Cliente(j, "Nome " + j, j / 100.0);
			Endereco e = new Endereco("Rua " + j, j + 10, j * 1000 + j + " Localidade " + j);
			contas[i] = new Conta(j, c, j * 1000.0, e);
		}

		for (Conta conta : contas) {
			conta.mostrar();
			Cliente cli = conta.getCliente();
			if (cli != null) cli.mostrar();
			conta.mostrarEndereco();
			conta.mostrarEnderecoAntigo();
			System.out.println();
		}
	}
}

class Cliente {
	private int id;
	private String nome;
	private double desconto;

	public Cliente(int aId, String aNome, double aDesconto) {
		id = aId;
		nome = aNome;
		desconto = aDesconto;
	}

	public int getId() { return id; }
	public String getNome() { return nome; }
	public double getDesconto() { return desconto; }
	public void setDesconto(double desconto) { this.desconto = desconto; }

	public void mostrar() {
		System.out.println("Nome(" + id + ")(" + desconto + ")");
	}
}

class Endereco {
	private String rua;
	private int nrPorta;
	private String codPostal;

	public Endereco(String aRua, int aNrPorta, String aCodPostal) {
		rua = aRua;
		nrPorta = aNrPorta;
		codPostal = aCodPostal;
	}

	public String mostrar() {
		return "Rua: " + rua + "; Nr. Porta: " + nrPorta + "; Cod. Postal: " + codPostal;
	}
}

class Conta {
	private int id;
	private Cliente cliente;
	private Endereco endereco;
	private Endereco antigoEndereco;
	private double saldo;

	public Conta(int aId, Cliente aCliente, double aSaldo, Endereco aEndereco) {
		id = aId;
		cliente = aCliente;
		saldo = aSaldo;
		endereco = aEndereco;
		antigoEndereco = null;
	}

	public Conta(int aId, Cliente aCliente) {
		this(aId, aCliente, 0.0, null);
	}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public Cliente getCliente() { return cliente; }

	public void setCliente(Cliente cliente) {
		if (cliente != null) this.cliente = cliente;
	}

	public double getSaldo() { return saldo; }

	public void setSaldo(double saldo) {
		if (saldo >= 0) this.saldo = saldo;
	}

	public void atualizarEndereco(Endereco aEndereco) {
		if (endereco != null) {
			antigoEndereco = endereco;
			endereco = aEndereco;
		}
	}

	public String getClienteNome() {
		return cliente != null ? cliente.getNome() : null;
	}

	public void mostrar() {
		String nome = (cliente != null) ? cliente.getNome() : "(sem cliente)";
		System.out.println("Nome(" + nome + ") Saldo=" + saldo);
	}

	public void mostrarEndereco() {
		if (endereco != null) System.out.println(endereco.mostrar());
		else System.out.println("(sem endereco)");
	}

	public void mostrarEnderecoAntigo() {
		if (antigoEndereco != null) {
			System.out.println(antigoEndereco.mostrar());
		}
	}

	public Conta deposito(double valor) {
		if (valor > 0) saldo += valor;
		return this;
	}

	public void levantar(double valor) {
		if (valor <= saldo) saldo -= valor;
		else System.out.println("Valor a levantar excede o corrente saldo");
	}
}

