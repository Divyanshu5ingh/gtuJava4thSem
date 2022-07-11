public class Prac7 {
	public static void main(String[] args) {
		String PlateNumber = "" + (char) (Math.random() * 26 + 65);
		PlateNumber += (char) (Math.random() * 26 + 65);
		PlateNumber += (char) (Math.random() * 26 + 65);
		PlateNumber += (int) (Math.random() * 10);
		PlateNumber += (int) (Math.random() * 10);
		PlateNumber += (int) (Math.random() * 10);
		PlateNumber += (int) (Math.random() * 10);
		System.out.print(PlateNumber);
	}
}
