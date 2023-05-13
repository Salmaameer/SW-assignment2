
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
   public void showProductsInCategory(String categoryName) {
        for (Category category : categories) {
            if (category.getName().equals(categoryName)) {
                for (Product product : category.getProducts()) {
                    System.out.println(product.getName() + " - $" + product.getPrice());
                }
                return;
            }
        }
      
    }
}
