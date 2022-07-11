public class Prac23 {

    public static void main(String[] args) {

        Integer[][] list = new Integer[3][3];
        int value = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = (int) (Math.random() * 100);
                System.out.println("Inserted number is " + list[i][j]);
            }
        }

        System.out.println("Max = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list) {

        E max = list[0][0];
        for (E[] elements : list) {
            for (E element : elements) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }

        return max;
    }
}
