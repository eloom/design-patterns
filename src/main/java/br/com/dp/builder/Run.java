package br.com.dp.builder;

public class Run {

	public static void main(String[] args) {
		Post post = GenericBuilder.of(Post::new)
									.with(Post::setTitle, "Java Builder Pattern")
									.with(Post::setText, "Explaining how to implement the Builder Pattern in Java")
									.with(Post::setCategory, "Programming")
									.build();

		System.out.println(post);
	}

}