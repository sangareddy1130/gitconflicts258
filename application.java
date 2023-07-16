public class GFG {
    public static void main(String[] args)
    {
        try {
            FileWriter Writer
                = new FileWriter("myfile.txt");
            Writer.write(
                "Files in Java are seriously good!!");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

# feature201 added by john

public class GFG {
    public static void main(String[] args)
    {
        try {
            FileWriter Writer
                = new FileWriter("myfile.txt");
            Writer.write(
                "Files in Java are seriously good!!");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

feauture added by ana

public class GFG {
    public static void main(String[] args)
    {
        File Obj = new File("myfile.txt");
        if (Obj.delete()) {
            System.out.println("The deleted file is : "
                               + Obj.getName());
        }
        else {
            System.out.println(
                "Failed in deleting the file.");
        }
    }
}
