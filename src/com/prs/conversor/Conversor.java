package com.prs.conversor;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conversor {

//	private static final double TemperaturaEscolhidoDecimal = 0;

	public static void main(String[] args) {
		inicioDoSistema();
	}

	private static void inicioDoSistema() {
		while (true) {
			String[] opcoes = { "Converter Moedas", "Temperatura" };
			String escolha = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:", "Conversor de Valores",
					JOptionPane.YES_NO_OPTION, null, opcoes, opcoes[0]);

			if (escolha == null) {
				break;
			} else {
				if (escolha == opcoes[0]) {
					RecebeValor();
				} else {
					if (escolha == opcoes[1]) {
						RecebeValorTemperatura();
					} 
				}
			}
		}
	}
	

	private static void RecebeValor() {

		boolean valorEscolhido = false;
		String valorConverterStr = null;
		double valorEscolhidoDecimal = 0;

		while (!valorEscolhido) {
			valorConverterStr = JOptionPane.showInputDialog("Digite um valor: ");

			if (valorConverterStr == null) {
				JOptionPane.showMessageDialog(null, "Operação cancelada. Reiniciado o programa.");
				System.exit(0);
				inicioDoSistema();
			} else {
				if (!valorConverterStr.isEmpty()) {
					valorEscolhido = true;
					valorEscolhidoDecimal = Double.parseDouble(valorConverterStr);
				} else {
					JOptionPane.showMessageDialog(null, "Entrada invalida. Tente novamente.");
					RecebeValor();
				}

				JOptionPane.showMessageDialog(null, "Voce digitou: " + valorEscolhidoDecimal);
				EscolhaMoeda(valorEscolhidoDecimal);

			}
		}
	}

//------------------------------------------------------------------------------------

	public static void EscolhaMoeda(double valorEscolhidoDecimal) {

		String[] opcoesM = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
				"De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
				"De Yenes a Reais", "De Won Coreano a Reais" };
		String escolhaM = (String) JOptionPane.showInputDialog(null, "Selecione a Moeda:", "Conversor de Valores",
				JOptionPane.PLAIN_MESSAGE, null, opcoesM, opcoesM[0]);

//---------------------------------------------------------------------------------------
//-------------De real para dolar
		if (escolhaM == opcoesM[0]) {
			double taxaDolar = 4.75;
			double valorConvertido = valorEscolhidoDecimal / taxaDolar;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido em Dolar: " + valorFormatado, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {
				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();

			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
		}
//--------De real para euro
		if (escolhaM == opcoesM[1]) {
			double taxaEuro = 5.24;
			double valorConvertido = valorEscolhidoDecimal / taxaEuro;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido em Euros: " + valorFormatado, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);

			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {
				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();
			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}

		}
//-----------De real para libra
		if (escolhaM == opcoesM[2]) {
			double taxaLibra = 6.10;
			double valorConvertido = valorEscolhidoDecimal / taxaLibra;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido em Libra: " + valorFormatado, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {
				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();
			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);

			}

		}
//-----------De real para yenes
		if (escolhaM == opcoesM[3]) {
			double taxaYenes = 0.034;
			double valorConvertido = valorEscolhidoDecimal / taxaYenes;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido em Yenes: " + valorFormatado, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {
				System.out.println("escolheu sim");
				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();
			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
		}
//-----------De real para won coreano
		if (escolhaM == opcoesM[4]) {
			System.out.println(opcoesM);
			double taxaWonCoreano = 0.0037;
			double valorConvertido = valorEscolhidoDecimal / taxaWonCoreano;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido em Won Coreano: " + valorFormatado, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {
				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();
			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
		}
//------------De dolar para real
		if (escolhaM == opcoesM[5]) {
			System.out.println(opcoesM);
			double taxaDolar = 4.75;
			double valorConvertido = valorEscolhidoDecimal * taxaDolar;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido Dolar para Reais: " + valorFormatado, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {
				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();
			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
		}
