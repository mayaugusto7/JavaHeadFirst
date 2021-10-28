package capitulo02;

class DrumKitTestDrive {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        d.playTopHat();
        d.snare = false;

        if (d.snare) {
            d.playSnare();
        }
    }
}
