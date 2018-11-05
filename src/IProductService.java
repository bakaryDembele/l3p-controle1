import java.util.List;

public interface IProductService {

       void add(ProductDTO product);

       void update(ProductDTO product);

       void remove(String id);

       ProductDTO get(String id);

       List<ProductDTO> getAll();

   }