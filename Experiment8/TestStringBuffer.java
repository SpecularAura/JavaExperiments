class TestStringBuffer
{
	public static void main(String args[])
	{
		StringBuffer stb = new StringBuffer("Hi There");
		StringBuffer stb2 = new StringBuffer("Hi Java Hi There");
		System.out.println("Capacity Before trimming: " + stb.capacity());
		System.out.println("Length Before trimming: " + stb.length());
		stb.trimToSize();
		System.out.println("Capacity After trimming, before ensureCapaity(): " + stb.capacity());
		System.out.println("Length After trimming, before ensureCapacity(): " + stb.length());
		stb.ensureCapacity(30);
		System.out.println("Capacity after ensureCapaity(), before setLength(): " + stb.capacity());
		System.out.println("Length after ensureCapacity(), before setLength(): " + stb.length());
		int length = stb.length();
		stb.setLength(32);
		System.out.println("Capacity after setLength(): " + stb.capacity());
		System.out.println("Length after setLength(): " + stb.length());
		stb.setLength(length);
		System.out.println("Deleting First Hi from stb: " + stb.delete(stb.indexOf("Hi"), stb.indexOf("Hi") + "Hi".length()));
		int indexOfThere = stb.indexOf("There");
		System.out.println("Before: " + stb + "\nDeleting char \'T\' from stb: " + stb.deleteCharAt(indexOfThere));
		stb.setCharAt(indexOfThere, 'T');
		System.out.println("Adding \'T\' back to stb: " + stb);
		System.out.println("Replacing There with Java in stb: " + stb.replace(indexOfThere, indexOfThere + "There".length(), "Java"));
		System.out.println("Inserting Hi at the start of stb: " + stb.insert(0, "Hi"));
		System.out.println("Appending Hi There to stb" + stb.append("Hi There"));
		System.out.println("Comparing stb with stb2: " + stb.compareTo(stb2));
		System.out.println("Substring of the stb with portion after last Hi removed: " + stb.substring(stb.lastIndexOf("Hi", stb.length() - 1)));
		System.out.println("Reverese of stb2: " + stb2.reverse());
		System.out.println("Finally:\nstb: "+stb +"\nstb2: " + stb2);

	}
}