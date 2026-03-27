package edu.immune.sw.pattern;

import edu.immune.sw.pattern.singleton.impl.EagerSingleton;
import edu.immune.sw.pattern.singleton.impl.LazySingleton;
import edu.immune.sw.pattern.singleton.impl.StaticBlockSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SingletonTest {

	@Test
	public void lazySingleton() {
		LazySingleton s = LazySingleton.getInstance();
		LazySingleton sl = LazySingleton.getInstance();

		Assertions.assertEquals(s, sl);
	}

	@Test
	void eagerSingletonException() {
		assertThrows(ExceptionInInitializerError.class, () -> {
			EagerSingleton singleton = EagerSingleton.getInstance();
		});
	}

	public static void main(String[] args) {
		try {
			EagerSingleton singleton = EagerSingleton.getInstance();
		} catch(ExceptionInInitializerError e) {}
		System.out.println("hello world!");
	}

	@Test()
	public void staticBlockSingletonException() {
		StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
		Assertions.assertNull(singleton);
	}
}
