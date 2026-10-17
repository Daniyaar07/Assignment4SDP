public class BitrateReader {
    public int getBitrate(String format){
        if(format.equals("mp3")){
            return 192;
        }
        else if (format.equals("mp4")){
            return 1000;
        }
        else{
            throw new IllegalArgumentException("Unsupported format");
        }
    }
}
