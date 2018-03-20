package Com.Jalasoft.Search.Model;

import java.util.Date;

public class Asset {
    private String path;
    private String name;
    private String type;
    private String contains;
    private Double size;
    private Date dateAccess;
    private Date dateModification;
    private Date dateCreation;

    public void Asset(String path, String name, String type, String contains, Double size, Date dateAccess, Date dateModification, Date dateCreation){
        this.path = path;
        this.name = name;
        this.type = type;
        this.contains = contains;
        this.size = size;
        this.dateAccess = dateAccess;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getSize() {
        return size;
    }

    public String getContains() {
        return contains;
    }

    public Date getDateAccess() {
        return dateAccess;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }

    public void setDateAccess(Date dateAccess) {
        this.dateAccess = dateAccess;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }
}
