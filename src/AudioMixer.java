public class AudioMixer {
    public String mixAudio(String fileName , int bitrate){
        if(bitrate <= 0){
            throw new IllegalArgumentException("Invalid bitrate");
        }
        String quality;
        if(bitrate >= 256){
            quality="High";
        } else if (bitrate >= 128) {
            quality="Medium";
        }
        else{
            quality="Low";
        }
        return "Audio from " + fileName + "\nQuality: " + quality;
    }
}
