package aula_6;

public class FodendoAJVM {
	public static void main(String[] aargs) {
		String[][][][][][] Julio = new String[23][23][23][23][23][23];

		String FUCKER = "fuckingJVMhard";

		for (int i = 0; i < 23; i++) {
			for (int j = 0; j < 23; j++) {
				for (int k = 0; k < 23; k++) {
					for (int l = 0; l < 23; l++) {
						for (int m = 0; m < 23; m++) {
							for (int n = 0; n < 23; n++) {
								if (n % 2 == 0) {
									FUCKER = "this is SPARTA";
								} else if (n % 3 == 0) {
									FUCKER = "hasta la vista baby";
								} else if (n % 5 == 0) {
									FUCKER = "                   oooooooooh";
								}
								Julio[i][j][k][l][m][n] = FUCKER;
								System.out.println(Julio[i][j][k][l][m][n]);
							}
						}
					}
				}
			}
		}
	}
}
