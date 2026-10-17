public class Main {
    public static void main(String[] args){
        MediaConversionFacade facade = new MediaConversionFacade();
        try{
            facade.convert("video.mp4" , "mp3");
            facade.convert("video.mp4" , "avi");
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
