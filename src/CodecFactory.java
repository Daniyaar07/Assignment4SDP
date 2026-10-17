public class CodecFactory {
    public String getCodec(String format){
        if(format.equals("mp3")){
            return "mp3 codec";
        }
        else if(format.equals("mp4")){
            return "mp4 codec";
        }
        else {
            throw new IllegalArgumentException("Unsupported format");
        }
    }
}
