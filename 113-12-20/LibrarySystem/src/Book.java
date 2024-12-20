public class Book implements Borrowable {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author){
        this.title = title;
        this.title = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public boolean isBorrowed(){
        return isBorrowed;
    }
    public void borrow(){
        if (!isBorrowed){
            isBorrowed =true;
            System.out.println("您已歸還"+title +"作者" +author);
        }
        else {
            System.out.println(title + "此書未被借閱");
        }
    }

    @Override
    public void returnItem(){
        if(isBorrowed){
            isBorrowed = false;
            System.out.println("您已歸還" + title + "作者" + author);
        }
        else {
            System.out.println(title + "此書為被借閱");
        }
    }


    @Override
    public String toString(){
        return "書名:"+title + "作者:"+author + "狀態:" + (isBorrowed ? "已借出" : "可以借閱");
    }
}



