package com.example.forLibrary.library;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Transactional
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Publisher {
    @Id
    @SequenceGenerator(name = "publisher_sequence",
            sequenceName = "publisher_sequence",
            allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "publisher_sequence")
    private Long id;
    private String publisherName;
}
