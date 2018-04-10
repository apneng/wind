public class ProxyImage implements Image {
    private RelImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RelImage(fileName);
        }
        realImage.display();

    }
}
