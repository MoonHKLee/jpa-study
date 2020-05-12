package moon.jpastudy.Domain;

import lombok.Getter;
import lombok.Setter;
import moon.jpastudy.Domain.Item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("M")
@Getter @Setter
public class Movie extends Item {

    private String director;

    private String actor;
}
