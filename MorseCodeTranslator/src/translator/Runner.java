package translator;

public class Runner {

	public static void main(String[] args) {

		MorseCode mc = new MorseCode();
		System.out.println(mc.translateFromMorseCode(
				".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"));

	}

}
