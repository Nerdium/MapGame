package game.market;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* IMPORTANT
 * Getting timestamp from the system machine is very risky, as it can easily be manipulated and is different between clients.
 * This should only be temporary until server-client communication is setup.
 */

public class Timestamp {
	private String time;
	
	public Timestamp() {
		time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now());
	}
	
	public String toString() {
		return time;
	};
}
