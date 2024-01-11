package com.PracticeTest4;

class PercussionInstrument extends Sound implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Playing percussion instrument");
    }

    @Override
    void listenSound() {
        System.out.println("Listening to percussion instrument sound");
    }

	public void learnInstrument() {
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
