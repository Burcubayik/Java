package interfaces;

public class Utils {
	//ara� class�
	public static void runLoggers(Logger[] loggers,String message) {//static belle�e atma i�ini yapar
		for(Logger logger: loggers) {
			logger.log(message);
			
		}
	}

}
