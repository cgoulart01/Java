
public class Cargo {
	private int cargo;

	/** 1-Funcionario Comum 2-Gerente 3-Diretor */
	private double salario;

	public Cargo(int vaga) {
		cargo = vaga;
	}

	public String getCargo() {
		if (this.cargo == 1) {
			return "Funcionário Comum";
		} else {
			if (this.cargo == 2) {
				return "Gerente";
			} else {
				if (this.cargo == 3) {
					return "Diretor";
				}
				return "cargo não cadastrado.";
			}
		}
	}

	public double getSalario() {
		return this.salario;
	}

	public double defineSalario(int cargo) {
		if (cargo == 1) {
			return this.salario = 1500;
		} else {
			if (cargo == 2) {
				return this.salario = 2600;
			} else {
				return this.salario = 5000;
				}
			}
		}


	public double setSalario() {
		 return this.salario = this.defineSalario(this.cargo);
	}

	public double salarioComBonus() {
		return this.salario += this.salario * getBonus();
	}

	private double getBonus() {
		if (this.cargo == 1) {
			return 0.1;
		}
		if (cargo == 2) {
			return 0.25;

		}
		if (cargo == 3) {
			return 0.35;
		}
		return 0.0;
	}
}
