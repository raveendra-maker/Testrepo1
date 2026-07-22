package day;

public class GarbageCollection {

	public static void main(String[] args) {
	//Garbage Collection in Java is the JVM’s way of automatically 
	//cleaning up unused objects to keep memory efficient and applications running smoothly.
    //Garbage Collection in Java is the automatic process by which the JVM 
	//reclaims memory from objects that are no longer in use, preventing memory leaks 
	//and optimizing performance. It runs in the background, freeing heap space by removing 
	//unreachable objects
			
		String str = new String("Hello");
        str = null; // Object becomes unreachable
        System.gc(); // Suggests garbage collection


	}

}
