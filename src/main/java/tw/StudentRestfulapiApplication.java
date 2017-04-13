package tw;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class StudentRestfulapiApplication {

	public static void main(String[] args) {
		init();
		SpringApplication.run(StudentRestfulapiApplication.class, args);
	}

	public static void init() {
		try {
			Server h2Server = Server.createTcpServer().start();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
