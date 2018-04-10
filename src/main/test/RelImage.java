public class RelImage implements Image {

    private  String fileName;
    public RelImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);

    }
    @Override
    public void display() {
        System.out.println("displaying--"+fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("loading--"+fileName);
    }
}
