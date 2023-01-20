package operatorylogiczne.dekompozycja;

class CoursesPlatform {
    public static void main(String[] args) {

        Cathegory cathegory1 = new Cathegory("Programming", "Best programming tutorials online");
        Course course1 = new Course("Java", 5400, cathegory1, 199);
        Course course2 = new Course("Android", 3600, cathegory1, 149);
        Cathegory cathegory2 = new Cathegory("Self development", "Learn how to cecome the best version of yourself today");
        Course course3 = new Course("Fast reading", 2200, cathegory2, 139);

        System.out.println("There are 3 courses in our database:");
        course1.printoutCourse();
        course2.printoutCourse();
        course3.printoutCourse();

        System.out.println("Special offer! Buy 3 courses and save 10%");
        double totalPrice = course1.price + course2.price + course3.price;
        double discountPrice = totalPrice * 0.9;
        System.out.printf("  > Price after discount: %.2fzl (before: %.2fzl)", discountPrice, totalPrice);
    }
}