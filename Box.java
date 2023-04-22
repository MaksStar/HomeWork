
    public class Box {
        private int height;
        private int length;
        private int width;
        private int volume;
        public Box(int height, int length, int width) {
            this.height = 6;
            this.length = 7;
            this.width = 8;
        }
        public void print() {
            System.out.println("Объем коробки: " + height * length * width);
        }
    public static void main(String[] args) {
        Box box1 = new Box(4,5,6);
        box1.print();
    }
}
