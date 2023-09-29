package javaeight.forEach;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class DummyFile {
    int id ;
    String content;

    public DummyFile(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
class ForEachFileWrite{
    public static void main(String[] args) {
        ForEachFileWrite forEachFileWrite = new ForEachFileWrite();
        forEachFileWrite.save(Paths.get("H:\\test"),createDummyFiles());

    }
    private void save(Path path, List<DummyFile> dummyFiles) {
        if (!Files.isDirectory(path)){
            throw new IllegalArgumentException("Path must be a directory");
        }
        saveFile(path, dummyFiles);

    }

    private void saveFile(Path path, List<DummyFile> dummyFiles) {
        dummyFiles.forEach(f -> {
            String fileName=f.getId()+".txt";
            try {
                Files.write(path.resolve(fileName),
                        f.getContent().getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public static List<DummyFile> createDummyFiles() {
        return Arrays.asList(
                new DummyFile(1, "hello"),
                new DummyFile(2, "world"),
                new DummyFile(3, "java"));
    }
}
