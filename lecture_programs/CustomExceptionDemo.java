package lecture_programs;

class InvalidBoxException extends Exception {

    InvalidBoxException() {

    }
}

class Box {

    int l, b, h;

    Box(int l, int b, int h) {
        try {
            if (l <= 0 || b <= 0 || h <= 0) {
                throw new InvalidBoxException();
            }
            if (l >= 20 || b >= 20 || h >= 0) {
                throw new InvalidBoxException();
            }
            this.l = l;
            this.b = b;
            this.h = h;
            System.out.println("Box cretead successfully");
        } catch (InvalidBoxException e) {
            System.out.println("You cannot create a box with ZERO Dimenesion");
        }

    }

}

class CustomExceptionDemo {

    public static void main(String[] args)  {
        Box b1 = new Box(10, 20, 0);
    }
}
