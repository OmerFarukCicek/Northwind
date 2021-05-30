package kodlamaio.northwind.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductWithCategoryDto {
	private int id;
	private String categoryName;
	private String productName;
	
	
}
