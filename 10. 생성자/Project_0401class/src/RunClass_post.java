
public class RunClass_post {
	public static void main(String[] args) {
		Post post = new Post();
		post.insertPost();

		System.out.println("" + post.title + "," + post.description + "," + post.createDate);

	}
}
