package com.PracticeTest4;

class StringedInstrument extends Sound implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Playing stringed instrument");
    }

    @Override
    void listenSound() {
        System.out.println("Listening to stringed instrument sound");
    }



    public static void main(String[] args) {
        // Create objects
        PercussionInstrument tabla = new PercussionInstrument();
        StringedInstrument violin = new StringedInstrument();

        // Call play, learnInstrument, and listenSound methods
        tabla.play();
        tabla.learnInstrument();
        tabla.listenSound();

        System.out.println(); // Adding a newline for better readability

        violin.play();
//        violin.learnInstrument();
        violin.listenSound();
    }
}
