
import java.util.ArrayList;
import java.util.List;
public class catalog {
    private List<Category> categories;
    public catalog() {
        categories = new ArrayList<>();
    }
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
    public List<Category> getCategories() {
        return categories;
    }
    public void addCategory(Category category) {
        categories.add(category);
    }
    public void showItems() {
        for (Category category : categories) {
            category.showItem();
        }
    }
}
