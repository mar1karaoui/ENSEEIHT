package Compression;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class CompressionUtils {

    // Compresser des données
    public static byte[] compress(byte[] data, int offset, int length) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (GZIPOutputStream gzip = new GZIPOutputStream(bos)) {
            gzip.write(data, offset, length);
        }
        return bos.toByteArray();
    }

    // Décompresser des données
    public static byte[] decompress(byte[] compressedData) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(compressedData);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (GZIPInputStream gzip = new GZIPInputStream(bis)) {  
            byte[] buffer = new byte[compressedData.length];
            gzip.read(buffer);
            bos.write(buffer);
        }
        return bos.toByteArray();
    }
}