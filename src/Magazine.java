public class Magazine extends LibraryItem{
    int issueNum;

    public Magazine(String title, int issueNum) {
        super(title);
        this.issueNum = issueNum;
    }

    @Override
    void printInfo(){
        System.out.println("Magazine "+title+", number "+issueNum);
    }
}
