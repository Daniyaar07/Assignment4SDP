
public class MediaConversionFacade {
    private MetadataReader metadata = new MetadataReader();
    private CodecFactory codec = new CodecFactory();
    private BitrateReader bitrate = new BitrateReader();
    private AudioMixer mixer = new AudioMixer();

    public void convert(String fileName , String targetFormat){
        String sourceFormat = metadata.getFormat(fileName);
        String selectedCodec = codec.getCodec(targetFormat);
        int selectedBitrate= bitrate.getBitrate(targetFormat);
        String result = mixer.mixAudio(fileName , selectedBitrate);

        String output= fileName.substring(0 , fileName.lastIndexOf(".")) + "." + targetFormat;

        System.out.println();
        System.out.println("Converting: " + fileName + " -> " + output);
        System.out.println();
        System.out.println("Source format:" + sourceFormat);
        System.out.println("Codec: " + selectedCodec);
        System.out.println("Bitrate:" + selectedBitrate + "kbps");
        System.out.println(result);
        System.out.println("Output: " + output);
        System.out.println("Conversion completed");
        System.out.println("================================");
    }
}
