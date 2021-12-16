package br.com.phc.brasileiraoapi.dto;

import java.io.Serializable;

public class PartidaGoogleDTO implements Serializable {

	private final static long serialVersionUID = 1L;

	private String statusPartida;
	private String tempoPartida;

	// Equipe Casa
	private String nomeEquipeCasa;
	private String urlLogoEquipeCasa;
	private String PlacarEquipeCasa;
	private String golsEquipeCasa;
	private String placarExtendidoEquipeCasa;

	// Equipe Visitante
	private String nomeEquipeVisitante;
	private String urlLogoEquipeVisitante;
	private String PlacarEquipeVisitante;
	private String golsEquipeVisitante;
	private String placarExtendidoEquipeVisitante;

}
