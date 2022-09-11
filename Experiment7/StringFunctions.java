//charAt__                replaceFirst
//                        split
//                        startsWith__
//compareTo__             substring
//compareToIgnoreCase__   toCharArray
//concat                toLowerCase__
//contains              toUpperCase__
//contentEquals         trim
//copyValueOf           valueOf
//endsWith__
//indexOf__
//isEmpty__
//lastIndexOf__
//length__
//replace__
//replaceAll__



class StringFunctions {
    public static void main(String args[])
    {
        //String str1 = new String("Hello World!");
        String str2 = new String("DYOTAK is Best");
        String lorem = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi. Nulla quis sem at nibh elementum imperdiet. Duis sagittis ipsum. Praesent mauris. Fusce nec tellus sed augue semper porta. Mauris massa. Vestibulum lacinia arcu eget nulla. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur sodales ligula in libero. Sed dignissim lacinia nunc. Curabitur tortor. Pellentesque nibh. Aenean quam. In scelerisque sem at dolor. Maecenas mattis. Sed convallis tristique sem. Proin ut ligula vel nunc egestas porttitor. Morbi lectus risus, iaculis vel, suscipit quis, luctus non, massa. Fusce ac turpis quis ligula lacinia aliquet. Mauris ipsum. Nulla metus metus, ullamcorper vel, tincidunt sed, euismod in, nibh. Quisque volutpat condimentum velit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nam nec ante. Sed lacinia, urna non tincidunt mattis, tortor neque adipiscing diam, a cursus ipsum ante quis turpis. Nulla facilisi. Ut fringilla. Suspendisse potenti. Nunc feugiat mi a tellus consequat imperdiet. Vestibulum sapien. Proin quam. Etiam ultrices. Suspendisse in justo eu magna luctus suscipit. Sed lectus. Integer euismod lacus luctus magna. Quisque cursus, metus vitae pharetra auctor, sem massa mattis sem, at interdum magna augue eget diam. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Morbi lacinia molestie dui. Praesent blandit dolor. Sed non quam. In vel mi sit amet augue congue elementum. Morbi in ipsum sit amet pede facilisis laoreet. Donec lacus nunc, viverra nec.");
        // System.out.println("The length of the string is: "+ str1.length());
        // System.out.println(str2.replace('D','k'));
        // System.out.println(str2.replace("DYO","DUCK"));
        // System.out.println(str2.toLowerCase());
        // System.out.println("Index of is: " +str2.indexOf("is"));
        System.out.println(str2.startsWith("Dy"));
        System.out.println(str2.endsWith("st"));
        System.out.println(str2.replace("DYO","DUCK").toUpperCase());
        System.out.println(str2.compareToIgnoreCase(str2.toUpperCase()));
        System.out.println(str2.contains("DUCK"));
        System.out.println(str2.replace("DYO", "DUCK").contains("DUCK"));
        System.out.println("".isEmpty());
        System.out.println(lorem.toLowerCase().lastIndexOf("qui"));
    }
}
