import com.example.Nonik.Entity.Product;
import com.example.Nonik.model.Response;
import com.example.Nonik.service.ProductService;
import org.springframework.beans.factory.annotation.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
  @Autowired
  private ProductService productService;

  @GetMapping(
    path = "/api/products",
    consumes = MediaType.ALL_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  
  public Response<List><Product>>getProductsHandler() {
    var products =  productService.getAllProducts();
    return Response.<List><Product>>builder().data(products).build();
  }
}
