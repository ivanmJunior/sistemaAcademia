package br.com.fitNet.util;

public class ValidarCPF {

	public static boolean validarCpf(String cpfSemFormatacao){      
        cpfSemFormatacao = cpfSemFormatacao.replaceAll("[.-]", "");
        if (cpfSemFormatacao.length() != 11 || cpfSemFormatacao.equals("00000000000")
                || cpfSemFormatacao.equals("99999999999")) {
            
        	return false;
        }
         
        String digitos = cpfSemFormatacao.substring(0, 9);;
        String dvs = cpfSemFormatacao.substring(9, 11);
         
        String dv1 = gerarDVCpf(digitos);
        String dv2 = gerarDVCpf(digitos + dv1);
         
        return dvs.equals(dv1 + dv2);
    }
    

		private static String gerarDVCpf(String digitos) {
        int peso = digitos.length() + 1;
        int dv = 0;
        for (int i = 0; i < digitos.length(); i++) {
            dv += Integer.parseInt(digitos.substring(i, i + 1)) * peso;
            peso--;
        }
         
        dv = 11 - (dv % 11);
         
        if (dv > 9) {
            return "0";
        }
         
        return String.valueOf(dv);
    }
}
