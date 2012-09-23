package be.dhs.springmvc.controller;

//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import be.dhs.flavor.music.Artist;
//import be.dhs.persistence.service.CreatorServiceImpl;
//import be.dhs.persistence.service.CreatorServiceMongoDB;
//import be.dhs.rest.Resource;
//
////@Controller
////@RequestMapping("/artists/*")
////public class ArtistController extends BaseController<Resource<Artist>>{
////
////	@Autowired
////	private CreatorServiceMongoDB artistService;
////
////	@RequestMapping(consumes="application/json", produces="application/json", method=RequestMethod.POST, value="/")
////	public ResponseEntity<Resource<Artist>> dynamicTest(@RequestBody Artist artist){
////		artistService.create(artist);
////		Resource<Artist> resource = new Resource<Artist>(artist);
////		return new ResponseEntity<Resource<Artist>>(resource,HttpStatus.CREATED);
////	}	
////
////	@RequestMapping(consumes="application/json", produces="application/json", method=RequestMethod.GET, value="/{id}")
////	public ResponseEntity<Resource<Artist>> getOrder(@PathVariable("id") String id){
////		Artist artist = (Artist) artistService.findAll().get(Integer.valueOf(id));
////		Resource<Artist> resource = new Resource<Artist>(artist);
////		return new ResponseEntity<Resource<Artist>>(resource,HttpStatus.OK);
////	}
////
////	@RequestMapping(consumes="application/json", produces="application/json", method=RequestMethod.PUT, value="/{id}")
////	public ResponseEntity<Resource<Order>> update(@RequestBody Order order){
////		order = orderService.update(order);
////		Resource<Order> resource = new Resource<Order>(order);
////		return new ResponseEntity<Resource<Order>>(resource,HttpStatus.NO_CONTENT);
////	}
//
//	@Override
//	public ResponseEntity<Resource<Artist>> describe(HttpServletRequest request) {
//		//TODO describe this resource links
//		return null;
//	}
//
//
//
//
//}
