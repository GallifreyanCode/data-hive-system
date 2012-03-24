package be.dhs.flavour.music.mongo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.dhs.flavour.music.mongo.Artist;
import be.dhs.persistence.mongo.service.abs.MongoAbstractCreatorService;

@Service
@Transactional
public class MongoArtistService extends MongoAbstractCreatorService<Artist> {

}
