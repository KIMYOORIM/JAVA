import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//스트림에서의 가장 중요한 개념 : 파일의 끝을 모른다는 것. 따라서 while문을 돌린다. 언제 끝날지 모르기 때문에.


public class Main {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		String file = "";

		try {
			in = new FileInputStream(file);
			out = new FileOutputStream("");

			while (true) {
				//in.read()가 파일의 끝에 경우 -1 반환?
				int data = in.read();
				if (data == -1) {
					break;
				}
				out.write(data);
			} // end while
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
				}
			}
		}//end finally
	}//main
}
