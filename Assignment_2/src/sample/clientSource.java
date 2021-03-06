// Agilan Ampigaipathar (100553054)

package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

//Observable list for client files
public class clientSource {
    public static ObservableList<TestFile> files = FXCollections.observableArrayList();

    public static void setFiles(String filename) {
        files.add(new TestFile(filename));
    }

    public static ObservableList getFiles(){return files;}
}

