package com.pLegacy;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio 
{
	public static Clip sound;
	public static Clip music;
	public static AudioInputStream audioInputStream;
	public static AudioInputStream musicInputStream;
	
	public static void StartMusic(String s)
	{
	    try 
		{
			musicInputStream = AudioSystem.getAudioInputStream(new File("Audio/" + s));
			music= AudioSystem.getClip();
			   music.open(musicInputStream);
			   music.start();
			   music.loop(music.LOOP_CONTINUOUSLY);
		} 
		catch (UnsupportedAudioFileException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}				
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void Start(String s)
	{
	    try 
		{
			audioInputStream = AudioSystem.getAudioInputStream(new File("Audio/" + s));
			sound = AudioSystem.getClip();
			sound.open(audioInputStream);
			if (sound.isRunning())
	            sound.stop(); 
			sound.start();
			sound.loop(0);
		} 
		catch (UnsupportedAudioFileException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}				
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Stop()
	{
		try 
		{
			music.stop();
			music.close();	
			if(sound != null && sound.isRunning())
			{
				sound.stop();
				sound.close();
				audioInputStream.close();
				sound = null;
				audioInputStream = null;
			}
			musicInputStream.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
