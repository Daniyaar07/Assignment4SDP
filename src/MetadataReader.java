public class MetadataReader {
    public String getFormat(String fileName){
        int dot= fileName.lastIndexOf(".");
        if(dot== -1 || dot == fileName.length()-1) {
            throw new IllegalArgumentException("File has no format");
        }
        return fileName.substring(dot + 1).toLowerCase();
    }
}
