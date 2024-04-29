import java.time.LocalDate;

public class BaseClass <T> {
    private T id;
    private LocalDate createDate;
    private LocalDate updateDate;
    private LocalDate deleteDate;
    public BaseClass(){

    }
    public BaseClass(T id){
        this.id = id;
    }
    public T getId() {
        return id;
    }
    public void setId(T id) {
        this.id = id;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDate getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(LocalDate deleteDate) {
        this.deleteDate = deleteDate;
    }
}
