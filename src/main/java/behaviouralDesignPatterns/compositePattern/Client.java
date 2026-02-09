package behaviouralDesignPatterns.compositePattern;

public class Client {

    public static void main (String[] args){
        //composite pattern

        File file1 = new File("Text.txt", 1);
        File file2 = new File("Pdf.pdf",2);

        Folder folder= new Folder("Docs");

        folder.addComponents(file1);
        folder.addComponents(file2);

        Folder newFolder = new Folder("newFolder");
        File file3= new File("Img.jpg", 3);
        newFolder.addComponents(file3);
        newFolder.addComponents(folder);

        newFolder.getDetails();
    }

}
