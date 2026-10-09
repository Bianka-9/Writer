/*
* File: Writer.java
* Author: Nagy Bianka
* Copyright: 2026, Nagy Bianka
* Group: Szoft II/N
* Date: 2026-10-09
* Github: https://github.com/Bianka-9/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Writable {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void writeContent(String content) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
