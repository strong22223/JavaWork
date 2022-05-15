package Seven_InputOutput;

import java.io.File;
import java.util.Date;
public class RenameFile {
    private static void fileData(File f) {
        System.out.println("Absolute path: " + f.getAbsolutePath()
                + "\n Can read: " + f.canRead() + "\n Can write: " + f.canWrite()
                + "\n getName: " + f.getName() + "\n getParent: " + f.getParent()
                + "\n getPath: " + f.getPath() + "\n length: " + f.length()
                + "\n lastModified: " + new Date(f.lastModified()));
        if (f.isFile())  System.out.println("It's a file");
        else    System.out.println("It's a directory");
    }
    public static void main(String[] args) {
        File old = new File("D:\\WorkDoxc\\xd_javawork");

//        File rname = new File( "file2.txt");
//        System.out.println("The original file's information: ");
//        fileData(old);
//        old.renameTo(rname);
//        System.out.println("\n The file information after rename: ");
//        fileData(rname);
//        if (!rname.exists())
//            System.out.println("\n The original file never exists");
    }
}