//-----------De euro para real		
		if (escolhaM == opcoesM[6]) {
			System.out.println(opcoesM);
			double taxaEuro = 5.24;
			double valorConvertido = valorEscolhidoDecimal * taxaEuro;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido de Euros para Reais: " + valorFormatado, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {

				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();
			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
		}
//----------De libra para real		
		if (escolhaM == opcoesM[7]) {
			System.out.println(opcoesM);
			double taxaLibra = 6.10;
			double valorConvertido = valorEscolhidoDecimal * taxaLibra;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido de Libra para Reais: " + valorFormatado, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {
				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();
			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
		}
//--------De yenes para real		
		if (escolhaM == opcoesM[8]) {
			System.out.println(opcoesM);
			double taxaYenes = 0.034;
			double valorConvertido = valorEscolhidoDecimal * taxaYenes;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido de Yenes para Reais: " + valorFormatado, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {
				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();
			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
		}
//------------De won para real		
		if (escolhaM == opcoesM[9]) {
			System.out.println(opcoesM);
			double taxaWonCoreano = 0.0037;
			double valorConvertido = valorEscolhidoDecimal * taxaWonCoreano;
			DecimalFormat df = new DecimalFormat("#.00");
			String valorFormatado = df.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Valor Convertido de Won Coreano para Reais: " + valorFormatado,
					"Resultado", JOptionPane.INFORMATION_MESSAGE);
			int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (option == JOptionPane.YES_OPTION) {
				RecebeValor();
			} else if (option == JOptionPane.NO_OPTION) {
				inicioDoSistema();
			} else if (option == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
		}
	}

	private static void RecebeValorTemperatura() {

		boolean TemperaturaEscolhida = false;
		String TemperaturaConverterStr = null;
		double TemperaturaEscolhidoDecimal = 0;

		while (!TemperaturaEscolhida) {
			TemperaturaConverterStr = JOptionPane.showInputDialog("Digite a Temperatura: ");

			if (TemperaturaConverterStr == null) {
				JOptionPane.showMessageDialog(null, "Operação cancelada. Reiniciado o programa.");
				System.exit(0);
				inicioDoSistema();
			} else {
				if (!TemperaturaConverterStr.isEmpty()) {
					TemperaturaEscolhida = true;
					TemperaturaEscolhidoDecimal = Double.parseDouble(TemperaturaConverterStr);
				} else {
					JOptionPane.showMessageDialog(null, "Entrada invalida. Tente novamente.");
					RecebeValorTemperatura();
				}

				JOptionPane.showMessageDialog(null, "Voce digitou: " + TemperaturaEscolhidoDecimal);
				Temperatura(TemperaturaEscolhidoDecimal);

			}
		}
	}

	private static void Temperatura(double TemperaturaEscolhidoDecimal) {
		while (true) {
			String[] opcoesT = { "Celsius x Kelvin", "Celsius x Fahrenheit", "Kelvin x Celsius", "Kelvin x Fahrenheit",
					"Fahrenheit x Celsius", "Fahrenheit x Kelvin" };
			String escolhaT = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:",
					"Conversor de Temperatura", JOptionPane.INFORMATION_MESSAGE, null, opcoesT, opcoesT[0]);

			if (escolhaT == opcoesT[0]) {
				double valorKelvin = 273;
				double temperatura = TemperaturaEscolhidoDecimal + valorKelvin;
//				DecimalFormat df = new DecimalFormat("#.00");
//			String temperatura = df.format(TemperaturaEscolhidoDecimal);
				JOptionPane.showMessageDialog(null, "Valor Temperatura em Kelvin é: " + temperatura, "Resultado",
						JOptionPane.INFORMATION_MESSAGE);

				int option = JOptionPane.showOptionDialog(null, "Deseja continuar ?", "Confirmação",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (option == JOptionPane.YES_OPTION) {
					RecebeValorTemperatura();
				} else if (option == JOptionPane.NO_OPTION) {
					inicioDoSistema();
				} else if (option == JOptionPane.CLOSED_OPTION) {
					System.exit(0);
				}

			}
		}
	}
}
