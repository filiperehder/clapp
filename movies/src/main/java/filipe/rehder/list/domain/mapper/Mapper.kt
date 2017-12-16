package filipe.rehder.list.domain.mapper

/**
 * Created by Filipe on 15/12/2017.
 */
interface Mapper<E, R> {

    fun mapFromEntity(entity: E): R
    fun mapToEntity(response: R): E

}