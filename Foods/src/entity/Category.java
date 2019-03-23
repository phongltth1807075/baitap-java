package entity;

public class Category {
    private String CategoryId;
    private String CategoryName;
    private String CategoryDateAt;

    public Category(String categoryId, String categoryName, String categoryDateAt) {
        CategoryId = categoryId;
        CategoryName = categoryName;
        CategoryDateAt = categoryDateAt;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategoryDate() {
        return CategoryDateAt;
    }

    public void setCategoryDate(String categoryDate) {
        CategoryDateAt = categoryDate;
    }
}
