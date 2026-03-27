package edu.immune.sw.pattern.observer.auction.model;

public class ArticleOnSale {

	private String name;
	private String description;
	private String imageUrl;

	public ArticleOnSale() {
	}

	public ArticleOnSale(Article article) {
		this.name = article.getName();
		this.description = article.getDescription();
		this.imageUrl = article.getImageUrl();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleOnSale [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append("]");
		return builder.toString();
	}

}
