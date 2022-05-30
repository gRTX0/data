package database.spring.data.Utils

import javax.swing.text.html.parser.Entity

interface Mapper<D, E> {
    fun fromEntity(entity: E): D
    fun toEntity(domain: D): E
}