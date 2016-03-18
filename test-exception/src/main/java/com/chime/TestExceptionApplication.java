package com.chime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestExceptionApplication {

	static void callException() throws MyException {

		throw new MyException();
	}

	public static void main(String[] args) {
		SpringApplication.run(TestExceptionApplication.class, args);

		try {
			callException();

		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("시스템 종료.");
		}

	}
}
