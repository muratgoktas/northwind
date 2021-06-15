package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="categories")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernatLazyInitializer","hendler","products"})
// sonsuz liste gelmesini engellemek için @JsonIgnoreProperties yapıyoruz.
public class Category {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private int catogeryId;
	
	@Column(name="category_name")
	private String catecoryName; 
	
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	// Ana tablodan diğer tabloya geçiş. Product ana tablo..
}
