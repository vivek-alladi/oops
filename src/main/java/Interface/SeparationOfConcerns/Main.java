package Interface.SeparationOfConcerns;


interface DataSource {
    String getData();
}

class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public String getData() {
        return "data from file source";
    }
}

class DatabaseDataSource implements DataSource {
    private String url;
    private String username;
    private String password;

    public DatabaseDataSource(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public String getData() {
        return "data from database source";
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Separation of Concerns");

        FileDataSource filedata = new FileDataSource("filedata");
        DatabaseDataSource databaseDataSource = new DatabaseDataSource("url", "user", "pass");

        filedata.getData();
        databaseDataSource.getData();
    }
}
