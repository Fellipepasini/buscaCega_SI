public enum Cidades {

	VAZIO(0, "VAZIO"), FPOLIS(1, "Florianópolis"), PALHOCA(2, "Palhoça"), ITAJAI(3, "Itajaí"), LAGUNA(
			4, "Laguna"), NAVEGANTES(5, "Navegantes");
	private int codigo;
	private String nome;

	Cidades(int codigo, String nome) {
		this.setCodigo(codigo);
		this.setNome(nome);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
