public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1"+ "\n");

        int[] wholeArray = new int[3];
        wholeArray[0] = 1;
        wholeArray[1] = 2;
        wholeArray[2] = 3;

        double[] fractionalArray = {1.57, 7.654, 9.986};

        int[] vacantArray = {11, 22, 33, 44, 55, 66, 77, 88};

        System.out.println("Задача 2");

        for (int i = 0; i < wholeArray.length; i++) {
            if (i == wholeArray.length - 1) {
                System.out.print(wholeArray[wholeArray.length - 1] + "\n");
                break;
            }
            System.out.print(wholeArray[i] + ", ");
        }


        for (int i = 0; i < fractionalArray.length; i++) {
            if (i == fractionalArray.length - 1) {
                System.out.print(fractionalArray[fractionalArray.length - 1] + "\n");
            } else
                System.out.print(fractionalArray[i] + ", ");

        }


        for (int i = 0; i < vacantArray.length; i++) {
            if (i == vacantArray.length - 1) {
                System.out.print(vacantArray[vacantArray.length - 1] + "\n");
            } else
                System.out.print(vacantArray[i] + ", ");
        }

        System.out.print("\n");
        System.out.println("Задача 3");

        for (int i = wholeArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(wholeArray[i] + "\n");
            } else
                System.out.print(wholeArray[i] + ", ");
        }

        for (int i = fractionalArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(fractionalArray[i] + "\n");
            } else
                System.out.print(fractionalArray[i] + ", ");
        }

        for (int i = vacantArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(vacantArray[i] + "\n");
            } else
                System.out.print(vacantArray[i] + ", ");
        }

        System.out.println("Задача 4");

        for (int i = 0; i < wholeArray.length; i++) {
            if (wholeArray[i] % 2 != 0) {
                System.out.print(wholeArray[i] + 1 + ", ");
            } else
                System.out.print(wholeArray[i] + ", ");
        }








    }
}