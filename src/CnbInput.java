public class CnbInput {
	String input =
			"Austrálie]dolar]1]AUD]15.741!" +
			"Brazílie]real]1]BRL]4.103!" +
			"Bulharsko]lev]1]BGN]12.964!" +
			"Čína]žen-min-pi]1]CNY]3.352!" +
			"Dánsko]koruna]1]DKK]3.410!" +
			"EMU]euro]1]EUR]25.355!" +
			"Filipíny]peso]100]PHP]43.068!" +
			"Hongkong]dolar]1]HKD]2.780!" +
			"Chorvatsko]kuna]1]HRK]3.383!" +
			"Indie]rupie]100]INR]29.355!" +
			"Indonesie]rupie]1000]IDR]1.519!" +
			"Island]koruna]100]ISK]16.714!" +
			"Izrael]nový šekel]1]ILS]6.762!" +
			"Japonsko]jen]100]JPY]19.671!" +
			"Jižní Afrika]rand]1]ZAR]1.481!" +
			"Kanada]dolar]1]CAD]17.077!" +
			"Korejská republika]won]100]KRW]1.844!" +
			"Maďarsko]forint]100]HUF]7.119!" +
			"Malajsie]ringgit]1]MYR]5.175!" +
			"Mexiko]peso]1]MXN]1.082!" +
			"MMF]ZPČ]1]XDR]30.719!" +
			"Norsko]koruna]1]NOK]2.514!" +
			"Nový Zéland]dolar]1]NZD]15.255!" +
			"Polsko]zlotý]1]PLN]5.500!" +
			"Rumunsko]leu]1]RON]5.122!" +
			"Rusko]rubl]100]RUB]29.747!" +
			"Singapur]dolar]1]SGD]16.049!" +
			"Švédsko]koruna]1]SEK]2.501!" +
			"Švýcarsko]frank]1]CHF]23.411!" +
			"Thajsko]baht]100]THB]65.077!" +
			"Turecko]lira]1]TRY]2.474!" +
			"USA]dolar]1]USD]21.641!" +
			"Velká Británie]libra]1]GBP]29.659";

	public String[][] getInput(){
		String[] input2 = input.split("!");
		String[][] output = new String[input2.length][];
		for(int x = 0; x<input2.length;x++){
			output[x] = input2[x].split("]");
		}
		return output;
	}
}
