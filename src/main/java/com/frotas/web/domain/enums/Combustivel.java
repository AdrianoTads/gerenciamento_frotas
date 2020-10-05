package com.frotas.web.domain.enums;

import java.util.ArrayList;
import java.util.List;

public enum Combustivel {
	GASOLINA(1, "Gasolina"), ALCOOL(2, "Alcool"), ELETRICIDADE(3, "Eletricidade"),
	SOLAR(4, "Solar"), GAS(5, "Gas");

	private int cod;
	private String descricao;

	private Combustivel(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static Combustivel toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (Combustivel x : Combustivel.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido: " + cod);
	}

	public static List<Combustivel> getEnum() {
		List<Combustivel> lista = new ArrayList<>();
		for (Combustivel x : Combustivel.values()) {
			lista.add(x);
		}
		return lista;
	}
}
