public class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxSize);

        arr.inset("Alam", "Shafat", 24);
        arr.inset("Ove", "Tanvir", 37);
        arr.inset("Ahmed", "Hasan", 43);
        arr.inset("Talukdar", "Rajon", 63);
        arr.inset("Hasan", "Tahkik", 21);
        arr.inset("Chowdhury", "Shadid", 29);
        arr.inset("Doe", "John", 72);
        arr.inset("Zukarber", "Mark", 54);
        arr.inset("Zoo", "Spec", 22);
        arr.inset("Nation", "Specter", 18);

        arr.displayA();
        String searchKey = "Alam";
        Person found;
        found = arr.find(searchKey);
        if(found != null)
            {
                System.out.print("Found ");
                found.displayPerson();
            }
        else
            System.out.println("Can't find " + searchKey);
        
        System.out.println("Deleting Zoo, Zukarber and Doe");
        arr.delete("Zoo");
        arr.delete("Zukarber");
        arr.delete("Doe");

        arr.displayA();
    }
}
