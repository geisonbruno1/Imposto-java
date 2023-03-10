
import java.util.Locale;
import java.util.Scanner;

public class ImpostoJ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
// CONSOLIDADO DE RENDA 
		double rendaSalario, rendaServico, rendaGC, gastosMedico, gastosEducacao;
// DEDU��ES 
		double impostoSalario, impostoServico, impostoGC, totalBruto, totalLiquido;
// RESUMO
		double maximoDedutivel, gastosDedutiveis, abatimento;
		
// LEITURA DE DADOS
		
		System.out.print("Renda anual com sal�rio: ");
		rendaSalario = sc.nextDouble();
		System.out.print("Renda anual com presta��o de servi�o: ");
		rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendaGC = sc.nextDouble();
		System.out.print("Gastos m�dicos: ");
		gastosMedico = sc.nextDouble();
		System.out.print("Gastos Educacionais: ");
		gastosEducacao = sc.nextDouble();
		System.out.print("\n");

		// PARTE 1: CALCULO DOS IMPOSTOS
		
		double salarioMensal = rendaSalario / 12.0;
		
		if (salarioMensal < 3000.0) {
			impostoSalario = 0;
			 
		} else if (salarioMensal < 5000.0) {
			impostoSalario = rendaSalario * 0.1;
		}	

		else  {
			impostoSalario = rendaSalario * 0.2;
		}
		
		impostoServico = rendaServico * 0.15;

		impostoGC = rendaGC * 0.20;
		
		totalBruto = impostoSalario + impostoServico + impostoGC;
	
// PARTE 3: CALCULO DAS DEDU��ES E IMPOSTO DEVIDO
		
		maximoDedutivel = totalBruto * 0.3;
		
		gastosDedutiveis = gastosMedico + gastosEducacao;
		
		if (gastosDedutiveis > maximoDedutivel) {
			abatimento = maximoDedutivel;
		}
		else {
			abatimento = gastosDedutiveis;
		}
		
		totalLiquido = totalBruto - abatimento;
		
		
		System.out.print("RELATORIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.printf("CONSOLIDADO DE RENDA: \n");
		System.out.printf("Imposto sobre sal�rio: %.2f \n", impostoSalario);
		System.out.printf("Imposto sobre servi�os: %.2f \n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f \n", impostoGC);
		System.out.println();

		System.out.printf("DEDU��ES: \n");
		System.out.printf("M�ximo dedut�vel: %.2f \n", maximoDedutivel);
		System.out.printf("Gastos dedut�veis: %.2f \n", gastosDedutiveis);
		System.out.println();

		System.out.printf("RESUMO: \n");
		System.out.printf("Imposto bruto total: %.2f \n", totalBruto);
		System.out.printf("Abatimento: %.2f \n", abatimento);
		System.out.printf("Imposto devido: %.2f \n", totalLiquido);
		sc.close();
	}

}
