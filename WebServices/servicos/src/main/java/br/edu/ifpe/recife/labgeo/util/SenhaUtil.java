package br.edu.ifpe.recife.labgeo.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SenhaUtil {

	public static String criptografarSenha(String senha, String chave, String hash) {

		String senhaCriptografada = null;

		try {
			MessageDigest messageDigest = MessageDigest.getInstance(hash);
			messageDigest.update(senha.getBytes());
			senhaCriptografada = stringHexa(messageDigest.digest(chave.getBytes()));
		} catch (NoSuchAlgorithmException e) {
		}
		return senhaCriptografada;
	}

	private static String stringHexa(byte[] bytes) {

		StringBuffer retorno = new StringBuffer();

		for (int i = 0; i < bytes.length; i++) {
			retorno.append(Integer.toHexString((((bytes[i] >> 4) & 0xf) << 4) | (bytes[i] & 0xf)));
		}

		return retorno.toString();
	}

	public static String invalidarCampoCadastrado(boolean cadastrado) {
		if (cadastrado) {
			return "invalido";
		}
		return "valido";
	}

	public static String gerarSenhaAleatoria() {
		int qtdeMaximaCaracteres = 8;
		String[] caracteres = { "a", "1", "b", "2", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g",
				"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B",
				"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
				"X", "Y", "Z" };

		StringBuilder senha = new StringBuilder();

		for (int i = 0; i < qtdeMaximaCaracteres; i++) {
			int posicao = (int) (Math.random() * caracteres.length);
			senha.append(caracteres[posicao]);
		}
		return senha.toString();
	}
}
