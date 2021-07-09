package kodlamaio.northwind.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "genders")

public class Gender {

	@Id
	@Column(name = "person_id")
	private int person_id;

	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Person person;

	@Column(name = "genderName")
	private String genderName;
}
