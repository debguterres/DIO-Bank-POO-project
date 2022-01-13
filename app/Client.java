package app;

public class Client {

    private Integer id;

    private String name;

    private String document;

    public Client() {
    }

    public Client(Integer id, String name, String document) {
        this.id = id;
        this.name = name;
        this.document = document;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Client id(Integer id) {
        setId(id);
        return this;
    }

    public Client name(String name) {
        setName(name);
        return this;
    }

    public Client document(String document) {
        setDocument(document);
        return this;
    }

}