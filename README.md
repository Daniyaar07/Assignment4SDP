# Media Conversion System

## Description
This project demonstrates the Facade Design Pattern in Java.
It simulates converting media files from MP4 to MP3.

## Classes
- Main - runs the program.
- MetadataReader - reads the file format.
- CodecFactory - selects the codec.
- BitrateReader - selects the bitrate.
- AudioMixer - checks audio quality.
- MediaConversionFacade - connects all classes.

## How It Works
The Main class calls the convert() method.
The Facade manages all subsystem classes.

## Error Handling
The program handles unsupported file formats.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Use JDK 17.
3. Run Main.java.