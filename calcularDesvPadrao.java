public class desvPadrao {
	public static void main(String[] args) {
        double[] valores = {10.2, 8.5, 12.7, 9.3, 11.1};
		
		double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        double media = soma / valores.length;

        double somaQuadrados = 0;
        for (int i = 0; i < valores.length; i++) {
            somaQuadrados += Math.pow(valores[i] - media, 2);
        }

        double desvioPadrao = Math.sqrt(somaQuadrados / (valores.length - 1));

        System.out.println("O desvio padrão é " + desvioPadrao);
	}

}
