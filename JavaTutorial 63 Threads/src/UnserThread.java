
public class UnserThread implements Runnable {				//Thread muss immer das Interface "Runnable" implementieren.

	@Override
	public void run() {										//Die überschriebene Methode "run" ist quasi die "main" Methode des Threads.
		long l = 0;
		long anfang = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			for (int k = 0; k < 1000000000; k++) {
				l++;
			}
			System.out.println("Berechne! " + i + "%");
		}
		System.out.println("Fertig!");
		long ende = System.currentTimeMillis();
		long zeit = ende - anfang;
		System.out.println(zeit * Math.pow(10, -3));
	}
}
