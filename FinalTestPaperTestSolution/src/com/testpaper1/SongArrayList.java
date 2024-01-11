package com.testpaper1;

import java.util.ArrayList;
import java.util.Scanner;

public class SongArrayList {

	public static void main(String[] args) {
		 
		  ArrayList<Song> songList = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("Enter song id (or -1 to stop): ");

	            if (scanner.hasNextInt()) {
	                int songId = scanner.nextInt();

	                if (songId == -1) {
	                    break;
	                }

	                System.out.print("Enter song name: ");
	                String songName = scanner.next();

	                float volume = Song.calculateVolume(songList);

	                Song newSong = new Song(songId, songName, volume);
	                songList.add(newSong);
	            } else {
	                System.out.println("Invalid input. Please enter a valid integer.");
	                scanner.next(); // Consume the invalid input to avoid an infinite loop
	            }
	        }

	        for (int i = 0; i < songList.size(); i++) {
	            Song currentSong = songList.get(i);
	            System.out.println("Song ID: " + currentSong.songId +
	                    ", Song Name: " + currentSong.songName +
	                    ", Volume: " + currentSong.volume);

	            if (currentSong.volume >= 10) {
	                System.out.println("Found a song with volume 10 or greater at index: " + i);
	                break;
	            }
	        }

	        scanner.close();
	    }
	}
