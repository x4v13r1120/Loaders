import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ResourceParser {
    String PATH = ".src/data/";
    //default path for files and other data
    /**
      The loading procedures - Load data then Process it for cleaning (remove nulls & lowercase)
      Load(File) = main loading procedure
      Load() = if default file is used (calls load(file) internally)

      @param file - file to write to
     */
    List load(String file);
    List load() throws FileNotFoundException;
    void clean();



    /** Standard search methods = search for one item or return all */
    List selectAllEntries();
    List selectSpecificEntry(String searchCriteria);


    /** If we update the data we will either want to overwrite it or write to a new file
        Again - file is main write process; () call main process internally to use default

        @param file - file to write to
     */
    void insertNewEntries(String file);
    void insertNewEntries()throws IOException;
    void updateEntries(String file);
    void updateEntries() throws IOException;

}
