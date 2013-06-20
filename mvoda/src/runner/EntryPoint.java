package runner;

import java.awt.image.BufferedImage;
import java.io.IOException;

import drawing.ShowImageInFrame;

import media.DecodePlayVid;
import media.ModifyMusicVideo;
import media.MusicVideo;
import media.DrawOntoVideo;
import media.VideoInfo;

public class EntryPoint {

	/**
	 * Main launcher for application, will do something nice
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//load a music vid
		String fileUNC = "../../../MVODAInputs/NeyoStayShort.avi";
		String outFileUNC = "../../../MVODAOutputs/doesthiswork.avi";
		MusicVideo test = new MusicVideo(fileUNC);

		//get some properties
		System.out.println("Here is the height of your video: " + test.getHeight());
		System.out.println("Here is the duration of your video (ms): " + test.getDuration());
		DrawOntoVideo draw = new DrawOntoVideo(fileUNC);
		
		//get Xuggler's video info - idea could Junit test compare MY music vid class to THIS info?
		//VideoInfo info = new VideoInfo(test.getFileUNC());
		
		//now let's try and grab a frame using the SIMPLE API
		//ModifyMusicVideo vid = new ModifyMusicVideo(fileUNC, outFileUNC );
		
		//play it in xugglers media player
		//DecodePlayVid player = new DecodePlayVid(fileUNC);

		
		//hmm that's not working well...
/*		while (test.hasNextPacket()) {
			BufferedImage image = test.getVideoFrame();
			if (image != null) {
				ShowImageInFrame gui = new ShowImageInFrame(image);
				//gui.createAndShowGui();
			}
		}	
*/	
		



	}
}
