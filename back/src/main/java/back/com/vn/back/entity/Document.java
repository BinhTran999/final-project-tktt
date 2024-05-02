package back.com.vn.back.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Document extends AllEntity {

    @Column(name = "name")
    private String name;

    @Column (name = "author")
    private String author;

    @Column (name = "date")
    private Date date;



}
