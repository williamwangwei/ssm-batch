import java.io.IOException;

public class TestRunable {

	
	public static void main(String[] args) {
		Runtime runtime= Runtime.getRuntime();
		try {
			//执行系统脚本程序
			runtime.exec("11");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
