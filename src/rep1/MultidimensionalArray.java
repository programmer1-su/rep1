package rep1;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		String[][] station_names = {
				{"洋光台","磯子","桜木町"},
				{"鶴見","川崎","横浜"},
				{"品川","東京"}
		};
		
		System.out.println(station_names[1][2]);
		System.out.println(station_names[2].length);
	}
}
