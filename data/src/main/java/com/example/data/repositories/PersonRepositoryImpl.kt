package com.example.data.repositories

import com.example.domain.entity.Person
import com.example.domain.entity.PersonSearch
import com.example.domain.entity.Student
import com.example.domain.entity.StudentSearch
import com.example.domain.repositories.PersonRepository
import com.example.domain.repositories.StudentRepository
import io.reactivex.Completable
import io.reactivex.Observable
import java.util.*

class PersonRepositoryImpl() : PersonRepository {
    var list: List<Person>

    init {
        list = listOf<Person>(
                Person("http://ezine.kungfumagazine.com/images/ezine/0706_Spiderman-Maquire.jpg", "Peter", "Parker", true),
                Person("https://www.film.ru/sites/default/files/filefield_paths/the-hulk-thanos.jpg", "Robert", "Banner", true),
                Person("https://www.superheldenfilme.net/wp-content/uploads/2017/10/doctorstrangeeindoctorstrange2wirdsehrsicherkommen.jpg", "Stephen", "Strange", true),
                Person("https://www.zonanegativa.com/imagenes/2016/04/Iron_Man-600x251.jpg", "Tony", "Stark", true),
                Person("https://nerdist.com/wp-content/uploads/2016/03/Batman-Christian-Bale.jpg", "Bruce", "Wayne", true),
                Person("https://cdn.images.express.co.uk/img/dynamic/36/590x/Superman-cameo-revealed-for-Shazam-937873.jpg", "Clark", "Kent", true),
                Person("https://nerdist.com/wp-content/uploads/2018/08/WW84-Diana-Featured.jpg", "Diana", "Prince", false),
                Person("http://s24195.pcdn.co/wp-content/uploads/2017/11/ls60mj4ry60rrjlt06h1.jpg", "Selina", "Kyle", false),
                Person("https://i.ytimg.com/vi/Nh6ZRy0nekA/maxresdefault.jpg", "Natalia", "Romanova", false),
                Person("https://24smi.org/public/media/news/2017/10/13/aAETSb6LAVlI_film-flesh-aktery-i-roli.jpg", "Barry", "Allen",true))
    }


    override fun getRandomEntity(): Person {
        var random: Random = java.util.Random()
        return list.get(random.nextInt(list.size - 0))
    }

    override fun get(): Observable<List<Person>> {
        return Observable.just(list)
    }

    override fun search(search: PersonSearch): Observable<List<Person>> {
        val listShort = listOf<Person>(Person("http://samaposebe.com/sites/default/files/userfiles/1/image/2011/pets/parrot_240.jpg", "LLLHH", "lllee",false),
                Person("http://nashi-kroliki.com/images/pictures/drugie/16.jpg", "KKK", "kkkaa",true))
        return Observable.just(listShort)
    }


    override fun update(person: Person): Completable {
        return Completable.complete()
    }

    override fun delete(studentId: String): Completable {
        return Completable.complete()
    }
}